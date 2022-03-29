<%@ page import="com.xzit.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: CEN
  Date: 2022/3/27
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table,td{
            border: 1px solid black;
            backdrop-collapse:collapse;
        }
        table{
            margin: 0 auto;
            text-align: center;
            width:700px;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>操作</td>
    </tr>
    <% List<Student> list = (List<Student>) request.getAttribute("list");
        int x = 1;
        for (Student stu : list) {%>
    <tr>
        <td><%=x++%></td>
        <td><%=stu.getName()%></td>
        <td><%=stu.getAge()%></td>
        <td><%=stu.getGender()%></td>
        <td><a href="javascript:;" onclick="doDel(<%=stu.getId()%>)">删除数据</a></td>
    </tr>
    <%}%>
</table>
<script>
    function doDel(id) {
        if(confirm("确定删除吗？"))
            location="delete/"+id
        
    }
</script>

</body>
</html>
