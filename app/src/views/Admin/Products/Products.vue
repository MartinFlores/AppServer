<script setup lang="ts">
import { onMounted, ref, computed } from 'vue'
import {
  Package,
  Plus,
  Search,
  Filter,
  Edit2,
  Trash2,
  ExternalLink,
  ChevronRight,
  Tags,
  AlertTriangle,
  Layers,
  LayoutList,
  LayoutGrid,
} from 'lucide-vue-next'
import { useSaleStore, type Product } from '@/stores/saleStore'
import CategoryManagerModal from './CategoryManagerModal.vue'

const saleStore = useSaleStore()
const showCategoryModal = ref(false)
const searchQuery = ref('')
const selectedCategory = ref('null')
const viewMode = ref<'list' | 'grid'>(
  (localStorage.getItem('admin_products_view_mode') as 'list' | 'grid') || 'list',
)

const toggleViewMode = (mode: 'list' | 'grid') => {
  viewMode.value = mode
  localStorage.setItem('admin_products_view_mode', mode)
}

onMounted(async () => {
  await saleStore.fetchInitialData()
})

const stats = computed(() => [
  {
    label: 'Total Productos',
    value: saleStore.products.length,
    icon: Package,
    color: 'text-blue-700',
    bgColor: 'bg-blue-100/80',
  },
  {
    label: 'Categorías',
    value: saleStore.categories.length,
    icon: Tags,
    color: 'text-purple-700',
    bgColor: 'bg-purple-100/80',
  },
  {
    label: 'Bajo Stock',
    value: 0, // Mock for now
    icon: AlertTriangle,
    color: 'text-amber-700',
    bgColor: 'bg-amber-100/80',
  },
  {
    label: 'Activos',
    value: saleStore.products.length, // Mock for now
    icon: Layers,
    color: 'text-emerald-700',
    bgColor: 'bg-emerald-100/80',
  },
])

const filteredProducts = computed(() => {
  return saleStore.products.filter((p) => {
    const matchesSearch = p.name.toLowerCase().includes(searchQuery.value.toLowerCase())
    const matchesCategory =
      selectedCategory.value === 'null' || p.category_name === selectedCategory.value
    return matchesSearch && matchesCategory
  })
})

const formatPrice = (price: number) => {
  return new Intl.NumberFormat('es-MX', {
    style: 'currency',
    currency: 'MXN',
  }).format(price)
}
</script>

