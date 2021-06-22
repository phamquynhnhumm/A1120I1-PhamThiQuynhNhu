<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/7/2021
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
      <header class="row">
          <div class="col-sm-8 shopping-mall">
              <img class="avatar" src="img/avatar_1.jpg" width="60px" height="60px">
          </div>
          <h4>Phạm Thị Quỳnh Như</h4>
      </header>
      <nav class="navbar navbar-expand-lg  navbar-dark bd-bark  " style="background: black; color: white">
          <a class="navbar-brand" href="#">
              <span class="glyphicon glyphicon-home"></span>
              Trang Chủ
          </a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="nav nav-tabs mr-auto">
                  <li class="nav-item">
                      <a class="nav-link active"  data-toggle="tab" style="background: black; color: white" href="#nhanvien">Nhân Viên</a>
                  </li>
                  <li class="nav-item">
                      <a class="nav-link" style="background: black; color: white" href="#khachhang">Khách Hàng</a>
                  </li>
                  <li class="nav-item">
                      <a class="nav-link" style="background: black; color: white" href="#dichvu">Dịch vụ</a>
                  </li>
                  <li class="nav-item ">
                      <a class="nav-link " style="background: black; color: white" href="#hopdong">Hợp đồng</a>
                  </li>
              </ul>
              <ul class="navbar-nav mr-right">
                  <li class="nav-item">
                      <form action="">
                          <div class="input-group mb-4 border rounded-pill p-1">
<%--                              <i class="fas fa-search md-6"></i>--%>
                              <input type="search" placeholder="What're you searching for?" aria-describedby="button-addon4" class="form-control border-0">
                          </div>
                      </form>
                  </li>
              </ul>
          </div>
      </nav>
      <nav >
          <div class="row">
              <article class="col-sm-4">
                      <div class="tab-content">
                          <div id="nhanvien" class="container tab-pane fade"><br>
                              <div class="nav nav-tabs">
                                  <ul class="nav nav-tabs mr-auto">
                                      <li class="nav-item">
                                  <a class="nav-link active" href="#xemnhanvien">Xem danh sách nhân viên</a>
                                  <a class="nav-link " href="#themnhanvien">Thêm mới nhân viên</a>
                                  <a class="nav-link " href="#suanhanvien">Sửa thông tin nhân viên</a>
                                  <a class="nav-link " href="#xoanhanvien">Xóa nhân viên</a>
                                      </li>
                                  </ul>
                              </div>
                          </div>

                          <div id="khachhang" class="container tab-pane fade"><br>
                              <ul class="nav nav-tabs mr-auto">
                                  <li class="nav-item">
                              <a class="nav-link active" href="#xemkhachhang">
                              </a>
                              <a class="nav-link" href="#themkhachhang">Thêm mới khách hàng</a>
                              <a class="nav-link " href="#suakhachhang">Sửa thông tin khách hàng</a>
                              <a class="nav-link " href="#xoakhachhang">Xóa khách hàng</a>
                                  </li>
                              </ul>
                          </div>
                          <div id="dichvu" class="container tab-pane fade"><br>
                              <ul class="nav nav-tabs mr-auto">
                                  <li class="nav-item">
                              <a class="nav-link " href="#xemdichvu">Xem danh sách dịch vụ</a>
                              <a class="nav-link " href="#themdichvu">Thêm mới dịch vụ</a>
                              <a class="nav-link " href="#suadichvu">Sửa thông tin dịch vụ</a>
                              <a class="nav-link active" href="#xoadichvu">Xóa dịch vụ</a>
                                  </li>
                              </ul>
                          </div>
                          <div id="hopdong" class="container tab-pane active"><br>
                              <ul class="nav nav-tabs mr-auto">
                                  <li class="nav-item">
                                      <a class="nav-link active" href="#xemhopdong">Xem danh sách hợp đồng</a>
                                      <a class="nav-link" href="#themhopdong">Thêm mới hợp đồng</a>
                                      <a class="nav-link " href="#suahopdong">Sửa thông tin hợp đồng</a>
                                      <a class="nav-link " href="#xoahopdong">Xóa hợp đồng</a>
                                  </li>
                              </ul>
                          </div>
                      </div>
              </article>
              <article class="col-sm-8">
                        <div class="tab-content">
                            <div id="xemnhanvien" class="container tab-pane fade"><br>
                                <div class="nav nav-tabs">
                                    <ul class="nav nav-tabs mr-auto">
                                        <li class="nav-item">
                                            <a href="/nhanvien?action=create"> Thêm mới nhân viên</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div id="themnhanvien" class="container tab-pane fade"><br>
                                <div class="nav nav-tabs">
                                    <ul class="nav nav-tabs mr-auto">
                                        <li class="nav-item">
                                            <h4>nhân viên dang duoc them</h4>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
              </article>
          </div>
      </nav>

      <footer class="card">
          <div class="card-header text-center">
              <p>Codegym &quynhnhucopy : 2021</p>
          </div>
      </footer>
  </div>
  <script>
      $(document).ready(function(){
          $(".nav-tabs a").click(function(){
              $(this).tab('show');
          });
      });
  </script>
  </body>

</html>
