<template>
    <div id="Login">
      <el-card class="login-form-layout">
        <el-form
          autocomplete="on"
          :model="loginForm"
          ref="loginForm"
          label-position="left"
        >
          <div style="text-align: center">
            <i class="iconfont icon-shouye"></i>
          </div>
          <h2 class="login-title color-main">Login</h2>
          <el-form-item prop="username">
            <el-input
              name="username"
              type="text"
              v-model="loginForm.username"
              autocomplete="on"
              placeholder="请输入用户名"
            >
              <span slot="prefix">
                <i class="el-icon-user"></i>
              </span>
            </el-input>
          </el-form-item>
          <el-form-item prop="password">
            <el-input
              name="password"
              @keyup.enter.native="handleLogin"
              v-model="loginForm.password"
              autocomplete="on"
              placeholder="请输入密码"
              show-password
            >
              <span slot="prefix">
                <i class="el-icon-lock"></i>
              </span>
            </el-input>
          </el-form-item>
          <el-form-item style="margin-bottom: 60px">
            <el-button
              style="width: 100%"
              type="primary"
              :loading="loading"
              @click.native.prevent="handleLogin"
            >登录</el-button>
          </el-form-item>
          <el-form-item style="width: 100%">
        <el-button type="primary" 
        style="width: 100%;
        background: #505458;
        border: none" 
        @click="toregister"
        >没有账号？去注册</el-button>
      </el-form-item>
        </el-form>
      </el-card>
    </div>
  </template>
   
  <script>
import axios from 'axios';


  export default {
    name: "LoginView",
    data() {
      return {
        loginForm: {
          username: "",
          password: "",
        },
        rules: {
            username:[
            { required: true, message: '请输入用户名', trigger: 'blur' },
            { min: 3, max: 20, message: '长度在 3 到 20 个字符', trigger: 'blur' }
            ],
            password:[
            { required: true, message: '请输入密码', trigger: 'blur' },
            { min: 6, max: 20, message: '长度在 6 到 20 个字符', trigger: 'blur' }
            ]

        },
        loading: false,
        pwdType: "password",
      };
    },
    methods: {
      handleLogin() {
        axios.post('http://localhost:8080/api/login',{
            username: this.loginForm.username,
            password: this.loginForm.password,
            
        })
        .then(res => {
            if(res.data.code ==0){
                this.$router.push('/Home')
            }
        })
        .catch(error =>{
            console.log(error);
        })
      },
      toregister(){
        this.$router.push('/register')
      }
    }
  };
  </script>
   
  <style scoped>
  .login-form-layout {
    position: absolute;
    left: 0;
    right: 0;
    width: 360px;
    margin: 140px auto;
    border-top: 10px solid #409eff;
  }  .login-title {
    text-align: center;
  }
   
  .login-center-layout {
    background: #409eff;
    width: auto;
    height: auto;
    max-width: 100%;
    max-height: 100%;
    margin-top: 200px;
  }
  .el-icon-user,.el-icon-lock{
    color: #1296db;
  }
  </style>