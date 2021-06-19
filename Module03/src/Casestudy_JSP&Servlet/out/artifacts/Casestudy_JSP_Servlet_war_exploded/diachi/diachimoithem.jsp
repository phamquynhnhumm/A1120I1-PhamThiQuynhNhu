<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/19/2021
  Time: 3:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>diachimoithem</title>
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
        <a href="/khachhang?action=create">Tiếp tục thêm mới khách hàng</a>
    </p>
    <table class="table table-hover" id="tableKhachhang">
        <tr>
            <th>id_diachi</th>
            <th>số nhà</th>
            <th>Xã</th>
            <th>Huyện</th>
            <th>Tỉnh</th>
            <th>Quốc gia</th>
        </tr>
        <c:forEach items="${diachi}" var="diachi">
            <tr>
                <td>${diachi.getId_diachi()}</td>
                <td>${diachi.getSonha()}</td>
                <td>${diachi.getXa()}</td>
                <td>${diachi.getHuyen()}</td>
                <td>${diachi.getTinh()}</td>
                <td>${diachi.getQuocgia()}</td>
            </tr>
        </c:forEach>

    </table>

</div>

</body>
</html>
