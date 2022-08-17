<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Về chúng tôi</title>
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
  
    
    <div class="site-blocks-cover overlay" style="background-image: url(<c:url value='template/images/hero_1.jpg'/>);" data-aos="fade" data-stellar-background-ratio="0.5">
        <div class="container">
          <div class="row align-items-center justify-content-center">
            <div class="col-md-7 text-center" data-aos="fade">
              <span class="caption mb-3">khách sạn</span>
              <h1 class="mb-4">liên hệ chúng tôi</h1>
            </div>
          </div>
        </div>
      </div>  

    
    <div class="site-section">
      <div class="container">
        <div class="row align-items-center">
          <div class="col-md-6 mb-5 mb-md-0">
            
              <div class="img-border">
                <a href="https://vimeo.com/28959265" class="popup-vimeo image-play">
                  <span class="icon-wrap">
                    <span class="icon icon-play"></span>
                  </span>
                  <img src="<c:url value='template/images/img_2.jpg'/>" alt="" class="img-fluid">
                </a>
              </div>

              <img src="<c:url value='template/images/img_1.jpg'/>" alt="Image" class="img-fluid image-absolute">
            
          </div>
          <div class="col-md-5 ml-auto">
            

            <div class="section-heading text-left">
              <h2 class="mb-5">mô tả</h2>
            </div>
            <p class="mb-4">ở đây chúng tôi cái vẹo gì cũng có</p>
            <p><a href="https://vimeo.com/28959265" class="popup-vimeo text-uppercase">xem Video <span class="icon-arrow-right small"></span></a></p>
          </div>
        </div>
      </div>
    </div>


    <div class="site-section bg-light">
      <div class="container">
        <div class="row">
          <div class="col-md-6 mx-auto text-center mb-5 section-heading">
            <h2 class="mb-5">các thành viên trong nhóm</h2>
          </div>
        </div>
        <div class="row">
          <div class="col-md-6 col-lg-4 mb-5">
            <div class="hotel-room text-center">
              <a href="#" class="d-block mb-4 thumbnail"><img src="<c:url value='template/images/person_1.jpg'/>" alt="Image" class="img-fluid"></a>
              <div class="p-4">
                <h3 class="heading mb-3"><a href="#">Lê Văn Luyện</a></h3>
                <p>với kĩ năn sát hại 1 lúc 7 mạng người.</p>
                <p><a href="#" class="text-primary">Read More <span class="icon-arrow-right small"></span></a></p>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-5">
            <div class="hotel-room text-center">
              <a href="#" class="d-block mb-4 thumbnail"><img src="<c:url value='template/images/person_2.jpg'/>" alt="Image" class="img-fluid"></a>
              <div class="p-4">
              <h3 class="heading mb-3"><a href="#">Tuấn Khỉ</a></h3>
              <p>đánh bạc thua, trả nợ bằng cách giết chủ nợ.</p>
              <p><a href="#" class="text-primary">Read More <span class="icon-arrow-right small"></span></a></p>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-5">
            <div class="hotel-room text-center">
              <a href="#" class="d-block mb-4 thumbnail"><img src="<c:url value='template/images/person_3.jpg'/>" alt="Image" class="img-fluid"></a>
              <div class="p-4">
              <h3 class="heading mb-3"><a href="#">tokuda</a></h3>
              <p>anh hùng đóng gạch trong thời kì đổi mới .</p>
              <p><a href="#" class="text-primary">Read More <span class="icon-arrow-right small"></span></a></p>
              </div>
            </div>
          </div>

          <div class="col-md-6 col-lg-4 mb-5">
            <div class="hotel-room text-center">
              <a href="#" class="d-block mb-4 thumbnail"><img src="<c:url value='template/images/person_4.jpg'/>" alt="Image" class="img-fluid"></a>
              <div class="p-4">
              <h3 class="heading mb-3"><a href="#">john wich</a></h3>
              <p>sát thủ, nhưng chuyên tấu hài.</p>
              <p><a href="#" class="text-primary">Read More <span class="icon-arrow-right small"></span></a></p>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-5">
            <div class="hotel-room text-center">
              <a href="#" class="d-block mb-4 thumbnail"><img src="<c:url value='template/images/person_1.jpg'/>" alt="Image" class="img-fluid"></a>
              <div class="p-4">
              <h3 class="heading mb-3"><a href="#">Lê Văn Luyện</a></h3>
              <p>với kĩ năn sát hại 1 lúc 7 mạng người.</p>
              <p><a href="#" class="text-primary">Read More <span class="icon-arrow-right small"></span></a></p>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 mb-5">
            <div class="hotel-room text-center">
              <a href="#" class="d-block mb-4 thumbnail"><img src="<c:url value='template/images/person_2.jpg'/>" alt="Image" class="img-fluid"></a>
              <div class="p-4">
              <h3 class="heading mb-3"><a href="#">Tuấn Khỉ</a></h3>
              <p>đánh bạc thua, trả nợ bằng cách giết chủ nợ.</p>
              <p><a href="#" class="text-primary">Read More <span class="icon-arrow-right small"></span></a></p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>


    <div class="py-5 upcoming-events" style="background-image: url(<c:url value='template/images/hero_1.jpg'/>); background-attachment: fixed;">
      <div class="container">
        <div class="row align-items-center">
          <div class="col-md-6">
            <h2 class="text-white">sale Off 50%</h2>
            <a href="#" class="text-white btn btn-outline-warning rounded-0 text-uppercase">đăng kí ngay</a>
          </div>
          <div class="col-md-6">
            <span class="caption"></span>
            <div id="date-countdown"></div>    
          </div>
        </div>
        
      </div>
    </div>

    <div class="site-section">
      <div class="container">
        <div class="row">
          <div class="col-md-6 mx-auto text-center mb-5 section-heading">
            <h2 class="mb-5">các dịch vụ</h2>
          </div>
        </div>
        <div class="row">
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-pool display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">bơi</h2>
            </div>
          </div>
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-desk display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">gọi điện</h2>
            </div>
          </div>
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-exit display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">thoát hiểm</h2>
            </div>
          </div>
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-parking display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">thuê xe</h2>
            </div>
          </div>

          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-hair-dryer display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">làm tóc</h2>
            </div>
          </div>

          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-minibar display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">bar sàn</h2>
            </div>
          </div>
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-drink display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">đồ uống</h2>
            </div>
          </div>
          <div class="col-sm-6 col-md-4 col-lg-3">
            <div class="text-center p-4 item">
              <span class="flaticon-cab display-3 mb-3 d-block text-primary"></span>
              <h2 class="h5">thuê xe</h2>
            </div>
          </div>

          

          

          

        </div>
      </div>
    </div>


    <div class="site-section border-top">
      <div class="container">
        <div class="row">
          <div class="col-md-6 mx-auto text-center mb-5 section-heading">
            <h2 class="mb-5">hình ảnh khách sạn</h2>
          </div>
        </div>
        <div class="row no-gutters">
          <div class="col-md-6 col-lg-3">
            <a href="images/img_1.jpg" class="image-popup img-opacity"><img src="<c:url value='template/images/img_1.jpg'/>" class="img-fluid"></a>
          </div>
          <div class="col-md-6 col-lg-3">
            <a href="images/img_2.jpg" class="image-popup img-opacity"><img src="<c:url value='template/images/img_2.jpg'/>" class="img-fluid"></a>
          </div>
          <div class="col-md-6 col-lg-3">
            <a href="images/img_3.jpg" class="image-popup img-opacity"><img src="<c:url value='template/images/img_3.jpg'/>" class="img-fluid"></a>
          </div>
          <div class="col-md-6 col-lg-3">
            <a href="images/img_4.jpg" class="image-popup img-opacity"><img src="<c:url value='template/images/img_4.jpg'/>" class="img-fluid"></a>
          </div>

          <div class="col-md-6 col-lg-3">
            <a href="images/img_4.jpg" class="image-popup img-opacity"><img src="<c:url value='template/images/img_4.jpg'/>" class="img-fluid"></a>
          </div>
          <div class="col-md-6 col-lg-3">
            <a href="images/img_5.jpg" class="image-popup img-opacity"><img src="<c:url value='template/images/img_5.jpg'/>" class="img-fluid"></a>
          </div>
          <div class="col-md-6 col-lg-3">
            <a href="images/img_6.jpg" class="image-popup img-opacity"><img src="<c:url value='template/images/img_6.jpg'/>" class="img-fluid"></a>
          </div>
          <div class="col-md-6 col-lg-3">
            <a href="images/img_7.jpg" class="image-popup img-opacity"><img src="<c:url value='template/images/img_7.jpg'/>" class="img-fluid"></a>
          </div>

        </div>
      </div>
    </div>
    


    
    <footer class="site-footer">
      <div class="container">
        

        <div class="row">
          <div class="col-md-4">
            <h3 class="footer-heading mb-4 text-white">tt chúng tôi</h3>
            <p>...</p>
            <p><a href="#" class="btn btn-primary pill text-white px-4">Read More</a></p>
          </div>
          <div class="col-md-6">
            <div class="row">
              <div class="col-md-6">
                <h3 class="footer-heading mb-4 text-white">danh sách</h3>
                  <ul class="list-unstyled">
                    <li><a href="#">...</a></li>
                    <li><a href="#">...</a></li>
                    <li><a href="#">...</a></li>
                    <li><a href="#">...</a></li>
                    <li><a href="#">...</a></li>
                    <li><a href="#">...</a></li>
                  </ul>
              </div>
              <div class="col-md-6">
                <h3 class="footer-heading mb-4 text-white">dịch vụ</h3>
                  <ul class="list-unstyled">
                    <li><a href="#">...</a></li>
                    <li><a href="#">...</a></li>
                    <li><a href="#"> ...</a></li>
                    <li><a href="#">...</a></li>
                    <li><a href="#">...</a></li>
                  </ul>
              </div>
            </div>
          </div>

          
          <div class="col-md-2">
            <div class="col-md-12"><h3 class="footer-heading mb-4 text-white">liên hệ chúng toi</h3></div>
              <div class="col-md-12">
                <p>
                  <a href="#" class="pb-2 pr-2 pl-0"><span class="icon-facebook"></span></a>
                  <a href="#" class="p-2"><span class="icon-twitter"></span></a>
                  <a href="#" class="p-2"><span class="icon-instagram"></span></a>
                  <a href="#" class="p-2"><span class="icon-vimeo"></span></a>

                </p>
              </div>
          </div>
        </div>
        <div class="row pt-5 mt-5 text-center">
          <div class="col-md-12">
    
          </div>
          
        </div>
      </div>
    </footer>
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