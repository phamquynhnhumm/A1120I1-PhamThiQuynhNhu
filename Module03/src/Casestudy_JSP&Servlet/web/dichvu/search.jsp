<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/19/2021
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
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
<thead>
    <tr>
        <th>Id</th>
        <th>Tên Dịch Vụ</th>
        <th>Diện Tích</th>
        <th>Chi Phí</th>
        <th>Số người</th>
        <th>Kiểu Dịch Vụ</th>
    </tr>
</thead>
<tbody>
    <c:forEach items="${dichvu}" var="dichvu">
        <tr>
            <td>${dichvu.getId_dichvu()}</td>
            <td>${dichvu.getTen_dichvu()}</td>
            <td>${dichvu.getDientich()}</td>
            <td>${dichvu.getChiphi()}</td>
            <td>${dichvu.getSonguoi()}</td>
            <td>${dichvu.getKieuthue().getTen_kieuthue()}</td>
        </tr>
    </c:forEach>
</tbody>
</table>
</div>

</body>
</html>
