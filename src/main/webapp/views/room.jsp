<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>qlks</title>
     <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="<c:url value='template/fonts/icomoon/style.css'/>">
    <link rel="stylesheet" href="<c:url value='template/css/bootstrap.min.css'/>">
    <link rel="stylesheet" href="<c:url value='template/css/magnific-popup.css'/>">
    <link rel="stylesheet" href="<c:url value='template/css/owl.carousel.min.css'/>">
    <link rel="stylesheet" href="<c:url value='template/css/owl.theme.default.min.css'/>">
    <link rel="stylesheet" href="<c:url value='template/fonts/flaticon/font/flaticon.css'/>">
    <link rel="stylesheet" href="<c:url value='template/css/style.css'/>">
    
  </head>
  <body>
  
  <div class="site-wrap">

    <div class="site-mobile-menu">
      <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
          <span class="icon-close2 js-menu-toggle"></span>
        </div>
      </div>
      <div class="site-mobile-menu-body"></div>
    </div> <!-- .site-mobile-menu -->
    
    
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
        <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img class="d-block w-100" src="${room.image}" alt="First slide">
            </div>
            <!-- <div class="carousel-item">
              <img class="d-block w-100" src="images/img_2.jpg" alt="Second slide">
            </div> -->
          </div>
          <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>
      </div>
    </div>

    <div class="container description">
      <div class="row"> 
          <div class="col-md-6">
            <h3>${room.name}</h3>
            <div class="des">
              ${room.description}
            </div>
          </div>
          <div class="col-md-1"></div>
          <div class="col-md-4 price-box">
              <div class="row">
                  <div class="col-sm-12"><h5>900.000đ/đêm</h5></div>
                  <div class="col-sm-12">
                  <form method="post" action="room">
                      <div class="row">
                          <div class="col-sm-5">
                              <label for="tungay">Từ ngày</label>
                              <input type="date" name="tungay" class="form-control">
                          </div>
                          <div class="col-sm-2">
                            <p style="visibility: hidden;">s</p>
                            <p>đến</p>
                          </div>
                          <div class="col-sm-5">
                              <label for="denngay">Từ ngày</label>
                              <input type="date" name="denngay" class="form-control">
                          </div>
                          <div class="col-sm-12">
                          	<input type="hidden" name="id" value="${room.id}">
                            <input type="submit" name="sub" value="Đặt phòng" class="form-control" id="btn-datphong">
                          </div>
                      </div>
                      </form>
                  </div>
              </div>
          </div>
      </div>
    </div>
    <div class="py-5 upcoming-events" style="background-image: url(<c:url value='template/images/hero_1.jpg'/>); background-attachment: fixed;">
    </div>

  
  <script src="<c:url value='template/js/jquery-3.3.1.min.js'/>"></script>
  <script src="<c:url value='template/js/jquery-migrate-3.0.1.min.js'/>"></script>
  <script src="<c:url value='template/js/jquery-ui.js'/>"></script>
  <script src="<c:url value='template/js/aos.js'/>"></script>
  <script src="<c:url value='template/js/main.js'/>"></script>
  <script src="<c:url value='template/js/popper.min.js'/>"></script>
  <script src="<c:url value='template/js/bootstrap.min.js'/>"></script>
  <script src="<c:url value='template/js/owl.carousel.min.js'/>"></script>
  <script src="<c:url value='template/js/jquery.stellar.min.js'/>"></script>
  <script src="<c:url value='template/js/jquery.countdown.min.js'/>"></script>
  <script src="<c:url value='template/js/jquery.magnific-popup.min.js'/>"></script>
  <script src="<c:url value='template/js/mediaelement-and-player.min.js'/>"></script>
    

  <script>
      document.addEventListener('DOMContentLoaded', function() {
                var mediaElements = document.querySelectorAll('video, audio'), total = mediaElements.length;

                for (var i = 0; i < total; i++) {
                    new MediaElementPlayer(mediaElements[i], {
                        pluginPath: 'https://cdn.jsdelivr.net/npm/mediaelement@4.2.7/build/',
                        shimScriptAccess: 'always',
                        success: function () {
                            var target = document.body.querySelectorAll('.player'), targetTotal = target.length;
                            for (var j = 0; j < targetTotal; j++) {
                                target[j].style.visibility = 'visible';
                            }
                  }
                });
                }
            });
    </script>

    
  </body>
</html>