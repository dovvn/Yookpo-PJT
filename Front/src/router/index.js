import Vue from "vue";
import VueRouter from "vue-router";
// 메인
import Home from "../views/Home.vue";
// 로그인, 회원가입
import Login from "../views/Login.vue";
import Join from "../views/Join.vue";
// 마이페이지
import Mypage from "../views/Mypage.vue";
import MypageCheck from "@/components/mypage/MypageCheck.vue";
import MypageModify from "@/components/mypage/MypageModify.vue";
import MyPetsitter from "@/components/mypage/MyPetsitterList.vue";
// 입양하기
import Adopt from "../views/Adopt.vue";
import AdoptList from "@/components/adopt/AdoptList.vue";
import AdoptRead from "@/components/adopt/AdoptRead.vue";
import AdoptModify from "@/components/adopt/AdoptModify.vue";
import AdoptAdd from "@/components/adopt/AdoptAdd.vue";
// 의료정보
import Medical from "../views/Medical.vue";
import Hospital from "@/components/medical/Hospital.vue";
import Pharmacy from "@/components/medical/Pharmacy.vue";
// 펫시터
import Petsitter from "../views/Petsitter.vue";
import PetsitterList from "@/components/petsitter/PetsitterList.vue";
import PetsitterAdd from "@/components/petsitter/PetsitterAdd.vue";
import PetsitterModify from "@/components/petsitter/PetsitterModify.vue";
import PetsitterRead from "@/components/petsitter/PetsitterRead.vue";
// 육포마켓
import Market from "../views/Market.vue";
import MarketList from "@/components/market/MarketList.vue";
import MarketRead from "@/components/market/MarketRead.vue";
import MarketModify from "@/components/market/MarketModify.vue";
import MarketAdd from "@/components/market/MarketAdd.vue";
// 장바구니
import Basket from "../views/Basket.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/login",
    name: "Login",
    component: Login,
  },
  {
    path: "/join",
    name: "Join",
    component: Join,
  },
  {
    path: "/mypage",
    name: "Mypage",
    component: Mypage,
    redirect: "/mypage/check",
    children: [
      {
        path: "check",
        name: "MypageCheck",
        component: MypageCheck,
      },
      {
        path: "modify",
        name: "MypageModify",
        component: MypageModify,
      },
      {
        path: "mypetsitter",
        name: "MyPetsitter",
        component: MyPetsitter,
      },
    ],
  },
  {
    path: "/adopt",
    name: "Adopt",
    component: Adopt,
    redirect: "/adopt/list",
    children: [
      {
        path: "list",
        name: "AdoptList",
        component: AdoptList,
      },
      {
        path: "add",
        name: "AdoptAdd",
        component: AdoptAdd,
      },
      {
        path: "read/:ano",
        name: "AdoptRead",
        component: AdoptRead,
      },
      {
        path: "modify/:ano",
        name: "AdoptModify",
        component: AdoptModify,
      },
    ],
  },
  {
    path: "/medical",
    name: "Medical",
    component: Medical,
    redirect: "/medical/hospital",
    children: [
      {
        path: "hospital",
        name: "Hospital",
        component: Hospital,
      },
      {
        path: "pharmacy",
        name: "Pharmacy",
        component: Pharmacy,
      },
    ],
  },
  {
    path: "/petsitter",
    name: "Petsitter",
    component: Petsitter,
    redirect: "/petsitter/list",
    children: [
      {
        path: "list",
        name: "PetsitterList",
        component: PetsitterList,
      },
      {
        path: "add",
        name: "PetsitterList",
        component: PetsitterAdd,
      },
      {
        path: "read/:pno",
        name: "PetsitterRead",
        component: PetsitterRead,
      },
      {
        path: "modify/:pno",
        name: "PetsitterModify",
        component: PetsitterModify,
      },
    ],
  },
  {
    path: "/market",
    name: "Market",
    component: Market,
    redirect: "/market/list",
    children: [
      {
        path: "list",
        name: "MarketList",
        component: MarketList,
      },
      {
        path: "add",
        name: "MarketAdd",
        component: MarketAdd,
      },
      {
        path: "read/:mno",
        name: "MarketRead",
        component: MarketRead,
      },
      {
        path: "modify/:mno",
        name: "MarketModify",
        component: MarketModify,
      },
    ],
  },
  {
    path: "/basket",
    name: "Basket",
    component: Basket,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
