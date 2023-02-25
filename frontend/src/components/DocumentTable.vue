<template>
    <el-table
      :data="tableData"
      height="250"
      style="width: 100%">
      <el-table-column
        prop="date"
        width="180">
      </el-table-column>
      <el-table-column
        prop="date"
        label="文件名"
        width="180">
      </el-table-column>
      <el-table-column
        prop="date"
        label="最近编辑"
        width="180">
      </el-table-column>
      <el-table-column
        prop="name"
        label="创建时间"
        width="180">
      </el-table-column>
      <el-table-column
        prop="address"
        label="操作">
      </el-table-column>
    </el-table>
  </template>
  
  <script>
    export default {
      data() {
        return {
          tableData: [{
            date: '2016-05-03',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
          }]
        }
      }
    }
  </script>