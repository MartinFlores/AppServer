<script setup lang="ts">
import { ref } from 'vue'
import VueApexCharts from 'vue3-apexcharts'
import type { ApexOptions } from 'apexcharts'
import {
  Gem,
  Receipt,
  Users,
  Store,
  RefreshCcw,
  ArrowUpRight,
  ArrowDownRight,
  MoreVertical,
  Award,
} from 'lucide-vue-next'

// Mock Data for KPI Cards
const kpiData = [
  {
    title: 'Gemas generadas este mes',
    value: '945',
    variation: '+12.5%',
    isPositive: true,
    icon: Gem,
    color: 'text-blue-600',
    bgColor: 'bg-blue-50',
  },
  // {
  //   title: 'Gemas generadas',
  //   value: '982',
  //   variation: '+8.2%',
  //   isPositive: true,
  //   icon: Gem,
  //   color: 'text-indigo-600',
  //   bgColor: 'bg-indigo-50',
  // },
  {
    title: 'Total de canjes',
    value: '184',
    variation: '+5.4%',
    isPositive: true,
    icon: Receipt,
    color: 'text-emerald-600',
    bgColor: 'bg-emerald-50',
  },
  {
    title: 'Usuarios activos',
    value: '842',
    variation: '+15.3%',
    isPositive: true,
    icon: Users,
    color: 'text-purple-600',
    bgColor: 'bg-purple-50',
  },
  // {
  //   title: 'Comercios afiliados',
  //   value: '58',
  //   variation: '+2',
  //   isPositive: true,
  //   icon: Store,
  //   color: 'text-orange-600',
  //   bgColor: 'bg-orange-50',
  // },
  // {
  //   title: 'Tasa de recompra',
  //   value: '37%',
  //   variation: '-1.2%',
  //   isPositive: false,
  //   icon: RefreshCcw,
  //   color: 'text-pink-600',
  //   bgColor: 'bg-pink-50',
  // },
]

// Charts Configuration
const lineChartOptions: ApexOptions = {
  chart: {
    id: 'gems-daily',
    toolbar: { show: false },
    fontFamily: 'Inter, sans-serif',
  },
  stroke: {
    curve: 'smooth' as const,
    width: 3,
  },
  colors: ['#3b82f6'],
  fill: {
    type: 'gradient',
    gradient: {
      shadeIntensity: 1,
      opacityFrom: 0.45,
      opacityTo: 0.05,
      stops: [50, 100],
    },
  },
  xaxis: {
    categories: ['Lun', 'Mar', 'Mié', 'Jue', 'Vie', 'Sáb', 'Dom'],
    axisBorder: { show: false },
    axisTicks: { show: false },
  },
  yaxis: {
    labels: {
      formatter: (val: number) => val.toLocaleString(),
    },
  },
  grid: {
    borderColor: '#f1f5f9',
    strokeDashArray: 4,
  },
  dataLabels: { enabled: false },
}

const lineChartSeries = [
  {
    name: 'Gemas',
    data: [120, 180, 150, 220, 195, 250, 270],
  },
]

const barChartOptions: ApexOptions = {
  chart: {
    id: 'top-products',
    toolbar: { show: false },
    fontFamily: 'Inter, sans-serif',
  },
  plotOptions: {
    bar: {
      borderRadius: 6,
      horizontal: true,
      barHeight: '60%',
      distributed: true,
    },
  },
  colors: [
    '#3b82f6',
    '#6366f1',
    '#8b5cf6',
    '#a855f7',
    '#d946ef',
    '#ec4899',
    '#f43f5e',
    '#ef4444',
    '#f97316',
    '#f59e0b',
  ],
  xaxis: {
    categories: [
      'Orden de Tacos al Pastor',
      'Gringa de Asada',
      'Taco Campechano',
      'Quesadilla con Carne',
      'Refresco 600ml',
      'Orden de Cebollitas',
      'Agua de Horchata Grande',
      'Taco de Lengua',
      'Combo Familiar',
      'Postre de la Casa',
    ],
    labels: {
      formatter: (val: number) => val.toLocaleString(),
    },
  },
  grid: {
    borderColor: '#f1f5f9',
    strokeDashArray: 4,
    xaxis: { lines: { show: true } },
    yaxis: { lines: { show: false } },
  },
  dataLabels: { enabled: false },
  legend: { show: false },
}

