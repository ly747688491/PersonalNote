<template>
    <div class="home">
      <el-container>
          <el-aside width="300px" style="overflow-x: hidden;">
                  <SideMenu/>
          </el-aside>
          <el-container>
              <el-header>
                  <header-component></header-component>
              </el-header>
              <el-main>
                  
              </el-main>
          </el-container>
      </el-container>
    </div>
  </template>
  
  <script>
  import SideMenu from '@/components/SideMenu.vue';
  import HeaderComponent from '@/components/HeaderComponent.vue';
  
  
  
  export default {
    name: 'HomeView',
    components: {
      SideMenu,
      HeaderComponent,
  }
  }
  </script>
  
  <style scoped>
  
  .el-header{
      background-color: #B3C0D1;
      color: #333;
      text-align: center;
      line-height: 100px;
      height: 100px;
    }
  
    .el-aside {
      height: 100vh;
    }
    
    .el-main {
      background-color: #E9EEF3;
      color: #333;
      text-align: center;
    }
  </style>