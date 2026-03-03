<script setup lang="ts">
import { ref, onMounted } from 'vue'
import {
  ArrowLeft,
  Save,
  Package,
  Tag,
  DollarSign,
  BarChart3,
  Image as ImageIcon,
  Plus,
  X,
  CheckCircle2,
  AlertCircle,
} from 'lucide-vue-next'
import { useSaleStore, type Product } from '@/stores/saleStore'
import { useAdminNavigation } from '@/composables/useAdminNavigation'
import { Loader } from '@/utils/Loader'
import { Toast } from '@/utils/Toast'

const saleStore = useSaleStore()
const { navigate } = useAdminNavigation()

const errors = ref<Record<string, string>>({})

const isEdit = !!saleStore.editProduct
const initialData = saleStore.editProduct
  ? { ...saleStore.editProduct }
  : {
      id: undefined as number | undefined,
      name: '',
      description: '',
      price: 0,
      purchase_price: 0,
      stock: 0,
      category_ids: [] as number[],
      images: [] as string[],
      status: 'available' as const,
    }

const formData = ref(initialData)
const selectedCategories = ref<number[]>(formData.value.category_ids || [])

// Gallery mockup
const galleryMock = ref<string[]>(formData.value.images || [])

const goBack = () => {
  saleStore.editProduct = null
  navigate('products')
}

const toggleCategory = (id: number) => {
  const index = selectedCategories.value.indexOf(id)
  if (index > -1) {
    selectedCategories.value.splice(index, 1)
  } else {
    selectedCategories.value.push(id)
  }
}

const validateForm = () => {
  errors.value = {}
  let isValid = true

  if (!formData.value.name.trim()) {
    errors.value.name = 'El nombre es obligatorio'
    isValid = false
  }

  if (formData.value.price <= 0) {
    errors.value.price = 'El precio debe ser mayor a 0'
    isValid = false
  }

  if (!isValid) {
    Toast.warning('Completa los campos obligatorios')
  }

  return isValid
}

const saveProduct = async () => {
  if (!validateForm()) return

  Loader.show(isEdit ? 'Guardando cambios...' : 'Creando producto...')

  try {
    const payload = {
      ...formData.value,
      category_ids: selectedCategories.value,
    }

    let result
    if (isEdit) {
      result = await saleStore.updateProduct(payload as Product)
    } else {
      result = await saleStore.createProduct(payload as Partial<Product>)
    }

    if (result.success) {
      Toast.success(isEdit ? 'Producto actualizado' : 'Producto creado con éxito')
      goBack()
    } else {
      Toast.error(result.message || 'Error al guardar')
    }
  } catch (error: any) {
    Toast.error('Error de red o servidor')
  } finally {
    Loader.hide()
  }
}

onMounted(async () => {
  if (saleStore.categories.length === 0) {
    await saleStore.fetchInitialData()
  }
})
</script>

