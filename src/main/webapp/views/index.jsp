<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Trang chủ</title>
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
    
    
    <div class="site-navbar-wrap js-site-navbar bg-white">
      
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
  
    
    <div class="slide-one-item home-slider owl-carousel">
      
      <div class="site-blocks-cover overlay" style="background-image: url(<c:url value='template/images/hero_1.jpg'/>);" data-aos="fade" data-stellar-background-ratio="0.5">
      </div>  

      <div class="site-blocks-cover overlay" style="background-image: url(<c:url value='template/images/hero_2.jpg'/>);" data-aos="fade" data-stellar-background-ratio="0.5">
        
      </div> 

      <div class="site-blocks-cover overlay" style="background-image: url(<c:url value='template/images/hero_3.jpg'/>);" data-aos="fade" data-stellar-background-ratio="0.5">
        
      </div> 

    </div>

    <div class="site-section bg-light">
      <div class="container">
        <div class="row">
          <div class="col-md-6 mx-auto text-center mb-5 section-heading">
            <h2 class="mb-5">Danh sách loại phòng</h2>
          </div>
        </div>
        <div class="row">
        
        <c:forEach items="${listTypeRoom}" var="list">
          <div class="col-md-6 col-lg-4 mb-5">
            <div class="hotel-room text-center">
              <a href="search?id=${list.id}" class="d-block mb-0 thumbnail"><img src="${list.image}" alt="Image" class="img-fluid"></a>
              <div class="hotel-room-body">
                <h3 class="heading mb-0"><a href="search?id=${list.id}">${list.name}</a></h3>
               <%--  <strong class="price">${list.price}đ / một đêm</strong> --%>
              </div>
            </div>
          </div>
          </c:forEach>
          
        </div>
      </div>
    </div>




    <div class="site-section">
      <div class="container">
        <div class="row">
          <div class="col-md-6 mx-auto text-center mb-5 section-heading">
            <h2 class="mb-5">TÍNH NĂNG HIỆN CÓ</h2>
          </div>
        </div>
        <div class="row">
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-pool display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">Hồ bơi</h2>
            </div>
          </div>
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-desk display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">Gọi thức ăn nhanh</h2>
            </div>
          </div>
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-hair-dryer display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">Tạo mẫu tóc</h2>
            </div>
          </div>

          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-minibar display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">Quẩy bar</h2>
            </div>
          </div>
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-drink display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">đồ ăn xịn xò</h2>
            </div>
          </div>
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-cab display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">Thuê ô tô</h2>
            </div>
          </div>

          

          

          

        </div>
      </div>
    </div>
    
    <div class="py-5 upcoming-events" style="background-image: url('<c:url value='template/images/hero_1.jpg'/>'); background-attachment: fixed;">
     
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