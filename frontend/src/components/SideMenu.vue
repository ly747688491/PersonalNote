<template>
    <div class="SideMenu">
        <div>
            <el-row>
            <el-col :span="6"><div class="grid-content bg-purple">
                    <el-avatar 
                    :size="30" 
                    src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"
                    ></el-avatar>
                </div></el-col>
                <el-col :span="18"><div class="grid-content bg-purple">
                    <p class="username" @click="toUserSettings">{{ username }}</p>
                </div></el-col>
            </el-row>
            <el-row :gutter="20">
                <el-col :span="18"><div class="grid-content bg-purple">
                    <el-input
                        placeholder="请输入内容"
                        prefix-icon="el-icon-search"
                        v-model="search"
                        class="search">
                    </el-input>
                </div></el-col>
                <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
            </el-row>
        </div>
        <el-divider></el-divider>
        <el-menu
        default-active="1"
        class="el-menu-vertical-demo">
        <el-submenu index="1">
            <template slot="title">
            <i class="el-icon-s-home"></i>
            <span>我的文档</span>
            </template>
            <el-menu-item index="1-1">文件1</el-menu-item>
            <el-submenu index="1-4">
            <template slot="title">文件夹1</template>
            <el-menu-item index="1-4-1">文件1</el-menu-item>
            </el-submenu>
        </el-submenu>
        <el-menu-item index="2">
            <i class="el-icon-menu"></i>
            <span slot="title">最近编辑</span>
        </el-menu-item>
        <el-menu-item index="3">
            <i class="el-icon-delete"></i>
            <span slot="title">回收站</span>
        </el-menu-item>
        <el-menu-item index="4">
            <i class="iconfont icon-biji"></i>
            <span slot="title">精选文章</span>
        </el-menu-item>
        </el-menu>
    </div>
  </template>
  
  <script>

  export default {
    name: 'SideMenu',
    data() {
        return {
            search:'',
            username :'用户名',
        }
    },
    components: {
    },
    methods: {
        toUserSettings(){
            console.log("toUserSettings");
        
        }
    }

  }
  </script>
  
  <style>
.el-menu{
    overflow: hidden;
}
.username{
    margin-left: 20px;
}
.search{
    margin-left: 20px;
}
.el-avatar {
    margin-left: 20px;
    margin-bottom: 10px;
    margin-top: 10px;
}
</style>