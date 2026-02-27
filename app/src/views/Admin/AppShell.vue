<script setup lang="ts">
import { ref, computed, watch } from 'vue'
import { useAdminNavigation, type AdminView } from '@/composables/useAdminNavigation'

import Aside from '@/views/Admin/components/Aside.vue'
import Header from '@/views/Admin/components/Header.vue'
import Dashboard from '@/views/Admin/Dashboard/Dashboard.vue'
import Apps from '@/views/Admin/Apps/Apps.vue'
import Personal from '@/views/Admin/Personal/Personal.vue'
import Cashier from '@/views/Admin/Cashier/Cashier.vue'
import Printers from '@/views/Admin/Printers/Printers.vue'

const { currentView } = useAdminNavigation()
const mainContent = ref<HTMLElement | null>(null)

// Cada vez que cambie la vista, reseteamos el scroll al principio
watch(currentView, () => {
  if (mainContent.value) {
    mainContent.value.scrollTop = 0
  }
})

const viewMap: Partial<Record<AdminView, any>> = {
  dashboard: Dashboard,
  apps: Apps,
  staff: Personal,
  cashier: Cashier,
  printers: Printers,
}

const currentComponent = computed(() => viewMap[currentView.value] || Dashboard)

const asideOpen = ref(true)
</script>

<template>
  <div class="flex h-screen w-full overflow-hidden text-slate-800">
    <!-- ASIDE -->
    <Aside :open="asideOpen" @close="asideOpen = false" />

    <!-- MAIN -->
    <div class="flex-1 flex flex-col h-full overflow-hidden">
      <!-- HEADER -->
      <Header :current-view="currentView" @toggle-aside="asideOpen = !asideOpen" />

      <!-- CONTENIDO DINÁMICO -->
      <main ref="mainContent" class="flex-1 overflow-y-auto bg-slate-50 scroll-smooth">
        <component :is="currentComponent" />
      </main>
    </div>
  </div>
</template>
