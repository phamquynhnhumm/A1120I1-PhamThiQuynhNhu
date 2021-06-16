<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/15/2021
  Time: 12:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hiển thị users</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>
<h2>Danh sách User</h2>
<div class="container">

<c:if test="${not empty user}">

    <table class="table table-hover">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
        </tr>
        <c:forEach items="${user}" var="user">
            <tr>
                <td>${User.getName()}</td>
                <td>${User.getEmail()}</td>
                <td>${User.getCountry()}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</div>
</body>
</html>
