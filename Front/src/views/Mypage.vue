<template>
  <div>
      <mypage-nav></mypage-nav>
    <router-view></router-view>
  </div>
</template>

<script>
import MypageNav from "@/components/mypage/MypageNav.vue";

export default {
  components: { MypageNav }
};
</script>

<style>

</style>