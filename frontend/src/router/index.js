import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginView from '../views/LoginView.vue'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'login',
        component: LoginView
    },
    {
        path: '/register',
        name: 'register',
        component: () => import('../views/RegisterView.vue')
    },
    {
        path: '/home',
        name: 'home',
        component: () => import('../views/HomeView.vue')
    },
    {
        path: '/error404',
        name: '404',
        component: () => import('../views/404View.vue')
    },
    {
        path: '/recentedits',
        name: 'recentedits',
        component: () => import('../views/RecentEditsView.vue')
    },
    {
        path: '/recyclebin',
        name: 'recyclebin',
        component: () => import('../views/RecycleBinView.vue')
    },
    {
        path: '/home',
        name: 'home',
        component: () => import('../views/HomeView.vue')
    },
    {
        path: '/edit',
        name: 'edit',
        component: () => import('../views/EditView.vue')
    },
]

const router = new VueRouter({
  routes
})

export default router
