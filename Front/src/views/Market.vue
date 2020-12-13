<template>
  <div>
      <market-nav></market-nav>
      <router-view></router-view>
  </div>
</template>

<script>
import MarketNav from "@/components/market/MarketNav.vue"
export default {
    components: { MarketNav }
}
</script>

<style>

</style>