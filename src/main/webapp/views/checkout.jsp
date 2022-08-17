<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Các phòng đã đặt</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700|Work+Sans:300,400,700" rel="stylesheet">
    <link rel="stylesheet" href="fonts/icomoon/style.css">

     <link rel="stylesheet" href="<c:url value='template/css/bootstrap.min.css'/>">
     <link rel="stylesheet" href="<c:url value='template/css/magnific-popup.css'/>">
     <link rel="stylesheet" href="<c:url value='template/css/jquery-ui.css'/>">
     <link rel="stylesheet" href="<c:url value='template/css/style.css'/>">
    
  </head>
  <body>
  
<div class="menu">
      
      <div class="container">
        <div class="site-navbar bg-light">
          <div class="py-1">
            <div class="row align-items-center">
              <div class="col-2">
                <h2 class="mb-0 site-logo"><a href="index.html">khách sạn continental</a></h2>
              </div>
              <div class="col-10">
                <nav class="site-navigation text-right" role="navigation">
                  <div class="container">
                    
                    <div class="d-inline-block d-lg-none  ml-md-0 mr-auto py-3"><a href="#" class="site-menu-toggle js-menu-toggle"><span class="icon-menu h3"></span></a></div>
                    <ul class="site-menu js-clone-nav d-none d-lg-block">
                      <li class="active">
                        <a href="trang-chu">Trang chủ</a>
                      </li>
                      <li class="has-children">
                        <a>Phòng</a>
                        <ul class="dropdown arrow-top">
                        	<c:forEach items="${listTypeRoom}" var="list">
	                          <li><a href="search?id=${list.id}">${list.name}</a></li>
                          	</c:forEach>
                        </ul>
                      </li>
                      <li class="has-children">
                        <a>Tài khoản</a>
                        <ul class="dropdown arrow-top">
                          	<li><a href="regis">Đăng kí</a></li>
                      		<li><a href="login">Đăng nhập</a></li>
                        </ul>
                      </li>
                      <li><a href="about">về chúng tôi</a></li>
                      <li><a href="checkout">phòng đã đặt</a></li>
                      <li>
                        <form method="get" action="search">
                          <input type="text" name="search" placeholder="search" class="form-control">
                        </form>
                      <li>
                    </ul>
                  </div>
                </nav>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    

    <div class="site-section bg-light">
      <div class="container">
        <div class="col-md-12">
          <h5>Các phòng đã đặt</h5>
        </div>
        <div class="col-md-12">
          <table class="table">
            <thead class="thead-dark">
              <tr>
                <th scope="col">id</th>
                <th scope="col">loại phòng</th>
                <th scope="col">tên phòng</th>
                <th scope="col">giá</th>
                <th scope="col">số ngày đặt</th>
                <th scope="col">bắt đầu</th>
                <th scope="col">kết thúc</th>
                <th scope="col"></th>
              </tr>
            </thead>
            <tbody>
            <c:forEach items="${listInvoice}" var="listiv">
              <tr>
                <th scope="row">${listiv.id}</th>
                <td>${listiv.room.typeRoom.name}</td>
                <td><a href="room?id=${listiv.room.id}">${listiv.room.name}</a></td>
                <td>${listiv.total_price}</td>
                <td>${listiv.numOfDay}</td>
                <td>${listiv.start}</td>
                <td>${listiv.end}</td>
                <td><a href="deleteInvoice?id=${listiv.id}">hủy</a></td>
              </tr>
              </c:forEach>
            </tbody>
          </table>

        </div>
      </div>
    </div>


    
    <div class="py-5 upcoming-events" style="background-image: url('images/hero_1.jpg'); background-attachment: fixed;">
     
    </div>

  
  <script src="<c:url value='template/js/jquery-3.3.1.min.js'/>"></script>
  <script src="<c:url value='template/js/jquery-ui.js'/>"></script>
  <script src="<c:url value='template/js/popper.min.js'/>"></script>
  <script src="<c:url value='template/js/bootstrap.min.js'/>"></script>
  <script src="<c:url value='template/js/main.js'/>"></script>
  

    

    
  </body>
</html>