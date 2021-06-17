<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/11/2021
  Time: 1:34 AM
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
<div class="container">
    <p>
        <a href="/khachhang?action=create"> Thêm mới Khachhang</a>
    </p>
    <p>
        <a href="/khachhang?action=search"> Tìm kiếm</a>
    </p>
    <h2>Danh sách khách hàng</h2>
    <table class="table table-hover">
        <tr>
            <th>Id</th>
            <th>Tên</th>
            <th>Ngày Sinh</th>
            <th>Giới Tính</th>
            <th>Số Cmnd</th>
            <th>Số điện thoại</th>
            <th>Email</th>
            <th>Loại Khách</th>
            <th>Số nhà</th>
            <th>Xã</th>
            <th>Huyện</th>
            <th>Tỉnh</th>
            <th>Quốc Gia</th>
        </tr>
        <c:forEach items="${khachhang}" var="khachhang">
            <tr>
            <td>${khachhang.getId_khachhang()}</td>
            <td>${khachhang.getTen_khachhang()}</td>
            <td>${khachhang.getNgaysinh()}</td>
            <td>${khachhang.getGioitinh()}</td>
            <td>${khachhang.getSocmnd()}</td>
            <td>${khachhang.getSdt()}</td>
            <td>${khachhang.getEmail()}</td>
            <td>${khachhang.getLoaikhach().getTen_loaikhach()}</td>
            <td>${khachhang.getDiachi().getSonha()}</td>
            <td>${khachhang.getDiachi().getXa()}</td>
            <td>${khachhang.getDiachi().getHuyen()}</td>
            <td>${khachhang.getDiachi().getTinh()}</td>
            <td>${khachhang.getDiachi().getQuocgia()}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
