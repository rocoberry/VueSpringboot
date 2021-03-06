import Vue from 'vue'
import Router from 'vue-router'
// import home from '@/components/home'
// import login from '@/components/login'
// import regist from '@/components/regist'
import forgetpassword from '@/components/forgetpassword'
import store from '@/store';
import { Message } from 'element-ui';
import {getToken} from '@/request/token'

Vue.use(Router)

//按需加载
// const Index = resolve => require(['@/views/Index.vue'], resolve)
const home = resolve => require(['@/components/home.vue'], resolve)
const login = resolve => require(['@/components/login.vue'], resolve)
const regist = resolve => require(['@/components/regist.vue'], resolve)
const test = resolve => require(['@/components/test.vue'], resolve)
const index=resolve=>require(['@/components/view/index.vue'],resolve)
const blogview=resolve=>require(['@/components/view/blog/BlogView.vue'],resolve)
const blogwrite=resolve=>require(['@/components/view/blog/BlogWrite.vue'],resolve)
const blogcategorytag=resolve=>require(['@/components/view/blog/BlogCategoryTag.vue'],resolve)
const router=new Router({
  routes: [
    {
      path: '/write/:id?',
      component: blogwrite,
      meta: {
        requireLogin: true
      },
    },
    {
      path: '',
      // name: 'home',
      component: home,
      children:[
        {path:'/',
        component:index},
        {
          path: '/view/:id',
          component: blogview
        },
    
        {
          path:'/test/:id',
          component:test
        },
        {
          path: '/:type/:id',
          component:blogcategorytag
        }
      ]

    },
    {
      path: '/login',
      name: 'login',
      component: login
    },
    {
      path: '/regist',
      name: 'regist',
      component: regist
    },
    {
      path: '/forgetpassword',
      name: 'forgetpassword',
      component: forgetpassword
    },
    {
      path:'/test',
      name:test,
      component:test
    }
  ],
  scrollBehavior (to, from, savedPosition) {
    // ...
    return {x:0,y:0}
  }
})

router.beforeEach((to,from,next)=>{
  if (to.meta.title) {//判断是否有标题
    document.title = to.meta.title
  }
  if(getToken()){
    if(to.path==='/login'){
      next({path:'/'})}else{
        if(store.state.email.length===0){
          store.dispatch('getUserInfo').then(data=>{
            next()
          }).catch(()=>{
            next({path:'/'})
          })
        }else{
          next()
        }
      }
    }else{
      if(to.matched.some(r=>r.meta.requireLogin)){
        Message({
          type:'warning',
          showClose:true,
          message:'请先登录哦'
        })
      }else{
        next();
      }
    }
  }
)

export default router