import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import axios from 'axios'

import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

import './assets/icon/iconfont.css'

Vue.prototype.$axios = axios

Vue.use(ElementUI)

Vue.config.productionTip = false


Vue.prototype.baseURL = "http://127.0.0.1:8080/api";

new Vue({
    axios,
  router,
  store,
  render: h => h(App)
}).$mount('#app')