<template>
  <div class="flex-1 p-6 lg:p-8 space-y-8">
    <!-- Header Section -->
    <header class="flex flex-col md:flex-row md:items-center justify-between gap-4">
      <div>
        <div class="flex items-center gap-2 mb-1">
          <span class="h-1 w-8 bg-orange-500 rounded-full"></span>
          <span class="text-xs font-bold text-orange-600 uppercase tracking-wider">Productos</span>
        </div>
        <h1 class="text-3xl font-extrabold text-slate-900 tracking-tight">
          Productos y Categorías
        </h1>
        <p class="text-slate-500 mt-1">Administra tus productos, precios y existencias.</p>
      </div>

      <div class="flex items-center gap-3">
        <button
          @click="showCategoryModal = true"
          class="flex items-center gap-2 px-4 py-2.5 bg-white border border-slate-200 text-slate-700 font-semibold rounded-xl hover:bg-slate-50 transition-all active:scale-95 shadow-sm"
        >
          <Tags :size="18" />
          Gestionar Categorías
        </button>
        <button
          class="flex items-center gap-2 px-6 py-2.5 bg-slate-900 text-white font-bold rounded-xl hover:bg-slate-800 transition-all active:scale-95 shadow-lg shadow-slate-900/20"
        >
          <Plus :size="20" />
          Nuevo Producto
        </button>
      </div>
    </header>

    <!-- KPIs Grid -->
    <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4">
      <div
        v-for="stat in stats"
        :key="stat.label"
        class="bg-white p-4 rounded-2xl border border-slate-200 shadow-sm hover:shadow-md transition-all group flex items-center gap-4"
      >
        <div
          :class="[
            stat.bgColor,
            stat.color,
            'w-12 h-12 rounded-xl flex items-center justify-center transition-all group-hover:scale-110 duration-300 flex-shrink-0',
          ]"
        >
          <component :is="stat.icon" :size="22" />
        </div>
        <div class="flex-1 min-w-0">
          <p
            class="text-[10px] font-black text-slate-400 uppercase tracking-widest mb-0.5 truncate"
          >
            {{ stat.label }}
          </p>
          <h3 class="text-2xl font-black text-slate-900 leading-none tracking-tight">
            {{ stat.value }}
          </h3>
        </div>
        <div class="flex-shrink-0">
          <ChevronRight
            class="text-slate-300 group-hover:text-slate-500 transition-colors"
            :size="18"
          />
        </div>
      </div>
    </div>

    <!-- Table Section -->
    <div class="bg-white rounded-2xl border border-slate-200/60 shadow-sm overflow-hidden">
      <!-- Search & Filters -->
      <div class="p-4 border-b border-slate-100 flex flex-col md:flex-row gap-4 bg-slate-50/30">
        <div class="relative flex-1">
          <Search class="absolute left-3 top-1/2 -translate-y-1/2 text-slate-400" :size="18" />
          <input
            v-model="searchQuery"
            type="text"
            placeholder="Buscar por nombre, código o categoría..."
            class="w-full pl-10 pr-4 py-2 bg-white border border-slate-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-orange-500/20 focus:border-orange-500 transition-all text-sm"
          />
        </div>
        <div class="flex items-center gap-2">
          <div
            class="flex items-center gap-2 bg-white border border-slate-200 rounded-xl px-3 py-2"
          >
            <Filter :size="16" class="text-slate-400" />
            <select
              v-model="selectedCategory"
              class="bg-transparent text-sm font-medium text-slate-700 outline-none"
            >
              <option value="null">Todas las categorías</option>
              <option v-for="cat in saleStore.categories" :key="cat.id" :value="cat.name">
                {{ cat.name }}
              </option>
            </select>
          </div>

          <!-- View Toggle -->
          <div class="flex items-center bg-white border border-slate-200 rounded-xl p-1 shadow-sm">
            <button
              @click="toggleViewMode('list')"
              :class="[
                'p-1.5 rounded-lg transition-all',
                viewMode === 'list'
                  ? 'bg-slate-900 text-white shadow-md'
                  : 'text-slate-400 hover:text-slate-600 hover:bg-slate-100',
              ]"
              title="Vista de lista"
            >
              <LayoutList :size="18" />
            </button>
            <button
              @click="toggleViewMode('grid')"
              :class="[
                'p-1.5 rounded-lg transition-all',
                viewMode === 'grid'
                  ? 'bg-slate-900 text-white shadow-md'
                  : 'text-slate-400 hover:text-slate-600 hover:bg-slate-100',
              ]"
              title="Vista de cuadrícula"
            >
              <LayoutGrid :size="18" />
            </button>
          </div>
        </div>
      </div>

      <!-- List View Content -->
      <div v-if="viewMode === 'list'" class="overflow-x-auto">
        <table class="w-full text-left border-collapse">
          <thead>
            <tr
              class="text-[11px] uppercase tracking-wider text-slate-500 font-bold bg-slate-50/50 border-b border-slate-100"
            >
              <th class="px-6 py-4">Producto</th>
              <th class="px-6 py-4">Categoría</th>
              <th class="px-6 py-4">Precio</th>
              <th class="px-6 py-4">Estado</th>
              <th class="px-6 py-4 text-right">Acciones</th>
            </tr>
          </thead>
          <tbody class="divide-y divide-slate-100">
            <tr
              v-for="product in filteredProducts"
              :key="product.id"
              class="hover:bg-slate-50/80 transition-colors group"
            >
              <td class="px-6 py-4">
                <div class="flex items-center gap-4">
                  <div
                    class="w-12 h-12 rounded-xl bg-slate-100 overflow-hidden flex-shrink-0 border border-slate-200"
                  >
                    <img
                      v-if="product.image"
                      :src="product.image"
                      class="w-full h-full object-cover group-hover:scale-110 transition-transform duration-500"
                    />
                    <div
                      v-else
                      class="w-full h-full flex items-center justify-center text-slate-400"
                    >
                      <Package :size="20" />
                    </div>
                  </div>
                  <div>
                    <p class="text-sm font-bold text-slate-800">{{ product.name }}</p>
                    <p class="text-xs text-slate-500 truncate max-w-[200px]">
                      {{ product.description }}
                    </p>
                  </div>
                </div>
              </td>
              <td class="px-6 py-4">
                <span
                  class="px-2.5 py-1 rounded-lg bg-slate-100 text-slate-600 text-xs font-bold border border-slate-200"
                >
                  {{ product.category_name || 'Sin categoría' }}
                </span>
              </td>
              <td class="px-6 py-4">
                <span class="text-sm font-black text-slate-900">{{
                  formatPrice(product.price)
                }}</span>
              </td>
              <td class="px-6 py-4">
                <div class="flex items-center gap-2">
                  <span
                    class="w-2 h-2 rounded-full bg-emerald-500 shadow-[0_0_8px_rgba(16,185,129,0.4)]"
                  ></span>
                  <span class="text-xs font-semibold text-emerald-600">Activo</span>
                </div>
              </td>
              <td class="px-6 py-4 text-right">
                <div
                  class="flex items-center justify-end gap-1 opacity-10 md:opacity-0 group-hover:opacity-100 transition-opacity"
                >
                  <button
                    class="p-2 text-slate-500 hover:text-blue-600 hover:bg-blue-50 rounded-lg transition-all"
                    title="Ver detalles"
                  >
                    <ExternalLink :size="18" />
                  </button>
                  <button
                    class="p-2 text-slate-500 hover:text-orange-500 hover:bg-orange-50 rounded-lg transition-all"
                    title="Editar"
                  >
                    <Edit2 :size="18" />
                  </button>
                  <button
                    class="p-2 text-slate-400 hover:text-red-600 hover:bg-red-50 rounded-lg transition-all"
                    title="Eliminar"
                  >
                    <Trash2 :size="18" />
                  </button>
                </div>
              </td>
            </tr>

            <!-- Empty State Table -->
            <tr v-if="filteredProducts.length === 0">
              <td colspan="5" class="px-6 py-12 text-center">
                <div class="flex flex-col items-center max-w-xs mx-auto">
                  <div
                    class="w-16 h-16 bg-slate-50 rounded-full flex items-center justify-center mb-4"
                  >
                    <Search class="text-slate-300" :size="32" />
                  </div>
                  <h3 class="text-slate-900 font-bold mb-1">No se encontraron productos</h3>
                  <p class="text-slate-500 text-sm">
                    Intenta ajustar tus criterios de búsqueda o filtros.
                  </p>
                </div>
              </td>
            </tr>
          </tbody>
        </table>
      </div>

      <!-- Grid View Content -->
      <div v-else class="p-6">
        <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4 gap-6">
          <div
            v-for="product in filteredProducts"
            :key="product.id"
            class="group bg-white rounded-2xl border border-slate-200 shadow-sm hover:shadow-xl hover:border-orange-500/50 transition-all duration-300 overflow-hidden flex flex-col"
          >
            <!-- Image Container -->
            <div class="relative aspect-square overflow-hidden bg-slate-100">
              <img
                v-if="product.image"
                :src="product.image"
                class="w-full h-full object-cover group-hover:scale-110 transition-transform duration-700"
              />
              <div v-else class="w-full h-full flex items-center justify-center text-slate-400">
                <Package :size="48" stroke-width="1.5" />
              </div>

              <!-- Quick Actions Overlay -->
              <div
                class="absolute inset-0 bg-black/40 opacity-0 group-hover:opacity-100 transition-opacity duration-300 flex items-center justify-center gap-2"
              >
                <button
                  class="p-2.5 bg-white text-slate-900 rounded-xl hover:bg-orange-500 hover:text-white transition-colors shadow-lg"
                  title="Editar"
                >
                  <Edit2 :size="20" />
                </button>
                <button
                  class="p-2.5 bg-white text-slate-900 rounded-xl hover:bg-blue-500 hover:text-white transition-colors shadow-lg"
                  title="Ver detalles"
                >
                  <ExternalLink :size="20" />
                </button>
              </div>

              <!-- Category Badge -->
              <div class="absolute top-3 left-3">
                <span
                  class="px-2.5 py-1 rounded-lg bg-white/90 backdrop-blur-md text-slate-900 text-[10px] font-black uppercase tracking-wider shadow-sm border border-white/20"
                >
                  {{ product.category_name || 'Sin categoría' }}
                </span>
              </div>
            </div>

            <!-- Content -->
            <div class="p-4 flex-1 flex flex-col">
              <div class="flex justify-between items-start mb-2">
                <h3
                  class="text-sm font-bold text-slate-800 line-clamp-1 group-hover:text-orange-600 transition-colors"
                >
                  {{ product.name }}
                </h3>
                <span class="text-sm font-black text-slate-900">{{
                  formatPrice(product.price)
                }}</span>
              </div>
              <p class="text-xs text-slate-500 line-clamp-2 mb-4 flex-1">
                {{ product.description }}
              </p>

              <!-- Footer -->
              <div class="pt-4 border-t border-slate-100 flex items-center justify-between">
                <div class="flex items-center gap-1.5">
                  <span class="w-1.5 h-1.5 rounded-full bg-emerald-500"></span>
                  <span class="text-[10px] font-bold text-emerald-600 uppercase tracking-tight"
                    >Activo</span
                  >
                </div>
                <button
                  class="p-1.5 text-slate-400 hover:text-red-500 rounded-lg hover:bg-red-50 transition-colors"
                >
                  <Trash2 :size="16" />
                </button>
              </div>
            </div>
          </div>
        </div>

        <!-- Empty State Grid -->
        <div v-if="filteredProducts.length === 0" class="py-12 text-center">
          <div class="flex flex-col items-center max-w-xs mx-auto">
            <div class="w-16 h-16 bg-slate-50 rounded-full flex items-center justify-center mb-4">
              <Search class="text-slate-300" :size="32" />
            </div>
            <h3 class="text-slate-900 font-bold mb-1">No se encontraron productos</h3>
            <p class="text-slate-500 text-sm">
              Intenta ajustar tus criterios de búsqueda o filtros.
            </p>
          </div>
        </div>
      </div>

      <!-- Pagination Footer (Mock) -->
      <div
        class="px-6 py-4 border-t border-slate-100 flex items-center justify-between bg-slate-50/30"
      >
        <p class="text-xs font-medium text-slate-500">
          Mostrando {{ filteredProducts.length }} de {{ saleStore.products.length }} productos
        </p>
        <div class="flex items-center gap-2">
          <button
            class="px-3 py-1.5 text-xs font-bold text-slate-400 bg-white border border-slate-200 rounded-lg cursor-not-allowed"
          >
            Anterior
          </button>
          <button
            class="px-3 py-1.5 text-xs font-bold text-orange-600 bg-orange-50 border border-orange-100 rounded-lg hover:bg-orange-100 transition-colors"
          >
            Siguiente
          </button>
        </div>
      </div>
    </div>

    <!-- Modals -->
    <CategoryManagerModal :show="showCategoryModal" @close="showCategoryModal = false" />
  </div>
</template>

<style scoped>
/* Scrollbar styling for the table */
.overflow-x-auto::-webkit-scrollbar {
  height: 6px;
}
.overflow-x-auto::-webkit-scrollbar-track {
  background: transparent;
}
.overflow-x-auto::-webkit-scrollbar-thumb {
  background: #e2e8f0;
  border-radius: 10px;
}
.overflow-x-auto::-webkit-scrollbar-thumb:hover {
  background: #cbd5e1;
}
</style>
