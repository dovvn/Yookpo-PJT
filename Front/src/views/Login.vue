<template>
  <b-container class="bv-example-row">
    <b-row>
      <b-col></b-col>
      <b-col cols="8">
        <b-card
          class="mt-3"
          header="로그인"
          style="max-width: 40rem"
          align="left"
        >
          <b-form>
            <b-form-group label="아이디:" label-for="uid">
              <b-form-input
                id="uid"
                v-model="user.uid"
                required
                placeholder="아이디 입력...."
              ></b-form-input>
            </b-form-group>
            <b-form-group label="비밀번호:" label-for="upw">
              <b-form-input
                type="password"
                id="upw"
                v-model="user.upw"
                required
                placeholder="비밀번호 입력...."
                @keypress.enter="login"
              ></b-form-input>
            </b-form-group>
            <b-button type="button" variant="primary" class="m-1" @click="login"
              >로그인</b-button
            >
          </b-form>
        </b-card>
      </b-col>
      <b-col></b-col>
    </b-row>
  </b-container>
</template>

<script>
import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

export default {
  name: "Login",
  data: function () {
    return {
      user: {
        uid: "",
        upw: "",
      },
      message: "",
    };
  },
  computed: {
    nextRoute() {
      return this.$route.params.nextRoute ? this.$route.params.nextRoute : ""; //nextRoute가 있으면 그대로 씀
    },
  },
  methods: {
    login: function () {
      // LOGIN 액션 실행
      // 서버와 통신(axios)을 해 토큰값을 얻어야 하므로 Actions를 호출.
      this.$store //Vuex에 접근
        .dispatch("LOGIN", this.user) //아이디, 비번 서버로 전송해서 state에 넣기
        .then((message) => {
          if (message == "error") {
            //로그인 폼 비우기
            this.user.uid = "";
            this.user.upw = "";
            return;
          }
          this.$router.replace(`/${this.nextRoute}`);
        }) //홈으로
        .catch((message) => {
          this.message = message;
        });
    },
  },
};
</script>

<style scope>
#login-div {
  text-align: center;
}
</style>
