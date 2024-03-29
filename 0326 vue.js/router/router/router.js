//router.js
import HomeComponent from '../views/home.js';
import PostListCoponent from '../views/postList.js';
import PostInfoCoponent from '../views/postInfo.js';

const { createRouter, createWebHistory } = VueRouter

let routes = [  // routes는 따로 빼내서 사용함.
    // post X , get 방식만 됨.
    // 객체 하나당 라우트 한개
    {
        path: '/index.html', // 필요에 따라서 정규식
        redirect: '/'
    },
    {
        path: '/',
        name: 'home',
        component: HomeComponent
    },
    {
        path: '/postList',
        name: 'postList',
        component: PostListCoponent
    },
    {
        path: '/postInfo',
        name: 'postInfo',
        component : PostInfoCoponent
    }


]

const router = createRouter({
    history: createWebHistory(),  //브라우저가 가지고 있는 히스토리에 대한 접근
    routes,


})

export default router;