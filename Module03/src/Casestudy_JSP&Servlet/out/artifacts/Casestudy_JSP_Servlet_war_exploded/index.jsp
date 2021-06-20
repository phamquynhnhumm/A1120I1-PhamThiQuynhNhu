<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/7/2021
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
    <style>
      .avatar
      {
        padding: 6px;
      }
      .chu
      {
        /*left: 400px;*/
        /*padding: 30px 30px 6px 500px;*/
      }
        .form-control:focus {
            box-shadow: none;
        }
        .nav1
        {
            padding: 6px;
            border:  1px solid black;
        }
    </style>
  </head>
  <body>
  <div class="container-fluid">
   <div class="row" style="height: 80px;border: 1px solid ;">
     <div class="col-sm-6">
       <img class="avatar" src="img/avatar_1.jpg" width="60px" height="60px">
   </div>
     <div class="col-sm-6 chu">
         <h4>Phạm Thị Quỳnh Như</h4>

     </div>
   </div>
    <div class="row">
        <div class="col-sm-6" style="display: flex" >
            <a class="nav-link active" href="#">Trang Chủ</a>
            <a class="nav-link" href="#">Nhân Viên</a>
            <a class="nav-link" href="#">Khách Hàng</a>
            <a class="nav-link disabled" href="#">Dịch vụ</a>
            <a class="nav-link disabled" href="#">Contract</a>
        </div>
        <div class="col-sm-6">
            <form action="">
                <div class="input-group mb-4 border rounded-pill p-1">
                    <i class="fas fa-search md-6"></i>
                    <input type="search" placeholder="What're you searching for?" aria-describedby="button-addon4" class="form-control bg-none border-0">
                </div>
            </form>
        </div>
    </div>
      <div class=" row nav1" >
          <div class="col-sm-2">
              div
          </div>
          <div class="col-sm-10">
              nội dung
          </div>
      </div>
      <div class="row" style="border: 1px solid black">
          chân trang
      </div>
  </div>
  </body>
</html>
