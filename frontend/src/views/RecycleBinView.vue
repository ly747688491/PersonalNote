<template>
  <div class="home">
    <el-container>
        <el-aside width="200px">
            <SideMenu/>
        </el-aside>
        <el-container>
            <el-header>

            </el-header>
            <el-main>

            </el-main>
        </el-container>
    </el-container>
  </div>
</template>

<script>
import SideMenu from '@/components/SideMenu.vue';



export default {
  name: 'HomeView',
  components: {
    SideMenu
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