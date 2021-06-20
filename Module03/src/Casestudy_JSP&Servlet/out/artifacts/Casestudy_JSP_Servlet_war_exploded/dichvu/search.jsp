<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/19/2021
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>
<div>
    <p>
        <a href="/dichvu">Quay lại danh sách dịch vụ</a>
    </p>
    <form method="post">
        <label>Nhập tên dịch vụ bạn muốn tìm kiếm</label>
        <input type="text" name="name">
        <button type="submit" name="submit">tìm kiếm</button>
    </form>
<table class="table table-hover" >
    <tr>
        <th>Id</th>
        <th>Tên Dịch Vụ</th>
        <th>Diện Tích</th>
        <th>Chi Phí</th>
        <th>Số người</th>
        <th>Kiểu Dịch Vụ</th>
    </tr>
    <c:forEach items="${dichvus}" var="dichvus">
        <tr>
            <td>${dichvus.id_dichvu}</td>
            <td>${dichvus.getTen_dichvu()}</td>
            <td>${dichvus.getDientich()}</td>
            <td>${dichvus.getChiphi()}</td>
            <td>${dichvus.getSonguoi()}</td>
            <td>${dichvus.getKieuthue().getTen_kieuthue()}</td>
        </tr>
    </c:forEach>
</table>
</div>

</body>
</html>
