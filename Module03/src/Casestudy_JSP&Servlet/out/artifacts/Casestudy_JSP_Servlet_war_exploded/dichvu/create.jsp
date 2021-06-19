<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/19/2021
  Time: 6:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới khách hàng</title>
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
        <a  href="/dichvu">Trở lại danh sách dịch vụ</a>
    </p>
    <form method="post">
        <div class="form-group">
            <label >Id</label>
            <input type="text" name="id" class="form-control"   placeholder="id">
        </div>
        <div class="form-group">
            <label >Tên:</label>
            <input type="text" name="ten" class="form-control"  placeholder="ten">
        </div>
<%--           <td>${dichvu.getId_dichvu()}</td>
                <td>${dichvu.getTen_dichvu()}</td>
                <td>${dichvu.getDienTich()}</td>
                <td>${dichvu.getChiphi()}</td>
                <td>${dichvu.getSonguoi()}</td>
                <td>${dichvu.getKieuthue().getTen_kieuthue()}</td>--%>
        <div class="form-group">
            <label >Diện Tích:</label>
            <input type="text"  name="dientich" class="form-control"  >
        </div>
        <div class="form-group">
            <label >Chi Phí:</label>
            <input type="text"  name="chiphi" class="form-control"   >
        </div>
        <div class="form-group">
            <label >Số Người:</label>
            <input type="text"  name="songuoi" class="form-control"  >
        </div>
        <div class="form-group">
            <label >Kiểu Thuê:</label>
            <select name="id_kieuthue" id="exampleInputPosition">
                <option>
                    Kiểu Thuê
                </option>
                <c:forEach items="${kieuthue}" var="kieuthue">
                    <option  value="${kieuthue.getId_kieuthue()}">
                            ${kieuthue.getTen_kieuthue()}
                    </option>
                </c:forEach>
            </select>
        </div>
        </div>
        <button type="submit" name="submit" class="btn btn-primary">thêm mới</button>
    </form>
</div>
</body>
</html>

