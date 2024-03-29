import router from './router/router.js';

const { createApp } = Vue

let template = `
    <div>
        <!--<router-link to="/home"> Home </router-link><hr> --><!-- 라우터 뷰에 보여지는 곳으로 링크를 걸 수 있음 -->
        <!-- a태그 속성  url을 쳐서 들어가는 건 안되지만 클릭으로 들어가는 건 됨. -->
        <!--<router-link v-bind:to=" { name: 'home'} "> Home </router-link>-->
         <router-link v-bind:to=" { name: 'home'} "> Home </router-link> ||
        <router-link v-bind:to=" { path: '/postList'} "> postList </router-link> ||
        <router-link v-bind:to=" { path: '/postInfo'} "> postInfo </router-link>

        <router-view :key="$route.fullpath" /> <!-- 보여주고 싶은걸 담음. 컴포넌트를 불러오는 역할--> 
    </div>
`;


createApp({
    template
})
    .use(router) // 전역변수
    .mount('#app');