<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/13/2021
  Time: 12:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hiển thị danh sách</title>
</head>
<body>
<h3>Danh sách User</h3>
<p>
    <a href="/user?action=create">Thêm mới users</a>
</p>
<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Cointry</th>
    </tr>
    <c:forEach items="${user}" var="user">
        <tr>
            <td>${user.name}</td>
<%--            <td>${User.getEmail()}</td>--%>
<%--            <td>${User.getCountry()}</td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
