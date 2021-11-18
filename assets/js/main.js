////////////////////////////////////////////////////////////////////////////
//                                  _ooOoo_                               //
//                                 o8888888o                              //
//                                 88" . "88                              //
//                                 (| ^_^ |)                              //
//                                 O\  =  /O                              //
//                              ____/`---'\____                           //
//                            .'  \\|     |//  `.                         //
//                           /  \\|||  :  |||//  \                        //
//                          /  _||||| -:- |||||-  \                       //
//                          |   | \\\  -  /// |   |                       //
//                          | \_|  ''\---/''  |   |                       //
//                          \  .-\__  `-`  ___/-. /                       //
//                        ___`. .'  /--.--\  `. . ___                     //
//                      ."" '< `.___\_<|>_/___.'  >'"".                   //
//                    | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
//                    \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
//             ========`-.____`-.___\_____/___.-`____.-'========          //
//                                  `=---='                               //
//              ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
// Buddha's blessings will never be shut down and there will never be BUG //
////////////////////////////////////////////////////////////////////////////








/*=============== SHOW MENU ===============*/
const navMenu = document.getElementById('nav-menu'),
      navToggle = document.getElementById('nav-toggle'),
      navClose = document.getElementById('nav-close')

/*===== MENU SHOW =====*/
/* Validate if constant exists */
if(navToggle){
    navToggle.addEventListener('click', () =>{
        navMenu.classList.add('show-menu')
    })
}

/*===== MENU HIDDEN =====*/
/* Validate if constant exists */
if(navClose){
    navClose.addEventListener('click', () =>{
        navMenu.classList.remove('show-menu')
    })
}

/*=============== REMOVE MENU MOBILE ===============*/
const navLink = document.querySelectorAll('.nav__link')

function linkAction(){
    const navMenu = document.getElementById('nav-menu')
    // When we click on each nav__link, we remove the show-menu class
    navMenu.classList.remove('show-menu')
}
navLink.forEach(n => n.addEventListener('click', linkAction))

/*=============== HOME SWIPER ===============*/
let homeSwiper = new Swiper(".home-swiper", {
    spaceBetween: 30,
    loop: 'true',
    
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
      },
      navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
      },
})

/*=============== CHANGE BACKGROUND HEADER ===============*/
function scrollHeader(){
    const header = document.getElementById('header')
    // When the scroll is greater than 50 viewport height, add the scroll-header class to the header tag
    if(this.scrollY >= 50) header.classList.add('scroll-header'); else header.classList.remove('scroll-header')

    
}
window.addEventListener('scroll', scrollHeader)


/*=============== NEW SWIPER ===============*/
let newSwiper = new Swiper(".new-swiper", {
    centeredSlides: true,
    slidesPerView: "auto",
    loop: 'true',
    spaceBetween: 16,
    navigation: {
      nextEl: '.swiper-button-next',
      prevEl: '.swiper-button-prev',
    },
 });

/*=============== BUTTON SELECTED ===============*/

 const button = document.querySelectorAll('.button');
 button.forEach(button =>{
    button.onmousemove = function(e){
        const x = e.pageX - button.offsetLeft;
        const y = e.pageY - button.offsetTop;
     
        button.style.setProperty('--x',x+'px');
        button.style.setProperty('--y',y+'px');
      }
});

/*=============== SCROLL SECTIONS ACTIVE LINK ===============*/
const sections = document.querySelectorAll('section[id]')

function scrollActive(){
    const scrollY = window.pageYOffset

    sections.forEach(current =>{
        const sectionHeight = current.offsetHeight,
              sectionTop = current.offsetTop - 58,
              sectionId = current.getAttribute('id')
    
        if(scrollY > sectionTop && scrollY <= sectionTop + sectionHeight){
            document.querySelector('.nav__menu a[href*=' + sectionId + ']').classList.add('active-link')
        }else{
            document.querySelector('.nav__menu a[href*=' + sectionId + ']').classList.remove('active-link')
        }
    })
}
window.addEventListener('scroll', scrollActive)

/*=============== SHOW SCROLL UP ===============*/ 
function scrollUp(){
    const scrollUp = document.getElementById('scroll-up');
    // When the scroll is higher than 460 viewport height, add the show-scroll class to the a tag with the scroll-top class
    if(this.scrollY >= 460) scrollUp.classList.add('show-scroll'); else scrollUp.classList.remove('show-scroll')
}
window.addEventListener('scroll', scrollUp)

/*=============== SCROLL EREVAL ANIMATION ===============*/
const sr = ScrollReveal({
    origin: 'top',
    distance: '60px',
    duration: 2000,
    delay: 200,
    // reset: true
})

sr.reveal(`.home-swiper, .new-swiper, .newsletter__container`)
sr.reveal(`.category__data, .location__content, .footer__content`,{interval: 100})
sr.reveal(`.about__data, .discount__img`,{origin: 'left'})
sr.reveal(`.about__img, .discount__data`,{origin: 'right'})












/*==================== SHOW MENU ====================*/
// const showMenu = (toggleId, navId) =>{
//     const toggle = document.getElementById(toggleId),
//     nav = document.getElementById(navId)

//     // Validate that variables exist
//     if(toggle && nav){
//         toggle.addEventListener('click', () =>{
//             // We add the show-menu class to the div tag with the nav__menu class
//             nav.classList.toggle('show-menu')
//         })
//     }
// }

// showMenu('nav-toggle','nav-menu')

/*==================== SWIPER JS ====================*/
let galleryThumbs = new Swiper('.gallery-thumbs', {
    spaceBetween: 0,
    slidesPerView: 0,
})

let galleryTop = new Swiper('.gallery-top', {
    effect: 'fade',
    loop: true,

    thumbs: {
      swiper: galleryThumbs
    }
})


/*==================== POPUP ====================*/
const btnOpenVideo = document.querySelectorAll('.banner__video-content')
const bannerPopup = document.getElementById('popup')

function poPup(){
    bannerPopup.classList.add('show-popup')
}
btnOpenVideo.forEach(b => b.addEventListener('click', poPup))

const btnCloseVideo = document.getElementById('popup-close')

btnCloseVideo.addEventListener('click', ()=> {
    bannerPopup.classList.remove('show-popup')
})

/*==================== GSAP ANIMATION ====================*/
const controlImg = document.querySelectorAll('.controls__img')

function scrollAnimation(){
    gsap.from('.banner__subtitle', {opacity: 0, duration: .2, delay: .2, y: -20})
    gsap.from('.banner__title', {opacity: 0, duration: .3, delay: .3, y: -20})
    gsap.from('.banner__description', {opacity: 0, duration: .4, delay: .4, y: -20})
    gsap.from('.banner__button', {opacity: 0, duration: .5, delay: .5, y: -20})
    gsap.from('.banner__video-content', {opacity: 0, duration: .6, delay: .6, y: -20})

    bannerPopup.classList.remove('show-popup')
}

controlImg.forEach(c => c.addEventListener('click', scrollAnimation))
