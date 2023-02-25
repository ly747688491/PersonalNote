<template>
    <div class="register">
        <el-card class="register-form-layout">
            <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                <div style="text-align: center">
                    <i class="iconfont icon-shouye"></i>
                </div>
                <h2 class="register-title color-main">Register</h2>
                <el-form-item label="账号名称" prop="user">
                <el-input v-model="ruleForm.user" clearable></el-input>
                </el-form-item>
                <el-form-item label="手机号码" prop="mobile">
                <el-input v-model="ruleForm.mobile" clearable></el-input>
                </el-form-item>
                <el-form-item label="账号密码" prop="pass">
                <el-input type="password" v-model="ruleForm.pass" clearable></el-input>
                </el-form-item>
                <el-form-item label="确认密码" prop="checkPass">
                <el-input type="password" v-model="ruleForm.checkPass" clearable></el-input>
                </el-form-item>
                <el-form-item>
                <el-button type="primary" @click="submitForm('ruleForm2')">注册</el-button>
                <el-button @click="returnForm">取消</el-button>
                </el-form-item>
        </el-form>
      </el-card>
    </div>
  </template>
  <script>
  export default {
    name: "RegisterView",
    data() {
      var checkUser = (rule, value, callback) => {
        const regUser = /^[a-zA-Z0-9_-]{3,16}$/
        if (regUser.test(value)) {
          return callback()
        }
        callback(new Error('用户名不能为空'))
      }
      var checkMobile = (rule, value, callback) => {
        const regUser = /^((0\d{2,3}-\d{7,8})|(1[34578]\d{9}))$/
        if (regUser.test(value)) {
          return callback()
        }
        callback(new Error('手机号码不能为空'))
      }
      var validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'))
        } else {
          if (this.ruleForm.checkPass !== '') {
            this.$refs.ruleForm.validateField('checkPass')
          }
          callback()
        }
      }
      var validatePass2 = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请再次输入密码'))
        } else if (value !== this.ruleForm.pass) {
          callback(new Error('两次输入密码不一致!'))
        } else {
          callback()
        }
      }
      return {
        ruleForm: {
          user: '',
          mobile: '',
          email: '',
          pass: '',
          checkPass: ''
        },
        rules: {
          user: [{ validator: checkUser, trigger: 'blur' }],
          mobile: [{ validator: checkMobile, trigger: 'blur' }],
          pass: [{ validator: validatePass, trigger: 'blur' }],
          checkPass: [{ validator: validatePass2, trigger: 'blur' }]
        }
      }
    },
    methods: {
      returnForm() {
        // 返回login界面
        this.$router.push('/')
      },
      submitForm() {
        console.log(this.item)
        var data = this.item
        this.$http.post('/api/employee/login', data, { emulateJSON: false }).then(
          (response) => {
            console.log(response.body)
            this.grouplist = response.body
            alert('注册成功！')
            this.$router.push('/login')
          },
          (response) => {
            console.log(response)
            alert('出问题啦！！！')
          }
        )
      }
    }
  }
  </script>
  <style scoped>
  .register-form-layout{
    position: absolute;
    left: 0;
    right: 0;
    width: 500px;
    margin: 120px auto;
    border-top: 10px solid #409eff;
  }
  .register-title{
    text-align: center;
  }
  .el-form-item {
    margin-top: 20px;
    width: 440px;
  }
  </style>
  
  