const barChartSeries = [
  {
    name: 'Canjes',
    data: [450, 380, 320, 290, 275, 240, 210, 195, 180, 150],
  },
]

const areaChartOptions: ApexOptions = {
  chart: {
    id: 'redemptions-daily',
    toolbar: { show: false },
    fontFamily: 'Inter, sans-serif',
  },
  stroke: {
    curve: 'smooth' as const,
    width: 2,
  },
  colors: ['#10b981'],
  fill: {
    type: 'gradient',
    gradient: {
      shadeIntensity: 1,
      opacityFrom: 0.45,
      opacityTo: 0.05,
      stops: [50, 100],
    },
  },
  xaxis: {
    categories: ['Lun', 'Mar', 'Mié', 'Jue', 'Vie', 'Sáb', 'Dom'],
    axisBorder: { show: false },
    axisTicks: { show: false },
  },
  grid: {
    borderColor: '#f1f5f9',
    strokeDashArray: 4,
  },
  dataLabels: { enabled: false },
}

const areaChartSeries = [
  {
    name: 'Canjes',
    data: [45, 62, 58, 89, 75, 110, 125],
  },
]

// Ranking Data
const topUsers = [
  {
    rank: 1,
    name: 'Alejandro Rivera',
    gems: 85,
    lastMove: 'Hace 5 min',
    avatar: 'AR',
    isVIP: true,
  },
  {
    rank: 2,
    name: 'Sofía Martínez',
    gems: 72,
    lastMove: 'Hace 12 min',
    avatar: 'SM',
    isVIP: true,
  },
  {
    rank: 3,
    name: 'Carlos Mendoza',
    gems: 68,
    lastMove: 'Hace 45 min',
    avatar: 'CM',
    isVIP: true,
  },
  {
    rank: 4,
    name: 'Lucía Fernández',
    gems: 54,
    lastMove: 'Hace 1h',
    avatar: 'LF',
    isVIP: false,
  },
  { rank: 5, name: 'Roberto Gómez', gems: 49, lastMove: 'Ayer', avatar: 'RG', isVIP: false },
  { rank: 6, name: 'Elena Torres', gems: 42, lastMove: 'Ayer', avatar: 'ET', isVIP: false },
  { rank: 7, name: 'Daniel Silva', gems: 38, lastMove: 'Ayer', avatar: 'DS', isVIP: false },
  {
    rank: 8,
    name: 'Mariana López',
    gems: 35,
    lastMove: 'Hace 2 días',
    avatar: 'ML',
    isVIP: false,
  },
  {
    rank: 9,
    name: 'Javier Ruíz',
    gems: 31,
    lastMove: 'Hace 2 días',
    avatar: 'JR',
    isVIP: false,
  },
  {
    rank: 10,
    name: 'Patricia Vega',
    gems: 28,
    lastMove: 'Hace 3 días',
    avatar: 'PV',
    isVIP: false,
  },
]
</script>

