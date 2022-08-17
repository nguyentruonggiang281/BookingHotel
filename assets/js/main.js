AOS.init({
 	duration: 800,
 	easing: 'slide',
 	once: false
 });

jQuery(document).ready(function($) {

	"use strict";

	

	var siteMenuClone = function() {

		$('.js-clone-nav').each(function() {
			var $this = $(this);
			$this.clone().attr('class', 'site-nav-wrap').appendTo('.site-mobile-menu-body');
		});


		setTimeout(function() {
			
			var counter = 0;
      $('.site-mobile-menu .has-children').each(function(){
        var $this = $(this);
        
        $this.prepend('<span class="arrow-collapse collapsed">');

        $this.find('.arrow-collapse').attr({
          'data-toggle' : 'collapse',
          'data-target' : '#collapseItem' + counter,
        });

        $this.find('> ul').attr({
          'class' : 'collapse',
          'id' : 'collapseItem' + counter,
        });

        counter++;

      });

    }, 1000);

		$('body').on('click', '.arrow-collapse', function(e) {
      var $this = $(this);
      if ( $this.closest('li').find('.collapse').hasClass('show') ) {
        $this.removeClass('active');
      } else {
        $this.addClass('active');
      }
      e.preventDefault();  
      
    });

		$(window).resize(function() {
			var $this = $(this),
				w = $this.width();

			if ( w > 768 ) {
				if ( $('body').hasClass('offcanvas-menu') ) {
					$('body').removeClass('offcanvas-menu');
				}
			}
		})

		$('body').on('click', '.js-menu-toggle', function(e) {
			var $this = $(this);
			e.preventDefault();

			if ( $('body').hasClass('offcanvas-menu') ) {
				$('body').removeClass('offcanvas-menu');
				$this.removeClass('active');
			} else {
				$('body').addClass('offcanvas-menu');
				$this.addClass('active');
			}
		}) 

		// click outisde offcanvas
		$(document).mouseup(function(e) {
	    var container = $(".site-mobile-menu");
	    if (!container.is(e.target) && container.has(e.target).length === 0) {
	      if ( $('body').hasClass('offcanvas-menu') ) {
					$('body').removeClass('offcanvas-menu');
				}
	    }
		});
	}; 
	siteMenuClone();


	var sitePlusMinus = function() {
		$('.js-btn-minus').on('click', function(e){
			e.preventDefault();
			if ( $(this).closest('.input-group').find('.form-control').val() != 0  ) {
				$(this).closest('.input-group').find('.form-control').val(parseInt($(this).closest('.input-group').find('.form-control').val()) - 1);
			} else {
				$(this).closest('.input-group').find('.form-control').val(parseInt(0));
			}
		});
		$('.js-btn-plus').on('click', function(e){
			e.preventDefault();
			$(this).closest('.input-group').find('.form-control').val(parseInt($(this).closest('.input-group').find('.form-control').val()) + 1);
		});
	};
	// sitePlusMinus();


	var siteSliderRange = function() {
    $( "#slider-range" ).slider({
      range: true,
      min: 0,
      max: 500,
      values: [ 75, 300 ],
      slide: function( event, ui ) {
        $( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
      }
    });
    $( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
      " - $" + $( "#slider-range" ).slider( "values", 1 ) );
	};
	// siteSliderRange();


	var siteMagnificPopup = function() {
		$('.image-popup').magnificPopup({
	    type: 'image',
	    closeOnContentClick: true,
	    closeBtnInside: false,
	    fixedContentPos: true,
	    mainClass: 'mfp-no-margins mfp-with-zoom', // class to remove default margin from left and right side
	     gallery: {
	      enabled: true,
	      navigateByImgClick: true,
	      preload: [0,1] // Will preload 0 - before current, and 1 after the current image
	    },
	    image: {
	      verticalFit: true
	    },
	    zoom: {
	      enabled: true,
	      duration: 300 // don't foget to change the duration also in CSS
	    }
	  });

	  $('.popup-youtube, .popup-vimeo, .popup-gmaps').magnificPopup({
	    disableOn: 700,
	    type: 'iframe',
	    mainClass: 'mfp-fade',
	    removalDelay: 160,
	    preloader: false,

	    fixedContentPos: false
	  });
	};
	siteMagnificPopup();


	var siteCarousel = function () {
		if ( $('.nonloop-block-13').length > 0 ) {
			$('.nonloop-block-13').owlCarousel({
		    center: false,
		    items: 1,
		    loop: true,
				stagePadding: 0,
				autoplay: true,
		    margin: 20,
		    nav: true,
		    dots: true,
				navText: ['<span class="icon-arrow_back">', '<span class="icon-arrow_forward">'],
		    responsive:{
	        600:{
	        	margin: 20,
	        	stagePadding: 0,
	          items: 1
	        },
	        1000:{
	        	margin: 20,
	        	stagePadding: 0,
	          items: 2
	        },
	        1200:{
	        	margin: 20,
	        	stagePadding: 0,
	          items: 3
	        }
		    }
			});
		}



		if ( $('.nonloop-block-14').length > 0 ) {
			$('.nonloop-block-14').owlCarousel({
		    center: false,
		    items: 1,
		    loop: true,
				stagePadding: 0,
				autoplay: true,
		    margin: 20,
		    nav: true,
		    dots: true,
				navText: ['<span class="icon-arrow_back">', '<span class="icon-arrow_forward">'],
		    responsive:{
	        600:{
	        	margin: 20,
	        	stagePadding: 0,
	          items: 1
	        },
	        1000:{
	        	margin: 20,
	        	stagePadding: 0,
	          items: 2
	        }
	        
		    }
			});
		}

		if ( $('.nonloop-block-15').length > 0 ) {
			$('.nonloop-block-15').owlCarousel({
		    center: false,
		    items: 1,
		    loop: true,
				stagePadding: 0,
				autoplay: true,
		    margin: 20,
		    nav: true,
		    dots: true,
				navText: ['<span class="icon-arrow_back">', '<span class="icon-arrow_forward">'],
		    responsive:{
	        600:{
	        	margin: 20,
	        	stagePadding: 0,
	          items: 1,
	          nav: false,
		    		dots: true
	        },
	        1000:{
	        	margin: 20,
	        	stagePadding: 0,
	          items: 2,
	          nav: true,
		    		dots: true
	        },
	        1200:{
	        	margin: 20,
	        	stagePadding: 0,
	          items: 3,
	          nav: true,
		    		dots: true
	        }
		    }
			});
		}

		if ( $('.slide-one-item').length > 0 ) {
			$('.slide-one-item').owlCarousel({
		    center: false,
		    items: 1,
		    loop: true,
				stagePadding: 0,
		    margin: 0,
		    autoplay: true,
		    pauseOnHover: false,
		    animateOut: 'fadeOut',
    		animateIn: 'fadeIn',
		    nav: true,
		    navText: ['<span class="icon-arrow_back">', '<span class="icon-arrow_forward">']
		  });
	  }
	};
	siteCarousel();

	var siteStellar = function() {
		$(window).stellar({
	    responsive: false,
	    parallaxBackgrounds: true,
	    parallaxElements: true,
	    horizontalScrolling: false,
	    hideDistantElements: false,
	    scrollProperty: 'scroll'
	  });
	};
	siteStellar();

	var siteCountDown = function() {

		if ( $('#date-countdown').length > 0 ) {
			$('#date-countdown').countdown('2020/10/10', function(event) {
			  var $this = $(this).html(event.strftime(''
			    + '<span class="countdown-block"><span class="label">%w</span> weeks </span>'
			    + '<span class="countdown-block"><span class="label">%d</span> days </span>'
			    + '<span class="countdown-block"><span class="label">%H</span> hr </span>'
			    + '<span class="countdown-block"><span class="label">%M</span> min </span>'
			    + '<span class="countdown-block"><span class="label">%S</span> sec</span>'));
			});
		}
				
	};
	siteCountDown();

	var siteDatePicker = function() {

		if ( $('.datepicker').length > 0 ) {
			$('.datepicker').datepicker();
		}

	};
	siteDatePicker();


	var windowScrolled = function() {


		$(window).scroll(function() {

			var $w = $(this), st = $w.scrollTop(), navbar = $('.js-site-navbar') ;

			if ( st > 100 ) {
				navbar.addClass('scrolled');
			} else {
				navbar.removeClass('scrolled');
			}
			
		})

	}
	windowScrolled();

});
=======
(function ($) {
    "use strict";
    
    new WOW().init();  
    /*---background image---*/
	function dataBackgroundImage() {
		$('[data-bgimg]').each(function () {
			var bgImgUrl = $(this).data('bgimg');
			$(this).css({
				'background-image': 'url(' + bgImgUrl + ')', // + meaning concat
			});
		});
    }
    
    $(window).on('load', function () {
        dataBackgroundImage();
    });
    
    /*---
       stickey menu
    ---*/
    $(window).on('scroll',function() {    
           var scroll = $(window).scrollTop();
           if (scroll < 100) {
            $(".sticky-header").removeClass("sticky");
           }else{
            $(".sticky-header").addClass("sticky");
           }
    });
    
    /* slider activation */
    $('.slider_area').owlCarousel({
        animateOut: 'fadeOut',
        autoplay: true,
		loop: true,
        nav: true,
        autoplay: false,
        autoplayTimeout: 8000,
        items: 1,
        dots:true,
        navText: ['<i class="fa fa-angle-left"></i>','<i class="fa fa-angle-right"></i>'],
    });

    /* product_column3 activation */
    $('.product_column3').slick({
        centerMode: true,
        centerPadding: '0',
        slidesToShow: 3,
        arrows:true,
        rows: 2,
        prevArrow:'<button class="prev_arrow"><i class="fa fa-angle-left"></i></button>',
        nextArrow:'<button class="next_arrow"><i class="fa fa-angle-right"></i></button>', 
        responsive:[
            {
              breakpoint: 300,
              settings: {
                slidesToShow: 1,
                  slidesToScroll: 1,
              }
            },
            {
              breakpoint: 768,
              settings: {
                  slidesToShow: 2,
                  slidesToScroll: 2,
              }
            },
            {
              breakpoint: 992,
              settings: {
                slidesToShow: 3,
                  slidesToScroll: 3,
              }
            },
            {
              breakpoint: 1200,
              settings: {
                slidesToShow: 2,
                  slidesToScroll: 2,
              }
            },
        ]
    });
    
    /* product_column3 activation */
    $('.product_column4').slick({
        centerMode: true,
        centerPadding: '0',
        slidesToShow: 4,
        arrows:true,
        rows: 2,
        prevArrow:'<button class="prev_arrow"><i class="fa fa-angle-left"></i></button>',
        nextArrow:'<button class="next_arrow"><i class="fa fa-angle-right"></i></button>', 
        responsive:[
            {
              breakpoint: 300,
              settings: {
                slidesToShow: 1,
                  slidesToScroll: 1,
              }
            },
            {
              breakpoint: 768,
              settings: {
                  slidesToShow: 2,
                  slidesToScroll: 2,
              }
            },
            {
              breakpoint: 992,
              settings: {
                slidesToShow: 3,
                  slidesToScroll: 3,
              }
            },
           
        ]
    });

    /* product_rows_column4 activation */
    $('.product_rows_column4').slick({
        centerMode: true,
        centerPadding: '0',
        slidesToShow: 4,
        arrows:true,
        rows: 3,
        prevArrow:'<button class="prev_arrow"><i class="fa fa-angle-left"></i></button>',
        nextArrow:'<button class="next_arrow"><i class="fa fa-angle-right"></i></button>', 
        responsive:[
            {
              breakpoint: 300,
              settings: {
                slidesToShow: 1,
                  slidesToScroll: 1,
              }
            },
            {
              breakpoint: 768,
              settings: {
                  slidesToShow: 2,
                  slidesToScroll: 2,
              }
            },
            {
              breakpoint: 992,
              settings: {
                slidesToShow: 3,
                  slidesToScroll: 3,
              }
            },
           
        ]
    });
    
    /* product_row activation */
    $('.product_row1').slick({
        centerMode: true,
        centerPadding: '0',
        slidesToShow: 4,
        arrows:true,
        prevArrow:'<button class="prev_arrow"><i class="fa fa-angle-left"></i></button>',
        nextArrow:'<button class="next_arrow"><i class="fa fa-angle-right"></i></button>', 
        responsive:[
            {
              breakpoint: 300,
              settings: {
                slidesToShow: 1,
                  slidesToScroll: 1,
              }
            },
            {
              breakpoint: 768,
              settings: {
                  slidesToShow: 2,
                  slidesToScroll: 2,
              }
            },
            {
              breakpoint: 992,
              settings: {
                slidesToShow: 3,
                  slidesToScroll: 3,
              }
            },
           
        ]
    });
    
    /* product_row activation */
    $('.product_slick_column5').slick({
        centerMode: true,
        centerPadding: '0',
        slidesToShow: 5,
        arrows:true,
        prevArrow:'<button class="prev_arrow"><i class="fa fa-angle-left"></i></button>',
        nextArrow:'<button class="next_arrow"><i class="fa fa-angle-right"></i></button>', 
        responsive:[
            {
              breakpoint: 300,
              settings: {
                slidesToShow: 1,
                  slidesToScroll: 1,
              }
            },
            {
              breakpoint: 768,
              settings: {
                  slidesToShow: 2,
                  slidesToScroll: 2,
              }
            },
            {
              breakpoint: 992,
              settings: {
                slidesToShow: 3,
                  slidesToScroll: 3,
              }
            },
             {
              breakpoint: 1200,
              settings: {
                slidesToShow: 4,
                  slidesToScroll: 4,
              }
            },
           
        ]
    });
    
    /* product_column3 activation */
    $('.product_column5').slick({
        centerMode: true,
        centerPadding: '0',
        slidesToShow: 5,
        arrows:true,
        rows: 2,
        prevArrow:'<button class="prev_arrow"><i class="fa fa-angle-left"></i></button>',
        nextArrow:'<button class="next_arrow"><i class="fa fa-angle-right"></i></button>', 
        responsive:[
            {
              breakpoint: 300,
              settings: {
                slidesToShow: 1,
                  slidesToScroll: 1,
              }
            },
            {
              breakpoint: 768,
              settings: {
                  slidesToShow: 2,
                  slidesToScroll: 2,
              }
            },
            {
              breakpoint: 992,
              settings: {
                slidesToShow: 3,
                  slidesToScroll: 3,
              }
            },
            {
              breakpoint: 1200,
              settings: {
                slidesToShow: 4,
                  slidesToScroll: 4,
              }
            },
           
        ]
    });
    
    /* blog column3 activation */
    $('.blog_column3').owlCarousel({
        autoplay: true,
		loop: true,
        nav: true,
        autoplay: false,
        autoplayTimeout: 8000,
        items: 3,
        dots:false,
        margin: 30,
        navText: ['<i class="fa fa-angle-left"></i>','<i class="fa fa-angle-right"></i>'],
        responsiveClass:true,
		responsive:{
				0:{
				items:1,
			},
           768:{
				items:2,
			},
            992:{
				items:3,
			},
		  
        }
    });
    
    /* instagram column5 activation */
    $('.instagram_column5').owlCarousel({
        autoplay: true,
		loop: true,
        nav: true,
        autoplay: false,
        autoplayTimeout: 8000,
        items: 5,
        dots:false,
        margin: 30,
        navText: ['<i class="fa fa-angle-left"></i>','<i class="fa fa-angle-right"></i>'],
        responsiveClass:true,
		responsive:{
				0:{
				items:1,
			},
            300:{
				items:2,
                margin: 20,
			},
            500:{
				items:3,
                margin: 20,
			},
            768:{
				items:4,
			},
            1200:{
				items:5,
			},
		  
        }
    });
    
    /* shipping_column5 activation */
    $('.shipping_column5').owlCarousel({
        autoplay: true,
		loop: true,
        nav: false,
        autoplay: false,
        autoplayTimeout: 8000,
        items: 6,
        dots:false,
        margin: 20,
        responsiveClass:true,
		responsive:{
				0:{
				items:1,
			},
            320:{
				items:2,
			},
            480:{
				items:3,
			},
            768:{
				items:4,
			},
            992:{
				items:5,
			},
            1200:{
				items:6,
			},
		  
        }
    });
    
    /* product_three_column4activation */
    $('.product_three_column4').owlCarousel({
        autoplay: true,
		loop: true,
        nav: true,
        autoplay: false,
        autoplayTimeout: 8000,
        items: 4,
        dots:false,
        margin: 30,
        navText: ['<i class="fa fa-angle-left"></i>','<i class="fa fa-angle-right"></i>'],
        responsiveClass:true,
		responsive:{
				0:{
				items:1,
			},
            300:{
				items:2,
                margin: 20,
			},
            768:{
				items:3,
			},
            992:{
				items:4,
			},
 
        }
    });
    
    /* single product activation */
    $('.single-product-active').owlCarousel({
        autoplay: true,
		loop: true,
        nav: true,
        autoplay: false,
        autoplayTimeout: 8000,
        items: 4,
        margin:15,
        dots:false,
        navText: ['<i class="fa fa-angle-left"></i>','<i class="fa fa-angle-right"></i>'],
        responsiveClass:true,
		responsive:{
				0:{
				items:1,
			},
            320:{
				items:2,
			},
            992:{
				items:3,
			},
            1200:{
				items:4,
			},


		  }
    });
    
    /* blog active activation */
    $('.blog_thumb_active').owlCarousel({
        autoplay: true,
		loop: true,
        nav: true,
        autoplay: false,
        autoplayTimeout: 8000,
        items: 1,
        dots:false,
        navText: ['<i class="fa fa-angle-left"></i>','<i class="fa fa-angle-right"></i>'],
    });
    
    /* product navactive activation */
    $('.product_navactive').owlCarousel({
        autoplay: true,
		loop: true,
        nav: true,
        autoplay: false,
        autoplayTimeout: 8000,
        items: 4,
        dots:false,
        navText: ['<i class="fa fa-angle-left"></i>','<i class="fa fa-angle-right"></i>'],
        responsiveClass:true,
		responsive:{
				0:{
				items:1,
			},
            250:{
				items:2,
			},
            480:{
				items:3,
			},
            768:{
				items:4,
			},
		  
        }
    });

    $('.modal').on('shown.bs.modal', function (e) {
        $('.product_navactive').resize();
    })

    $('.product_navactive a').on('click',function(e){
      e.preventDefault();

      var $href = $(this).attr('href');

      $('.product_navactive a').removeClass('active');
      $(this).addClass('active');

      $('.product-details-large .tab-pane').removeClass('active show');
      $('.product-details-large '+ $href ).addClass('active show');

    })
    
    
     /*---MailChimp---*/
    $('#mc-form').ajaxChimp({
        language: 'en',
        callback: mailChimpResponse,
        // ADD YOUR MAILCHIMP URL BELOW HERE!
        url: 'http://devitems.us11.list-manage.com/subscribe/post?u=6bbb9b6f5827bd842d9640c82&amp;id=05d85f18ef'

    });
    function mailChimpResponse(resp) {

        if (resp.result === 'success') {
            $('.mailchimp-success').addClass('active')
            $('.mailchimp-success').html('' + resp.msg).fadeIn(900);
            $('.mailchimp-error').fadeOut(400);

        } else if(resp.result === 'error') {
            $('.mailchimp-error').html('' + resp.msg).fadeIn(900);
        }  
    }
    
    /*--
        Magnific Popup
    ------------------------*/
    $('.instagram_pupop').magnificPopup({
        type: 'image',
        gallery: {
            enabled: true
        }
    });

    // Magnific Popup Video
    $('.video_popup').magnificPopup({
        type: 'iframe',
        removalDelay: 300,
        mainClass: 'mfp-fade'
    });
    
    // Magnific Popup Video
    $('.port_popup').magnificPopup({
        type: 'image',
        gallery: {
            enabled: true
        }
    });
    /*--
    
    /*niceSelect*/
     $('.select_option').niceSelect();
    

    /*--
    Accordion
    -------------------------*/
    $(".faequently-accordion").collapse({
        accordion:true,
        open: function() {
        this.slideDown(300);
      },
      close: function() {
        this.slideUp(300);
      }		
    });	  

    /*counterup activation*/
    $('.counter_number').counterUp({
        delay: 10,
        time: 1000
    });

    /*--
        ScrollUp Active
    -----------------------------------*/
    $.scrollUp({
        scrollText: '<i class="fa fa-angle-double-up"></i>',
        easingType: 'linear',
        scrollSpeed: 900,
        animation: 'fade'
    });   
    
    /*------addClass/removeClass -------*/
    $(".currency > a,.language > a,.top_links > a").on("click", function() {
        $(this).removeAttr('href');
        $(this).toggleClass('open').next('.dropdown_currency,.dropdown_language,.dropdown_links').toggleClass('open');
        $(this).parents().siblings().find('.dropdown_currency,.dropdown_language,.dropdown_links').removeClass('open');
    });

    $('body').on('click', function (e) {
        var target = e.target;
        if (!$(target).is('.currency > a,.language > a,.top_links > a') ) {
            $('.dropdown_currency,.dropdown_language,.dropdown_links').removeClass('open');
        }
    });
    
    /*mini cart slideToggle*/
    $('.cart_link > a').on('click', function(event){
        if($(window).width() < 991){
            $('.mini_cart').slideToggle('medium');
        }
    });
    
    /*home menu slideToggle*/
    $(".home_page_mennu").on("click", function() {
        $('.dropdown_home_menu').slideToggle('medium');
    });
    
    /*blog menu slideToggle*/
    $(".blog_menu").on("click", function() {
        $('.dropdown_blog_menu').slideToggle('medium');
    });
    
    /*blog menu slideToggle*/
    $(".other_page_menu").on("click", function() {
        $('.dropdown_other_page_menu').slideToggle('medium');
    });
    
    /*shop menu items slideToggle*/
    $(".shop_menu_items").on("click", function() {
        $('.dropdown_shop_items').slideToggle('medium');
    });
   
    
    /*shop menu items2 slideToggle*/
    $(".shop_menu_items2").on("click", function() {
        $('.dropdown_shop_items2').slideToggle('medium');
    });
    
    /*shop menu items2 slideToggle*/
    $(".shop_menu_items3").on("click", function() {
        $('.dropdown_shop_items3').slideToggle('medium');
    });
    
     /*------addClass/removeClass -------*/
    $(".icone_menu > a").on("click", function() {
        $(this).removeAttr('href');
        $(this).toggleClass('open').next('.home_menu_inner').toggleClass('open');
        $(this).parents().siblings().find('.home_menu_inner').removeClass('open');
    });
    
    /*------addClass/removeClass -------*/
    $(".shop_menu > a").on("click", function() {
        $(this).removeAttr('href');
        $(this).toggleClass('open').next('.dropdown_shop_menu').toggleClass('open');
        $(this).parents().siblings().find('.dropdown_shop_menu').removeClass('open');
    });
    
    /*------addClass/removeClass -------*/
    $(".footer_show_button > a").on("click", function() {
        $(this).removeAttr('href');
        $(this).toggleClass('open').next('.footer_widgets_inner').toggleClass('open');
        $(this).parents().siblings().find('.footer_widgets_inner').removeClass('open');
    });
    
    /*mini cart slideToggle*/
     $(".search_btn").on("click", function(){
        $(this).removeAttr('href');
        $(".dropdown_search_btn").addClass("active");
    });
    
    $(".button_close").on("click", function(){
        $(".dropdown_search_btn").removeClass("active");
    });
    

    /*search_btn slideToggle*/
    $(".box_setting > a").on("click", function() {
        $('.dropdown_box_setting').slideToggle('medium');
    });
    
    
    /*countdown activation*/
    $('[data-countdown]').each(function() {
		var $this = $(this), finalDate = $(this).data('countdown');
		$this.countdown(finalDate, function(event) {
		$this.html(event.strftime('<div class="countdown_area"><div class="single_countdown"><div class="countdown_number">%D</div><div class="countdown_title">days</div></div><div class="single_countdown"><div class="countdown_number">%H</div><div class="countdown_title">hrs</div></div><div class="single_countdown"><div class="countdown_number">%M</div><div class="countdown_title">mins</div></div><div class="single_countdown"><div class="countdown_number">%S</div><div class="countdown_title">secs</div></div></div>'));        
       });
	});	
    

    /*----------------------------
    	slider-range here
    ------------------------------ */
    $( "#slider-range" ).slider({
        range: true,
        min: 50,
        max: 500,
        values: [ 0, 500 ],
        slide: function( event, ui ) {
        $( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
       }
    });
    $( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
       " - $" + $( "#slider-range" ).slider( "values", 1 ) );
    

    /*niceSelect*/
     $('.niceselect_option').niceSelect();
    
    
    //tooltip
    $('[data-toggle="tooltip"]').tooltip()
    
    
    /*-------------------------------------------
    elevateZoom
    -------------------------------------------- */	
    $("#zoom1").elevateZoom({
        gallery:'gallery_01', 
        responsive : true,
        cursor: 'crosshair',
        zoomType : 'inner'
    });  

    /*portfolio Isotope activation*/
      $('.portfolio_gallery').imagesLoaded( function() {
        // init Isotope
        var $grid = $('.portfolio_gallery').isotope({
           itemSelector: '.gird_item',
            percentPosition: true,
            masonry: {
                columnWidth: '.gird_item'
            }
        });
            
        // filter items on button click
        $('.portfolio_button').on( 'click', 'button', function() {
           var filterValue = $(this).attr('data-filter');
           $grid.isotope({ filter: filterValue });
            
           $(this).siblings('.active').removeClass('active');
           $(this).addClass('active');
        });
       
    });
    

    // Newsletter Popup
    setTimeout(function() {
        if($.cookie('shownewsletter')==1) $('.newletter-popup').hide();
        $('#subscribe_pemail').keypress(function(e) {
            if(e.which == 13) {
                e.preventDefault();
                email_subscribepopup();
            }
            var name= $(this).val();
              $('#subscribe_pname').val(name);
        });
        $('#subscribe_pemail').change(function() {
         var name= $(this).val();
                  $('#subscribe_pname').val(name);
        });
        //transition effect
        if($.cookie("shownewsletter") != 1){
            $('.newletter-popup').bPopup();
        }
        $('#newsletter_popup_dont_show_again').on('change', function(){
            if($.cookie("shownewsletter") != 1){   
                $.cookie("shownewsletter",'1')
            }else{
                $.cookie("shownewsletter",'0')
            }
        }); 
    }, 2000);
    
    
    /*shop grid activation*/
    $('.shop_toolbar_btn > button').on('click', function (e) {
		e.preventDefault();
        $('.shop_toolbar_btn > button').removeClass('active');
		$(this).addClass('active');
        
		var parentsDiv = $('.shop_wrapper');
		var viewMode = $(this).data('role');
		parentsDiv.removeClass('grid_3 grid_4 grid_5 grid_list').addClass(viewMode);

		if(viewMode == 'grid_3'){
			parentsDiv.children().addClass('col-lg-4 col-md-4 col-sm-6').removeClass('col-lg-3 col-cust-5 col-12');   
		}
		if(viewMode == 'grid_4'){
			parentsDiv.children().addClass('col-lg-3 col-md-4 col-sm-6').removeClass('col-lg-4 col-cust-5 col-12');
		}
		if(viewMode == 'grid_5'){
			parentsDiv.children().addClass('col-cust-5 col-md-4 col-sm-6' ).removeClass('col-lg-3 col-lg-4 col-12');
		}
        if(viewMode == 'grid_list'){
			parentsDiv.children().addClass('col-12').removeClass('col-lg-3 col-lg-4 col-md-4 col-sm-6 col-cust-5');
		}
        
        
	});
    
    
    /*---canvas menu activation---*/
    $('.canvas_open').on('click', function(){
        $('.offcanvas_menu_wrapper,.off_canvars_overlay').addClass('active')
    });
    
    $('.canvas_close,.off_canvars_overlay').on('click', function(){

