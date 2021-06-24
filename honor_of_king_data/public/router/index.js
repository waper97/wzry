import Vue from 'vue'
import Router from 'vue-router'

import Index from '../../src/view/index'
import Login from '../../src/view/login/lgoin'
Vue.use(Router)
export default new Router({
    // mode: 'history',
    routes: [
        {
            path : '/login',
            name : 'Login',
            component : Login
        },
        {
            path : '/',
            name : 'index',
            component : Index
        }
    ]

})
