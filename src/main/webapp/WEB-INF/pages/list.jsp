<%--
  Created by IntelliJ IDEA.
  User: 凉介
  Date: 2020/11/23
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有信息</h3>
<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