<template>
  <div class="p-6 max-w-5xl mx-auto space-y-8 animate-in fade-in duration-500">
    <!-- Header Navigation -->
    <div
      class="flex items-center justify-between sticky top-0 bg-slate-50/80 backdrop-blur-md z-20 py-4 -mx-6 px-6"
    >
      <div class="flex items-center gap-4">
        <button
          @click="goBack"
          class="p-2.5 rounded-2xl bg-white border border-slate-200 text-slate-500 hover:text-slate-900 hover:border-slate-300 hover:shadow-sm transition-all"
        >
          <ArrowLeft :size="20" />
        </button>
        <div>
          <h2 class="text-2xl font-black text-slate-900 tracking-tight">
            {{ isEdit ? 'Editar Producto' : 'Nuevo Producto' }}
          </h2>
          <p class="text-xs font-bold text-slate-400 uppercase tracking-widest">
            {{ isEdit ? 'ID: ' + formData.id : 'Completar los detalles' }}
          </p>
        </div>
      </div>

      <button
        @click="saveProduct"
        class="bg-orange-500 hover:bg-orange-600 text-white px-6 py-3 rounded-2xl font-black text-sm shadow-xl shadow-orange-500/20 active:scale-95 transition-all flex items-center gap-2"
      >
        <Save :size="18" />
        {{ isEdit ? 'Actualizar' : 'Publicar Producto' }}
      </button>
    </div>

    <div class="grid grid-cols-1 lg:grid-cols-3 gap-8">
      <!-- Left Column: Main Data -->
      <div class="lg:col-span-2 space-y-8">
        <!-- General Info Card -->
        <section class="bg-white p-8 rounded-[2rem] border border-slate-100 shadow-sm space-y-6">
          <div class="flex items-center gap-3 mb-2">
            <div
              class="w-10 h-10 rounded-xl bg-orange-50 text-orange-500 flex items-center justify-center"
            >
              <Package :size="20" />
            </div>
            <h3 class="text-lg font-black text-slate-800">Información General</h3>
          </div>

          <div class="space-y-4">
            <div class="space-y-1.5">
              <label class="text-[10px] font-black text-slate-400 uppercase tracking-wider ml-1">
                Nombre del producto <span class="text-red-500">*</span>
              </label>
              <input
                v-model="formData.name"
                type="text"
                placeholder="Ej. Pizza Margarita, Hamburguesa Especial..."
                class="w-full px-5 py-4 bg-slate-50 border rounded-2xl focus:ring-4 focus:ring-orange-500/10 focus:border-orange-500/50 outline-none text-base font-medium transition-all"
                :class="errors.name ? 'border-red-500 bg-red-50/50' : 'border-slate-100'"
              />
              <p
                v-if="errors.name"
                class="text-[10px] font-bold text-red-500 mt-1 ml-1 animate-in fade-in slide-in-from-top-1"
              >
                {{ errors.name }}
              </p>
            </div>

            <div class="space-y-1.5">
              <label class="text-[10px] font-black text-slate-400 uppercase tracking-wider ml-1"
                >Descripción corta</label
              >
              <textarea
                v-model="formData.description"
                rows="3"
                placeholder="Describe los ingredientes o detalles relevantes..."
                class="w-full px-5 py-4 bg-slate-50 border border-slate-100 rounded-2xl focus:ring-4 focus:ring-orange-500/10 focus:border-orange-500/50 outline-none text-base font-medium transition-all resize-none"
              ></textarea>
            </div>
          </div>
        </section>

        <!-- Categories Selection -->
        <section class="bg-white p-8 rounded-[2rem] border border-slate-100 shadow-sm space-y-6">
          <div class="flex items-center gap-3 mb-2">
            <div
              class="w-10 h-10 rounded-xl bg-blue-50 text-blue-500 flex items-center justify-center"
            >
              <Tag :size="20" />
            </div>
            <h3 class="text-lg font-black text-slate-800">Categorías</h3>
          </div>

          <div class="grid grid-cols-2 md:grid-cols-3 gap-3">
            <button
              v-for="cat in saleStore.categories"
              :key="cat.id"
              @click="toggleCategory(cat.id)"
              class="p-4 rounded-2xl border-2 transition-all flex flex-col items-center gap-2 group"
              :class="
                selectedCategories.includes(cat.id)
                  ? 'bg-blue-50 border-blue-200'
                  : 'bg-slate-50 border-transparent hover:border-slate-200'
              "
            >
              <span class="text-2xl">{{ cat.icon }}</span>
              <span
                class="text-xs font-bold"
                :class="selectedCategories.includes(cat.id) ? 'text-blue-600' : 'text-slate-500'"
              >
                {{ cat.name }}
              </span>
              <div
                v-if="selectedCategories.includes(cat.id)"
                class="absolute top-2 right-2 text-blue-500"
              >
                <CheckCircle2 :size="14" />
              </div>
            </button>
          </div>
        </section>

        <!-- Gallery Front mockup -->
        <section class="bg-white p-8 rounded-[2rem] border border-slate-100 shadow-sm space-y-6">
          <div class="flex items-center gap-3 mb-2">
            <div
              class="w-10 h-10 rounded-xl bg-purple-50 text-purple-500 flex items-center justify-center"
            >
              <ImageIcon :size="20" />
            </div>
            <h3 class="text-lg font-black text-slate-800">Galería de Imágenes</h3>
          </div>

          <div class="grid grid-cols-2 md:grid-cols-4 gap-4">
            <div
              v-for="(img, idx) in galleryMock"
              :key="idx"
              class="relative aspect-square rounded-2xl bg-slate-100 overflow-hidden group border border-slate-100"
            >
              <img :src="img" class="w-full h-full object-cover" />
              <button
                class="absolute top-2 right-2 p-1 bg-white/80 backdrop-blur-sm rounded-lg text-red-500 opacity-0 group-hover:opacity-100 transition-opacity"
              >
                <X :size="14" />
              </button>
            </div>

            <button
              class="aspect-square rounded-2xl border-2 border-dashed border-slate-200 flex flex-col items-center justify-center gap-2 text-slate-400 hover:border-purple-300 hover:text-purple-500 hover:bg-purple-50 transition-all cursor-not-allowed"
            >
              <Plus :size="24" />
              <span class="text-[10px] font-black uppercase tracking-wider">Subir</span>
              <span class="text-[8px] font-bold opacity-50 uppercase text-center"
                >(Próximamente)</span
              >
            </button>
          </div>
        </section>
      </div>

      <!-- Right Column: Business Data -->
      <div class="space-y-8">
        <!-- Pricing Card -->
        <section
          class="bg-white p-8 rounded-[2rem] border border-slate-100 shadow-sm space-y-6 overflow-hidden relative"
        >
          <div class="absolute top-0 right-0 p-8 text-slate-50 -mr-4 -mt-4">
            <DollarSign :size="80" stroke-width="1" />
          </div>

          <div class="flex items-center gap-3 mb-2 relative">
            <div
              class="w-10 h-10 rounded-xl bg-emerald-50 text-emerald-500 flex items-center justify-center"
            >
              <DollarSign :size="20" />
            </div>
            <h3 class="text-lg font-black text-slate-800">Finanzas</h3>
          </div>

          <div class="space-y-5 relative">
            <div class="space-y-1.5">
              <label class="text-[10px] font-black text-slate-400 uppercase tracking-wider ml-1">
                Precio de Venta <span class="text-red-500">*</span>
              </label>
              <div class="relative">
                <span class="absolute left-4 top-1/2 -translate-y-1/2 font-black text-slate-400"
                  >$</span
                >
                <input
                  v-model="formData.price"
                  type="number"
                  step="0.01"
                  class="w-full pl-8 pr-5 py-4 bg-slate-50 border rounded-2xl focus:ring-4 focus:ring-emerald-500/10 focus:border-emerald-500/50 outline-none text-xl font-black text-slate-800 transition-all"
                  :class="errors.price ? 'border-red-500 bg-red-50/50' : 'border-slate-100'"
                />
              </div>
              <p
                v-if="errors.price"
                class="text-[10px] font-bold text-red-500 mt-1 ml-1 animate-in fade-in slide-in-from-top-1"
              >
                {{ errors.price }}
              </p>
            </div>

            <div class="space-y-1.5">
              <label class="text-[10px] font-black text-slate-400 uppercase tracking-wider ml-1"
                >Precio de Compra</label
              >
              <div class="relative">
                <span class="absolute left-4 top-1/2 -translate-y-1/2 font-black text-slate-400"
                  >$</span
                >
                <input
                  v-model="formData.purchase_price"
                  type="number"
                  step="0.01"
                  class="w-full pl-8 pr-5 py-4 bg-slate-50 border border-slate-100 rounded-2xl focus:ring-4 focus:ring-slate-500/10 focus:border-slate-500/50 outline-none text-base font-bold text-slate-600 transition-all"
                />
              </div>
            </div>

            <div class="pt-2">
              <div
                class="bg-emerald-50 p-4 rounded-xl flex items-center justify-between border border-emerald-100/50"
              >
                <span class="text-xs font-black text-emerald-600 uppercase">Margen Est.</span>
                <span class="text-lg font-black text-emerald-700">
                  ${{ (formData.price - (formData.purchase_price || 0)).toFixed(2) }}
                </span>
              </div>
            </div>
          </div>
        </section>

        <!-- Inventory Card -->
        <section class="bg-white p-8 rounded-[2rem] border border-slate-100 shadow-sm space-y-6">
          <div class="flex items-center gap-3 mb-2">
            <div
              class="w-10 h-10 rounded-xl bg-slate-900 text-white flex items-center justify-center"
            >
              <BarChart3 :size="20" />
            </div>
            <h3 class="text-lg font-black text-slate-800">Inventario</h3>
          </div>

          <div class="space-y-5">
            <div class="space-y-1.5">
              <label class="text-[10px] font-black text-slate-400 uppercase tracking-wider ml-1"
                >Stock Actual</label
              >
              <input
                v-model="formData.stock"
                type="number"
                class="w-full px-5 py-4 bg-slate-50 border border-slate-100 rounded-2xl focus:ring-4 focus:ring-slate-900/10 focus:border-slate-900/50 outline-none text-xl font-black text-slate-800 transition-all"
              />
            </div>

            <div class="flex items-center gap-4 pt-2">
              <button
                @click="formData.status = 'available'"
                class="flex-1 py-3 rounded-xl border-2 text-xs font-black uppercase tracking-widest transition-all"
                :class="
                  formData.status === 'available'
                    ? 'bg-slate-900 border-slate-900 text-white shadow-lg'
                    : 'bg-white border-slate-100 text-slate-400'
                "
              >
                Activo
              </button>
              <button
                @click="formData.status = 'hidden'"
                class="flex-1 py-3 rounded-xl border-2 text-xs font-black uppercase tracking-widest transition-all"
                :class="
                  formData.status === 'hidden'
                    ? 'bg-red-500 border-red-500 text-white shadow-lg'
                    : 'bg-white border-slate-100 text-slate-400'
                "
              >
                Oculto
              </button>
            </div>
          </div>
        </section>

        <!-- Help Info -->
        <div class="p-6 bg-orange-50/50 rounded-2xl border border-orange-100 space-y-2">
          <div class="flex items-center gap-2 text-orange-600">
            <AlertCircle :size="16" />
            <h4 class="text-xs font-black uppercase">Consejo</h4>
          </div>
          <p class="text-[10px] font-medium text-orange-700 leading-relaxed">
            Asegúrate de asignar al menos una categoría para que el producto aparezca correctamente
            en la caja del vendedor.
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
input[type='number']::-webkit-inner-spin-button,
input[type='number']::-webkit-outer-spin-button {
  -webkit-appearance: none;
  margin: 0;
}
</style>
