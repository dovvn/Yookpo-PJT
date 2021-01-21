<template>
  <div id="app">
    <div>
      <b-navbar toggleable="sm" type="light" variant="light">
        <b-navbar-toggle target="nav-text-collapse"></b-navbar-toggle>

        <b-navbar-brand>
          <router-link to="/">YOOKPO</router-link>
        </b-navbar-brand>

        <b-collapse id="nav-text-collapse" is-nav>
          <b-navbar-nav>
            <router-link to="/adopt">입양하기</router-link> |
            <router-link to="/medical">의료정보</router-link> |
            <router-link to="/petsitter">펫시터 찾기</router-link> |
            <router-link to="/market">육포마켓</router-link>
          </b-navbar-nav>
          <!-- 로그인 여부에 따라 메뉴 달라지기  -->
          <!-- 로그아웃/마이페이지/장바구니 -->
          <b-navbar-nav class="ml-auto" v-if="getAccessToken">
            <!--토큰있으면-->
            <!-- 로그아웃은 세션 없애고 메인으로 -->
            <b-nav-item>
              {{ getUserName }}({{ getUserId }})님 환영합니다.
            </b-nav-item>
            <b-nav-item @click.prevent="onClickLogout">로그아웃</b-nav-item>
            <b-nav-item>
              <router-link to="/mypage/check">마이페이지</router-link>
            </b-nav-item>
            <b-nav-item>
              <router-link to="/basket">장바구니</router-link>
            </b-nav-item>
          </b-navbar-nav>
          <!-- 로그인/회원가입 -->
          <b-navbar-nav class="ml-auto" v-else>
            <b-nav-item>
              <router-link to="/login">로그인</router-link> |
            </b-nav-item>
            <b-nav-item>
              <router-link to="/join">회원가입</router-link>
            </b-nav-item>
          </b-navbar-nav>
        </b-collapse>
      </b-navbar>
    </div>
    <router-view />
    <!-- 푸터 -->
  </div>
</template>

<script>
//mapGetters 등록
import { mapGetters } from "vuex";

export default {
  data() {
    return {
      isLogin: false,
    };
  },
  computed: {
    ...mapGetters(["getAccessToken", "getUserId", "getUserName"]), //서버로 부터 토큰얻어옴
  },
  methods: {
    onClickLogout() {
      this.$store
        .dispatch("LOGOUT")
        .then(() => this.$router.replace("/").catch(() => {}));
    },
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
