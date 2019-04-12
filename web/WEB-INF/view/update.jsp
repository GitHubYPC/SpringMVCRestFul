<%--
  Created by IntelliJ IDEA.
  User: YPC
  Date: 2018/12/24
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/student" method="post">
<input type="hidden" name="_method" value="put">
<p><input name="id" value="${stu.id}" readonly="readonly"></p>
<p><input name="name" value="${stu.name}"></p>
<p><input type="submit" value="提交"></p>
</form>
</body>
</html>
