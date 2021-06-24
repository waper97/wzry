<template>
  <div>
    <el-form ref="loginForm" :model="loginForm" :rules="rules" class="login-box">
        <el-form-item label="账号" prop="username">
          <el-input type="text" v-model="loginForm.username"/>
        </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input type="password" v-model="loginForm.password"/>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="onSubmit('loginForm')">登陆</el-button>
        <el-button @click="resetForm('loginForm')">重置</el-button>

      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  name: "lgoin",
  data(){
    return {
        loginForm:{
          username:'',
          password:''
        },
      rules: {
        username: [
          { required: true, message: '请输入活动名称', trigger: 'blur' },
          { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请选择活动区域', trigger: 'change' }
        ]
      }
    }
  },
  methods:{
    onSubmit(formName){

      this.$refs[formName].validate((valid) => {
        if (valid) {
          console.log('submit');
          this.$router.push('/')
        } else {
          console.log('error submit!!');
          return false;
        }
      });

    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
}
</script>

<style scoped>
  .login-box{
    width: 350px;
    margin: auto;
  }
</style>