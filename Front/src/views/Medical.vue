<template>
  <div>
    <medical-nav></medical-nav>
    <router-view></router-view>
  </div>
</template>

<script>
import MedicalNav from "@/components/medical/MedicalNav.vue";
export default {
    components: { MedicalNav }
}
</script>

<style>

</style>