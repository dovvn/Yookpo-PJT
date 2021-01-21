import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);

const SERVER_URL = process.env.VUE_APP_SERVER_URL;

export default new Vuex.Store({
  state: {
    accessToken: null,
    uid: "",
    uname: ""
  },
  getters: {
    getAccessToken(state) { //현재 state가 가지고 있는 accessToken을 담아라
      return state.accessToken;
    },
    getUserId(state) {
      return state.uid;
    },
    getUserName(state) {
      return state.uname;
    }
  },
  mutations: {
    LOGIN(state, payload) { //payload = response.data
      state.accessToken = payload["auth-token"];
      state.uid = payload["uid"];
      state.uname = payload["uname"];
    },
    LOGOUT(state) {
      state.accessToken = null;
      state.uid = "";
      state.uname = "";
    },
    UPDATE(state, payload) { //payload = response.data
      state.accessToken = payload["auth-token"];
      state.uid = payload["uid"];
      state.uname = payload["uname"];
    },
  },
  actions: { //서버 전송
    LOGIN(context, user) {
      return axios
        .post(`${SERVER_URL}/user/confirm/login`, user)
        .then((response) => {
          if (response.data["message"] == "error") {
            alert("가입하지 않은 아이디이거나, 잘못된 비밀번호입니다.");
            return "error";
          }
          context.commit("LOGIN", response.data); //mutations 호출

          axios.defaults.headers.common[ //axios를 호출할때 header에 "auth-token"이름으로 토큰정보를 담아라
            "auth-token"
          ] = `${response.data["auth-token"]}`;
        });
    },
    LOGOUT(context) {
      context.commit("LOGOUT");
      axios.defaults.headers.common["auth-token"] = undefined;
    }
  },
  modules: {}
});
