import { defineStore } from 'pinia'
import { api } from '@/utils/axios'
import { useUserStore } from './userStore'
import { useShiftStore } from './shiftStore'

export interface Product {
  id: number
  category_id: number
  name: string
  description: string
  price: number
  image: string
  category_name?: string
}

export interface Category {
  id: number
  name: string
  icon: string
}

export interface CartItem extends Product {
  quantity: number
}

export const useSaleStore = defineStore('sale', {
  state: () => ({
    products: [] as Product[],
    categories: [] as Category[],
    cart: [] as CartItem[],
    isLoading: false,
    selectedCategoryId: null as number | null,
    searchQuery: '',
  }),

  getters: {
    filteredProducts: (state) => {
      return state.products.filter((p) => {
        const matchesCategory = state.selectedCategoryId
          ? p.category_id === state.selectedCategoryId
          : true
        const matchesSearch = p.name.toLowerCase().includes(state.searchQuery.toLowerCase())
        return matchesCategory && matchesSearch
      })
    },
    cartTotal: (state) => {
      return state.cart.reduce((total, item) => total + item.price * item.quantity, 0)
    },
    cartCount: (state) => {
      return state.cart.reduce((count, item) => count + item.quantity, 0)
    },
  },

  actions: {
    async fetchInitialData() {
      this.isLoading = true
      try {
        const [prodRes, catRes] = await Promise.all([
          api.get('products/all'),
          api.get('products/categories'),
        ])

        if (prodRes.data.status === 'ok') this.products = prodRes.data.data
        if (catRes.data.status === 'ok') this.categories = catRes.data.data
      } catch (error) {
        console.error('Error fetching sale data:', error)
      } finally {
        this.isLoading = false
      }
    },

    addToCart(product: Product) {
      const existing = this.cart.find((item) => item.id === product.id)
      if (existing) {
        existing.quantity++
      } else {
        this.cart.push({ ...product, quantity: 1 })
      }
    },

    removeFromCart(productId: number) {
      const item = this.cart.find((item) => item.id === productId)
      if (item) {
        if (item.quantity > 1) {
          item.quantity--
        } else {
          const index = this.cart.indexOf(item)
          if (index > -1) this.cart.splice(index, 1)
        }
      }
    },

    async placeOrder(customerName: string, payments: { payment_method: string; amount: number }[]) {
      const userStore = useUserStore()
      const shiftStore = useShiftStore()

      if (!userStore.user || !shiftStore.currentShift) {
        return { success: false, message: 'Sesión o turno no válido' }
      }

      const orderData = {
        user_id: userStore.user.id,
        shift_id: shiftStore.currentShift.id,
        customer_name: customerName,
        total: this.cartTotal,
        payment_method:
          payments.length > 0
            ? payments.length > 1
              ? 'Dividido'
              : payments[0]?.payment_method || 'Efectivo'
            : 'Pendiente',
        payments: payments,
        items: this.cart.map((item) => ({
          product_id: item.id,
          quantity: item.quantity,
          price: item.price,
          subtotal: item.price * item.quantity,
        })),
      }

      try {
        const response = await api.post('orders/create', orderData)
        if (response.data.status === 'ok') {
          this.clearCart()
          return { success: true, message: 'Venta realizada con éxito' }
        } else {
          return { success: false, message: response.data.message }
        }
      } catch (error: any) {
        return { success: false, message: error.message || 'Error al procesar la venta' }
      }
    },

    clearCart() {
      this.cart = []
    },
  },
})
