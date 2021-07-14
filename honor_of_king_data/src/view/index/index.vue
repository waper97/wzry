<template>
  <el-container>
    <el-header>Header</el-header>
    <el-main>
      <el-table
          :data="tableData"
          style="width: 100%"
          :row-class-name="tableRowClassName">
        <el-table-column
            prop="id"
            label="id"
            width="180">
        </el-table-column>
        <el-table-column
            prop="name"
            label="英雄名称"
            width="180">
        </el-table-column>
        <el-table-column
            prop="detail"
            label="描述">
        </el-table-column>
      </el-table>
    </el-main>
    <el-pagination
        background
        layout="prev, pager, next"
        :total="1000">
    </el-pagination>
    <el-footer>Footer</el-footer>
  </el-container>



</template>

<script>

export default {
  name: "index"
}
</script>

<style scoped>
.el-header, .el-footer {
  background-color: #B3C0D1;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-aside {
  background-color: #D3DCE6;
  color: #333;
  text-align: center;
  line-height: 200px;
}

.el-main {
  background-color: #E9EEF3;
  color: #333;
  text-align: center;
  line-height: 160px;
}

body > .el-container {
  margin-bottom: 40px;
}

.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
  line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
  line-height: 320px;
}

.el-table .warning-row {
  background: oldlace;
}

.el-table .success-row {
  background: #f0f9eb;
}
</style>