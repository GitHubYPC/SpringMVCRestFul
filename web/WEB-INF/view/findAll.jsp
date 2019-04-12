<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YPC
  Date: 2018/12/24
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<table class="table">
    <tbody>
    <tr>
        <td colspan="2"><span class="glyphicon glyphicon-plus" onclick="location.href='loadinsert'"></span></td>
    </tr>
    <tr>
        <td>编号</td>
        <td>编号</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td><a href="/student/${stu.id}">${stu.id}</a></td>
            <td>${stu.name}</td>
            <td>
                <form action="/student/${stu.id}" method="post">
                    <%--设置影藏域 转换post--%>
                    <input type="hidden" name="_method" value="delete">
                    <input type="submit" value="删除">
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
