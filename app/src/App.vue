<script setup lang="ts">
import { ref, computed, onMounted } from 'vue'
import SetupWizard from '@/views/Wizard/SetupWizard.vue'
import AdminApp from '@/views/Admin/AppShell.vue'
import KitchenApp from '@/views/Kitchen/KitchenApp.vue'
import CashierApp from '@/views/Cashier/AppShell.vue'
import WaiterApp from '@/views/Waiter/WaiterApp.vue'
import GlobalLoader from '@/components/GlobalLoader.vue'

type AppMode = 'loading' | 'wizard' | 'admin' | 'kitchen' | 'cashier' | 'waiter'

const appMode = ref<AppMode>('loading')

function detectModeFromURL(): AppMode {
  const params = window.location.search

  if (params.includes('kitchen')) return 'kitchen'
  if (params.includes('cashier')) return 'cashier'
  if (params.includes('waiter')) return 'waiter'
  if (params.includes('admin')) return 'admin'
  if (params.includes('wizard')) return 'wizard'

  return 'admin'
}

onMounted(() => {
  const isConfigured = localStorage.getItem('pos_config_status') === 'true'

  if (!isConfigured) {
    appMode.value = 'wizard'
    return
  }

  appMode.value = detectModeFromURL()
})

const currentComponent = computed(() => {
  switch (appMode.value) {
    case 'wizard':
      return SetupWizard
    case 'admin':
      return AdminApp
    case 'kitchen':
      return KitchenApp
    case 'cashier':
      return CashierApp
    case 'waiter':
      return WaiterApp
    default:
      return null
  }
})
</script>

<template>
  <component :is="currentComponent" />
  <GlobalLoader />
</template>
