<template>
  <b-container class="mt-4">
    <b-row>
      <b-col></b-col>
      <b-col cols="8">
        <b-jumbotron>
          <template #header><h3>회원가입</h3></template>

          <template #lead>회원가입 페이지입니다.</template>

          <hr class="my-4" />

          <b-container class="mt-4">
            <b-row>
              <b-col cols="2"></b-col>
              <b-col cols="2" align-self="end">사진</b-col>
              <b-col cols="4" align-self="start">
                <p id="upicture"><img v-bind:src="selectedFile" /></p>
                <!--이미지 미리보기-->
                <input type="file" @change="onFileSelected" />
              </b-col>
              <b-col cols="2"></b-col>
            </b-row>
            <b-row>
              <b-col cols="2"></b-col>
              <b-col cols="2" align-self="end">아이디</b-col
              ><b-col cols="4" align-self="start">
                <input type="text" name="uid" v-model="user.uid" required />
              </b-col>
              <b-col cols="2"></b-col>
            </b-row>
            <b-row>
              <b-col cols="2"></b-col>
              <b-col cols="2" align-self="end">비밀번호</b-col
              ><b-col cols="4" align-self="start">
                <input type="password" name="upw" v-model="user.upw" required />
              </b-col>
              <b-col cols="2"></b-col>
            </b-row>
            <b-row>
              <b-col cols="2"></b-col>
              <b-col cols="2" align-self="end">비밀번호 확인</b-col
              ><b-col cols="4" align-self="start">
                <input type="password" name="upw_check" required />
              </b-col>
              <b-col cols="2"></b-col>
            </b-row>
            <b-row>
              <b-col cols="2"></b-col>
              <b-col cols="2" align-self="end">이름</b-col
              ><b-col cols="4" align-self="start">
                <input type="text" name="uname" v-model="user.uname" required />
              </b-col>
              <b-col cols="2"></b-col>
            </b-row>
            <b-row>
              <b-col cols="2"></b-col>
              <b-col cols="2" align-self="end">이메일</b-col
              ><b-col cols="4" align-self="start"
                ><input
                  type="email"
                  name="uemail"
                  v-model="user.uemail"
                  required
              /></b-col>
              <b-col cols="2"></b-col>
            </b-row>
            <b-row>
              <b-col cols="2"></b-col>
              <b-col cols="2" align-self="end">주소</b-col
              ><b-col cols="4" align-self="start"
                ><input
                  type="text"
                  name="uaddress"
                  v-model="user.uaddress"
                  required
              /></b-col>
              <b-col cols="2"></b-col>
            </b-row>
          </b-container>
          <hr class="my-4" />
          <b-button variant="primary" href="#" class="mr-1" @click="upload"
            >파일업로드</b-button
          >
          <b-button variant="primary" href="#" class="mr-1" @click="join"
            >가입하기</b-button
          >
        </b-jumbotron>
      </b-col>
      <b-col></b-col>
    </b-row>
  </b-container>
</template>

<script>
import axios from "axios";

const SERVER_URL = process.env.VUE_APP_SERVER_URL;

export default {
  data() {
    return {
      selectedFile: "",
      user: {
        upicture: "",
        uid: "",
        upw: "",
        uname: "",
        uemail: "",
        uaddress: "",
      },
      upw_check: "",
    };
  },
  methods: {
    onFileSelected(e) {
      this.selectedFile = e.target.files[0];
    },

    upload() {
      const fd = new FormData();
      fd.append("image", this.selectedFile);
      console.log(this.selectedFile);

      axios
        .post(`${SERVER_URL}/user/confirm/upload`, fd, {
          headers: { "Content-Type": "multipart/form-data" },
        })
        .then(() => {})
        .catch(() => {});
    },

    join() {
      axios
        .post(`${SERVER_URL}/user/confirm/join`, this.user) //회원 가입해주고
        .then(() => {
          alert("회원가입이 완료되었습니다.");
          this.$router.replace(`/${this.nextRoute}`);
        })
        .catch((ex) => {
          alert("axios error" + ex);
        });
    },
  },
};
</script>

<style>
#upicture > img {
  width: 100px;
  height: 100px;
}
</style>