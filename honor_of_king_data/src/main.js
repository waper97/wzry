import Vue from 'vue'
import App from './App.vue'
import Element from  'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import  VueRouter from 'vue-router'
import router from '../public/router'
Vue.config.productionTip = false
Vue.use(Element);
Vue.use(VueRouter);
new Vue({
  router,
  render: h => h(App),
}).$mount('#app')