<template>
  <div class="flex-1 overflow-y-auto p-4 md:p-8 bg-slate-50/50">
    <!-- Header -->
    <header class="mb-6">
      <div class="flex items-center gap-3 mb-4">
        <span class="h-1 w-12 bg-orange-600 rounded-full"></span>
        <span class="text-orange-600 font-bold tracking-wider uppercase text-sm"
          >Panel ejecutivo</span
        >
      </div>
      <h1 class="text-4xl font-extrabold text-slate-900 mb-4 tracking-tight">TPremia</h1>
      <div class="flex items-center justify-between md:flex-row flex-col">
        <p class="text-slate-500 max-w-2xl text-lg leading-relaxed">
          Bienvenido al panel ejecutivo. Aquí podrás visualizar las métricas del programa de
          lealtad.
        </p>
      </div>
    </header>

    <!-- Section 1: KPI Cards -->
    <section class="mb-10">
      <div class="flex items-center justify-between mb-6">
        <h2 class="text-lg font-bold text-slate-800 flex items-center gap-2">
          Métricas Principales
        </h2>
        <!-- <span class="text-xs font-medium text-slate-400 uppercase tracking-wider"
          >Todo el Periodo</span
        > -->
      </div>

      <div class="grid grid-cols-3 md:grid-cols-3 lg:grid-cols-3 gap-4 md:gap-6">
        <div
          v-for="(kpi, index) in kpiData"
          :key="index"
          class="bg-white p-5 rounded-2xl border border-slate-200/60 shadow-sm hover:shadow-md transition-all duration-300 group"
        >
          <div class="flex justify-between items-start mb-4">
            <div
              :class="[kpi.bgColor, kpi.color]"
              class="p-2.5 rounded-xl transition-transform duration-300 group-hover:scale-110"
            >
              <component :is="kpi.icon" :size="24" />
            </div>
            <div
              :class="kpi.isPositive ? 'bg-emerald-50 text-emerald-600' : 'bg-red-50 text-red-600'"
              class="flex items-center gap-0.5 text-[10px] font-bold px-2 py-0.5 rounded-full"
            >
              <ArrowUpRight v-if="kpi.isPositive" :size="12" />
              <ArrowDownRight v-else :size="12" />
              {{ kpi.variation }}
            </div>
          </div>
          <div>
            <p class="text-2xl font-black text-slate-800 mb-1 tracking-tight">{{ kpi.value }}</p>
            <h4 class="text-slate-500 text-xs font-medium uppercase tracking-tight">
              {{ kpi.title }}
            </h4>
          </div>
        </div>
      </div>
    </section>

    <!-- Section 2: Charts -->
    <section class="mb-10">
      <h2 class="text-lg font-bold text-slate-800 mb-6 font-primary">Análisis de Rendimiento</h2>

      <div class="grid grid-cols-1 xl:grid-cols-2 gap-8">
        <!-- Gemas generadas por día -->
        <div class="bg-white p-6 rounded-2xl border border-slate-200/60 shadow-sm">
          <div class="flex justify-between items-center mb-6">
            <div>
              <h3 class="font-bold text-slate-800">Gemas generadas</h3>
              <p class="text-xs text-slate-500">Actividad de los últimos 7 días</p>
            </div>
            <div class="flex gap-1">
              <button class="p-1 hover:bg-slate-100 rounded text-slate-400">
                <MoreVertical :size="18" />
              </button>
            </div>
          </div>
          <div class="h-80">
            <VueApexCharts
              type="line"
              height="100%"
              :options="lineChartOptions"
              :series="lineChartSeries"
            />
          </div>
        </div>

        <!-- Top Establecimientos -->
        <div class="bg-white p-6 rounded-2xl border border-slate-200/60 shadow-sm">
          <div class="flex justify-between items-center mb-6">
            <div>
              <h3 class="font-bold text-slate-800">Top 10 Productos mas canjeados</h3>
              <p class="text-xs text-slate-500">Los productos con mayor cantidad de redenciones</p>
            </div>
            <Award class="text-orange-500" :size="20" />
          </div>
          <div class="h-80">
            <VueApexCharts
              type="bar"
              height="100%"
              :options="barChartOptions"
              :series="barChartSeries"
            />
          </div>
        </div>

        <!-- Canjes realizados -->
        <div class="bg-white p-6 rounded-2xl border border-slate-200/60 shadow-sm xl:col-span-2">
          <div class="flex justify-between items-center mb-6">
            <div>
              <h3 class="font-bold text-slate-800">Canjes Realizados</h3>
              <p class="text-xs text-slate-500">Volumen de gemas redimidas por día</p>
            </div>
            <div class="flex items-center gap-4">
              <div class="flex items-center gap-2">
                <span class="w-3 h-3 rounded-full bg-emerald-500"></span>
                <span class="text-xs font-semibold text-slate-600">Completados</span>
              </div>
            </div>
          </div>
          <div class="h-80">
            <VueApexCharts
              type="area"
              height="100%"
              :options="areaChartOptions"
              :series="areaChartSeries"
            />
          </div>
        </div>
      </div>
    </section>

    <!-- Section 3: Ranking Table -->
    <section>
      <div class="bg-white rounded-2xl border border-slate-200/60 shadow-sm overflow-hidden">
        <div class="p-6 border-b border-slate-100 flex items-center justify-between">
          <div>
            <h2 class="text-lg font-bold text-slate-800">Ranking de Usuarios</h2>
            <p class="text-sm text-slate-500">Usuarios con mayor acumulación de gemas</p>
          </div>
          <button
            class="text-sm font-semibold text-blue-600 px-4 py-2 bg-blue-50 rounded-lg hover:bg-blue-100 transition-colors"
          >
            Ver informe completo
          </button>
        </div>

        <div class="overflow-x-auto">
          <table class="w-full text-left">
            <thead>
              <tr
                class="bg-slate-50/50 text-xs font-bold text-slate-400 uppercase tracking-widest border-b border-slate-100"
              >
                <th class="px-6 py-4">Ranking</th>
                <th class="px-6 py-4">Usuario</th>
                <th class="px-6 py-4">Gemas Acumuladas</th>
                <th class="px-6 py-4">Último Movimiento</th>
                <th class="px-6 py-4 text-right">Acciones</th>
              </tr>
            </thead>
            <tbody class="divide-y divide-slate-50">
              <tr
                v-for="user in topUsers"
                :key="user.rank"
                class="hover:bg-slate-50/80 transition-all duration-200 group"
              >
                <td class="px-6 py-4">
                  <div
                    class="flex items-center justify-center w-8 h-8 rounded-full font-bold text-sm"
                    :class="
                      user.rank <= 3
                        ? 'bg-orange-100 text-orange-600'
                        : 'bg-slate-100 text-slate-500'
                    "
                  >
                    {{ user.rank }}
                  </div>
                </td>
                <td class="px-6 py-4">
                  <div class="flex items-center gap-3">
                    <div class="relative">
                      <div
                        class="w-10 h-10 rounded-full bg-gradient-to-br from-slate-200 to-slate-300 flex items-center justify-center font-bold text-slate-700 text-xs shadow-inner"
                      >
                        {{ user.avatar }}
                      </div>
                      <div
                        v-if="user.isVIP"
                        class="absolute -top-1 -right-1 bg-amber-400 text-white p-0.5 rounded-full shadow-sm border-2 border-white"
                      >
                        <Award :size="10" />
                      </div>
                    </div>
                    <div>
                      <div class="flex items-center gap-2">
                        <p class="font-bold text-slate-800">{{ user.name }}</p>
                        <span
                          v-if="user.isVIP"
                          class="px-1.5 py-0.5 bg-amber-100 text-amber-700 text-[10px] font-black rounded uppercase tracking-tighter"
                          >VIP</span
                        >
                      </div>
                      <p class="text-xs text-slate-400 font-medium">ID: {{ 1000 + user.rank }}</p>
                    </div>
                  </div>
                </td>
                <td class="px-6 py-4 font-black text-slate-700">
                  <div class="flex items-center gap-1.5">
                    <Gem :size="14" class="text-blue-500" />
                    {{ user.gems.toLocaleString() }}
                  </div>
                </td>
                <td class="px-6 py-4">
                  <span class="text-sm font-medium text-slate-500">{{ user.lastMove }}</span>
                </td>
                <td class="px-6 py-4 text-right">
                  <button
                    class="p-2 text-slate-400 hover:text-blue-600 hover:bg-blue-50 rounded-lg transition-colors opacity-0 group-hover:opacity-100"
                  >
                    <MoreVertical :size="18" />
                  </button>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </section>
  </div>
</template>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800;900&display=swap');

:deep(.apexcharts-canvas) {
  margin: 0 auto;
}

:deep(.apexcharts-tooltip) {
  border-radius: 12px !important;
  border: 1px solid #e2e8f0 !important;
  box-shadow: 0 10px 15px -3px rgb(0 0 0 / 0.1) !important;
}

.font-primary {
  font-family: 'Inter', sans-serif;
}
</style>
