<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/19/2021
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tìm kiếm</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<div>
    <p>
        <a href="/nhanvien">Quay lại danh sách khách hàng</a>
    </p>
    <form method="post">
        <label>Nhập tên nhân viên bạn muốn tìm kiếm</label>
        <input type="text" name="name">
        <button type="submit" name="submit">tìm kiếm</button>
    </form>
    <table class="table table-hover">
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
        <c:forEach items="${nhanviens}" var="nhanvien">
            <tr>
                <td>${nhanvien.getId_nhanvien()}</td>
                <td>${nhanvien.getTen_nhanvien()}</td>
                <td>${nhanvien.getNgaysinh()}</td>
                <td>${nhanvien.getSocmnd()}</td>
                <td>${nhanvien.getSdt()}</td>
                <td>${nhanvien.getEmail()}</td>
                <td>${nhanvien.getTrinhdo().getTen_trinhdo()}</td>
                <td>${nhanvien.getVitri().getTen_vitri()}</td>
                <td>${nhanvien.getBophan().getTen_bophan()}</td>
                <td>${nhanvien.getLuong()}</td>
                <td>
                    <a href="/diachi?action=view&id=${nhanvien.getDiachi().getId_diachi()}" >
                            ${nhanvien.getDiachi().getId_diachi()}
                    </a>
                </td>
                <td>${nhanvien.getUser().getTen_user()}</td>
                <td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
