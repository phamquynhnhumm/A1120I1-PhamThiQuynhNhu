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
        <a  href="/nhanvien">Trở lại danh sách User</a>
    </p>
    <form method="post" >
        <div class="form-group">
            <label >Id</label>
            <input type="text" name="id" class="form-control"   placeholder="id">
        </div>
        <div class="form-group">
            <label >Tên:</label>
            <input type="text" name="ten" class="form-control"  placeholder="ten">
        </div>
        <div class="form-group">
            <label >Ngày sinh:</label>
            <input type="text"  name="ngaysinh" class="form-control"  placeholder="Ngày sinh 1999/12/03">
        </div>
        <div class="form-group">
            <label >Số CMND:</label>
            <input type="text"  name="socmnd" class="form-control"  placeholder="cmnd">
        </div>
        <th>Id</th>

        <div class="form-group">
            <label >Số đt:</label>
            <input type="text"  name="sdt" class="form-control"  placeholder="sdt">
        </div>
        <div class="form-group">
            <label >Email:</label>
            <input type="text"  name="email" class="form-control"  placeholder="email">
        </div>
        <div class="form-group">
            <label >Luong:</label>
            <input type="text"  name="luong" class="form-control"  placeholder="luong">
        </div>
        <div class="form-group">
            <label >Địa chỉ:</label>
            <div>
                <select name="id_diachi" id="1exampleInputPosition">
                    <option>
                        Địa chỉ
                    </option>
                    <c:forEach items="${diachis}" var="diachis">
                        <option value="${diachis.getId_diachi()}" ${diachis.getId_diachi()==id_diachi?"selected":""}>
                            Số nhà :${diachis.getSonha()}  ,Xã: ${diachis.getXa()} ,Huyện:  ${diachis.getHuyen()} ,Tỉnh:    ${diachis.getTinh()}
                        </option>
                    </c:forEach>
                </select>
                <p> <a href="/diachi?action=createnv">Thêm mới địa chỉ</a></p>
            </div>
        </div>
        <div class="form-group">
            <label >Trình độ:</label>
            <select name="id_trinhdo">
                <option>
                    Trình độ
                </option>
                <c:forEach items="${trinhdos}" var="trinhdo">
                    <option value="${trinhdo.getId_trinhdo()}">
                        ${trinhdo.getTen_trinhdo()}
                    </option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label >Bộ phận:</label>
            <select name="id_bophan">
                <option>
                    Bộ phận
                </option>
                <c:forEach items="${bophans}" var="bophan">
                    <option value="${bophan.getId_bophan()}">
                        ${bophan.getTen_bophan()}
                    </option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label >Vị trí:</label>
           <select name="id_vitri">
               <option>
                   Vị trí
               </option>
               <c:forEach items="${vitris}" var="vitri">
                   <option value="${vitri.getId_vitri()}">
                       ${vitri.getId_vitri()}
                   </option>
               </c:forEach>
           </select>
        </div>
        <div class="form-group">
            <label >User:</label>
            <select name="ten_user">
                <option>
                    ten_user
                </option>
                <c:forEach items="${users}" var="user">
                    <option value="${user.getTen_user()}">
                            ${user.getTen_user()}
                    </option>
                </c:forEach>
            </select>
        </div>
        <button type="submit" name="submit" class="btn btn-primary">thêm mới</button>
    </form>
</div>
</body>

</html>
