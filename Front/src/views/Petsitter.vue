<template>
  <div>
      <petsitter-nav></petsitter-nav>
      <router-view></router-view>
  </div>
</template>

<script>
import PetsitterNav from "@/components/petsitter/PetsitterNav.vue"
export default {
    components: { PetsitterNav }
}
</script>

<style>

</style>