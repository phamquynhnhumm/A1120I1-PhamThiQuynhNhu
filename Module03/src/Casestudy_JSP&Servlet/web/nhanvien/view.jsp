<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/21/2021
  Time: 2:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chi tiết  nhân viên </title>
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
    <p>
        <a href="/hopdong">Trở lại danh sách hợp đồng</a>
    </p>
    </p>
    <table class="table table-hover" id="tablenhanvien">
        <tr>
            <th>Id</th>
            <th>Tên</th>
            <th>Ngày Sinh</th>
            <th>Số Cmnd</th>
            <th>Số điện thoại</th>
            <th>Email</th>
            <th>Trình độ</th>
            <th>Vị trí</th>
            <th>Bộ phận</th>
            <th>Lương</th>
            <th>Địa chỉ</th>
            <th>Tên_User</th>
        </tr>
        <tr> <td>${nhanvien.getId_nhanvien()}</td>
            <td>${nhanvien.getTen_nhanvien()}</td>
            <td>${nhanvien.getNgaysinh()}</td>
            <td>${nhanvien.getSocmnd()}</td>
            <td>${nhanvien.getSdt()}</td>
            <td>${nhanvien.getEmail()}</td>
            <td>${nhanvien.getTrinhdo().getTen_trinhdo()}</td>
            <td>${nhanvien.getVitri().getTen_vitri()}</td>
            <td>${nhanvien.getBophan().getTen_bophan()}</td>
            <td>${nhanvien.getLuong()}</td></tr>
    </table>
</div>

</body>
</html>
