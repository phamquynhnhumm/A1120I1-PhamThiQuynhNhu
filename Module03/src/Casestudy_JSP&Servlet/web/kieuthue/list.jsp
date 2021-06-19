<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/19/2021
  Time: 6:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href ="/datatables/css/dataTables.bootstrap4.min.css">
    <%--    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap.css">--%>
</head>
<body>
<div >
    <p>
        <a href="/kieuthue?action=create"> Thêm mới </a>
    </p>
    <p>
        <a href="/kieuthue?action=search"> Tìm kiếm</a>
    </p>
    <h2>Danh sách Kiểu thuê</h2>
    <table class="table table-hover" id="tablekieuthue">
        <thead>
        <tr>
            <th>Id</th>
            <th>Tên</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${kieuthue}" var="kieuthue">
            <tr>
                <td>${kieuthue.getId_kieuthue()}</td>
                <td>${kieuthue.getTen_kieuthue()}</td>
                <td>
                    <a href="/kieuthue?action=edit&id=${kieuthue.getId_kieuthue()}">
                        Edit
                    </a>
                </td>
                <td>
                    <a  class="btn btn-primary" href="#" role="button"
                        data-toggle="modal" data-target="#modelDelete" onclick="onXoa(${kieuthue.getId_kieuthue()})">
                        Delete
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<!-- Button trigger modal -->
<%--<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#modelDelete">--%>
<%--    Delete--%>
<%--</button>--%>

<!-- Modal -->
<div class="modal fade" id="modelDelete" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Xác nhận xóa</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">x</span>
                </button>
            </div>
            <form action="/kieuthue">
                <input type="hidden" name="id" value="" id="idkh">
                <input type="hidden" name="action" value="delete" >
                <div class="modal-body">
                    Bạn có chắc chắn muốn xóa không ?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Huy</button>
                    <button type="submit" class="btn btn-primary">Xoa</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="/js/jquery-3.5.1.min.js"></script>
<script src="/js/bootstrap.js"></script>
<script src="/datatables/js/jquery.dataTables.js"></script>
<script src="/datatables/js/dataTables.bootstrap4.min.js"></script>

<script>
    $(document).ready(function () {
        $('#tablekieuthue').dataTable(
            {
                "dom":'lrtip',
                "pageLength": 4
            }
        );
    })
    function onXoa(idDelete) {
        document.getElementById('idkh').value=idDelete;
    }
</script>
</body>
</html>