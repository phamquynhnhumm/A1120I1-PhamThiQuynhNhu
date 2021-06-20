<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/21/2021
  Time: 2:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>thông tin địa chỉ</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3>địa chỉ mới thêm</h3>
    <p>
        <a href="/hopdong">Trở lại danh sách hợp đồng</a>
    </p>
    <table class="table table-hover" id="tableKhachhang">
        <tr>
            <th>Id</th>
            <th>Tên Dịch Vụ</th>
            <th>Diện Tích</th>
            <th>Chi Phí</th>
            <th>Số người</th>
            <th>Kiểu Dịch Vụ</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <tr>
            <td>${dichvu.getId_dichvu()}</td>
            <td>${dichvu.getTen_dichvu()}</td>
            <td>${dichvu.getDientich()}</td>
            <td>${dichvu.getChiphi()}</td>
            <td>${dichvu.getSonguoi()}</td>
            <td>${dichvu.getKieuthue().getTen_kieuthue()}</td>
        </tr>
    </table>
</div>
</body>
</html>


