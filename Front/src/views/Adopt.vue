<template>
  <div>
      <adopt-nav></adopt-nav>
      <router-view></router-view>
  </div>
</template>

<script>
import AdoptNav from "@/components/adopt/AdoptNav.vue"
export default {
    components: { AdoptNav }
}
</script>

<style>

</style>