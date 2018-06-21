<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/6/21
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登陆</title>
</head>
<body>
<form action="/login.do">
    用户：<input in="userName" type="text" name="userName" /><br/>
    密码：<input in="password" type="password" name="password" /><br/>
    <input type="submit" value="提交" />
    <input type="reset" value="重置"/>
</form>

</body>
</html>
