<template>
  <b-container class="mt-4">
    <b-row>
      <b-col></b-col>
      <b-col cols="8">
        <b-jumbotron>
          <template #header><h3>수정</h3></template>

          <template #lead>내 정보 수정 페이지입니다.</template>

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
                <input
                  type="text"
                  name="upicture"
                  v-model="user.uid"
                  readonly
                />
              </b-col>
              <b-col cols="2"></b-col>
            </b-row>
            <b-row>
              <b-col cols="2"></b-col>
              <b-col cols="2" align-self="end">변경할 비밀번호</b-col
              ><b-col cols="4" align-self="start">
                <input type="password" name="upw" v-model="user.upw" required />
              </b-col>
              <b-col cols="2"></b-col>
            </b-row>
            <b-row>
              <b-col cols="2"></b-col>
              <b-col cols="2" align-self="end">변경할 비밀번호 확인</b-col
              ><b-col cols="4" align-self="start">
                <input
                  type="password"
                  name="upw_check"
                  v-model="upw_check"
                  required
                />
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

          <b-button variant="primary" href="#" class="mr-1" @click="update"
            >수정하기</b-button
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
        upicture: this.$route.params.user.upicture,
        uid: this.$route.params.user.uid,
        upw: this.$route.params.user.upw,
        uname: this.$route.params.user.uname,
        uemail: this.$route.params.user.uemail,
        uaddress: this.$route.params.user.uaddress,
      },
      upw_check: "",
    };
  },
  methods: {
    onFileSelected(e) {
      this.selectedFile = e.target.files[0];
    },
    update() {
      //비밀번호 중복 체크
      if (this.user.upw != this.upw_check) {
        alert("비밀번호가 일치하지 않습니다.");
        return;
      }

      // const fd = new FormData();
      // fd.append("image", this.selectedFile, this.selectedFile.name);

      axios
        .put(`${SERVER_URL}/user/modify`, this.user) //회원 수정해주고
        .then(() => {
          // LOGIN 액션 실행
          // 서버와 통신(axios)을 해 토큰값을 얻어야 하므로 Actions를 호출.
          this.$store //Vuex에 접근
            .dispatch("LOGIN", this.user) //아이디, 비번 서버로 전송해서 state에 넣기
            .then(() => this.$router.push("/mypage/check")) //내 정보보기로 이동) //현재 주소 바꾸기
            .catch(({ message }) => (this.msg = message));
        })
        .catch((ex) => {
          alert("error" + ex);
        });
    },
  },
};
</script>

<style>
</style>

