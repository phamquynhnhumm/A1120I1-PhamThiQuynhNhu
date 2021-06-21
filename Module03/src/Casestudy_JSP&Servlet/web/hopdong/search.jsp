<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/21/2021
  Time: 3:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>tìm kiếm hợp đồng</title>
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
        <a href="/hopdong">Quay lại danh sách hợp đồng</a>
    </p>
    <form method="post">
        <label>Nhập tên khách hàng bạn muốn tìm kiếm</label>
        <input type="text" name="name">
        <button type="submit" name="submit">tìm kiếm</button>
    </form>
    <table class="table table-hover" >
        <tr>
            <th>Id</th>
            <th>Ngày bắt đầu</th>
            <th>Ngày kết thúc</th>
            <th>tiền cược</th>
            <th>Tổng thanh toán</th>
            <th>Nhân viên</th>
            <th>Khách hàng</th>
            <th>Dịch vụ</th>
        </tr>
        <c:forEach items="${hopdong}" var="hopdong">
            <tr>
                <td>${hopdong.getId_hopdong()}</td>
                <td>${hopdong.getNgaybatdau()}</td>
                <td>${hopdong.getNgayketthuc()}</td>
                <td>${hopdong.getSotiendatco()}</td>
                <td>${hopdong.getTongsotienthanhtoan()}</td>
                 <td>
                    <a href="/nhanvien?action=view&id=${hopdong.getNhanvien().getId_nhanvien()}">
                            ${hopdong.getNhanvien().getTen_nhanvien()}
                    </a>
                </td>
                <td>
                    <a href="/khachhang?action=view&id=${hopdong.getKhachhang().getId_khachhang()}">
                            <%--                            ${hopdong.getKhachhang().getTen_khachhang()} kh--%>
                            ${hopdong.getKhachhang().getTen_khachhang()}
                    </a>
                </td>
                <td>
                    <a href="/dichvu?action=view&id=${hopdong.getDichvu().getId_dichvu()}">
                            ${hopdong.getDichvu().getTen_dichvu()}
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
