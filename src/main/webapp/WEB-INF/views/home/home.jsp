<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- meta css info  -->
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
  <div id="header_all" class="header">
    <div class="container">
      <div class="logo">
        <a href="/"><span><img class="img-responsive image-circle" src="./Admin(js,css,img,font)/images/admin.jpg" alt="logo" height="64" width="64" style="float: left;">Chợ Tốt</span>&nbsp;Văn Lang</a>
      </div>
      <div class="header-right" style="padding: 20px;">
        <div class="dropdown" style="width: fit-content; margin: 0 auto;">
          <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">Xin chào&nbsp;Tuen&nbsp;^^&nbsp;
          <span class="caret"></span></button>
          <ul class="dropdown-menu">
            
              <li><a class="" href="/thong-tin-ca-nhan">Thông tin tài khoản</a></li>
              <li class="divider"></li>
              <li><a class="" href="/dang-xuat">Thoát</a></li>
         
              <li><a class="" href="/dang-nhap">Đăng nhập</a></li>
              <li class="divider"></li>
              <li><a class="" href="/dang-ky">Đăng ký</a></li>
           
          </ul>
        </div>
      </div>
    </div>
  </div>
  
  <!-- Navbar -->
  
  <nav id="open--menu"><ul><li><a href="#menu">Menu</a></li></ul></nav>
  <%@include file="/WEB-INF/views/include/menu.jsp" %>
  
  

  <div class="main-banner banner text-center">
    <!-- <div class="container">
      <h1>Chào mừng bạn   <span class="segment-heading">    đến với trang </span> mua sắm online ChoTotVL</h1>
      <p>Olala</p>
    </div> -->
  </div>
    <!-- content-starts-here -->
    <div class="content">
      <div class="categories">
        <div class="container">
          <h2 id="categories--h2">Danh mục</h2>
          
            <div class="col-md-3 focus-grid">
              <a href="/danh-muc/">
                <div class="focus-border">
                  <div class="focus-layout">
                    <div class="focus-image"><i class=""></i></div>
                    <h4 class="clrchg"></h4>
                  </div>
                </div>
              </a>
            </div>
         
            <div class="clearfix"></div>
        </div>
      </div>
      <hr class="hidden-md hidden-lg hr">
      <div class="flex text-center hidden-xs hidden-sm">
        <img class="hoavan" src="/images/hoavan.png" alt="hoala">
        <img class="hoavan" src="./images/hoavan.PNG" alt="hoala">
      </div>
      <div class="trending-ads">
        <div class="container">
          <!-- slider -->
          <div class="trend-ads">
            <h2>Sản phẩm mới</h2>

            <ul id="new--product">
            
                <li class="naem">
                 
                    <div class="col-xs-offset-1 col-sm-offset-0 col-md-offset-0 col-lg-offset-0 col-sm-6 col-md-3 biseller-column">
                      <a href="/chi-tiet-san-pham/">
                      <div class="lazy-product img-Product" data-original="" title=""></div>
                      <span class="price">&#36;</span>

                      <div class="ad-info">
                        <h5>hoa quas</h5>
                        <span class="text-dark"></span>
                      </div>
                    </a>

                    </div>
                   
                </li>
              
            </ul>
          </div>
          <div class="clearfix"></div>
          <div class="text-center" style="padding: 35px 0 0;"><a href="/danh-muc/" class="btn btn-success">Xem thêm</a></div>
        </div>
        <!-- //slider -->
      </div>
    </div>
  <hr>
  <footer>
    <div id="footer-all">
      <div>
        <div class="foo-grids">
          <div class="col-md-6 footer-grid footer-top">
            <div class="col-sm-offset-3 col-sm-7">
              <!-- <a href="/"><img class="lazy-logo" style="max-width: 79%;" data-original="./images/chotot.png" alt="Logo"></a> -->
              <h4 class="footer-head">Liên hệ</h4>
              <span class="hq">Trụ sở chính</span>
              <address>
                <ul class="location">
                  <li><span class="glyphicon glyphicon-map-marker"></span></li>
                  <li>LẦU 7 VĂN PHÒNG KHOA CNTT Đại học Văn Lang</li>
                  <div class="clearfix"></div>
                </ul>
                <ul class="location">
                  <li><span class="glyphicon glyphicon-earphone"></span></li>
                  <li>+0 561 111 235</li>
                  <div class="clearfix"></div>
                </ul>
                <ul class="location">
                  <li><span class="glyphicon glyphicon-envelope"></span></li>
                  <li><a href="mailto:chototvlu@example.com">chototvlu@example.com</a></li>
                  <div class="clearfix"></div>
                </ul>
              </address>
            </div>
          </div>
          <div class="col-md-6 footer-grid center">
            <div class="row"><div id="map" style="width:100%;height:45vh;"></div></div>
          </div>
          <div class="clearfix"></div>
        </div>
      </div>
    </div>
    <div class="footer-bottom text-center">
    <div class="container">
      <div class="footer-logo">
        <a href="/"><span>Chợ Tốt</span>&nbsp;Văn Lang</a>
      </div>
      <div class="footer-social-icons">
        <ul>
          <li><a class="facebook" href="#"><span>Facebook</span></a></li>
          <li><a class="twitter" href="#"><span>Twitter</span></a></li>
          <li><a class="flickr" href="#"><span>Flickr</span></a></li>
          <li><a class="googleplus" href="#"><span>Google+</span></a></li>
          <li><a class="dribbble" href="#"><span>Dribbble</span></a></li>
        </ul>
      </div>
      <div class="copyrights">
        <p> © 2018 Chợ tốt Văn Lang. All Rights Reserved |&nbsp;<span id="Id_online"></span>&nbsp;| Design by  <a href="mailto:w.a.f-group@gmail.com"> W.A.F Group</a></p>
      </div>
      <div class="clearfix"></div>
    </div>
  </div>

  <div class="text-center pull-right hello top hidden-xs" title="Lên TOP">
    <span>
        <i class="fa fa-angle-double-up" aria-hidden="true"></i>
    </span>
  </div>


    <div class="text-center pull-right hello caht" data-toggle="collapse" data-target="#chat" aria-expanded="true" title="Tính năng đang được phát triển">
      <span>
        <i class="fa fa-users" aria-hidden="true"></i>
      </span>
    </div>

    <div class="text-center pull-right hello caht" data-toggle="collapse" data-target="#chat" aria-expanded="true" title="Tính năng đang được phát triển">
      <span>
        <i class="fa fa-users" aria-hidden="true"></i>
      </span>
    </div>
    
      <div class="text-center pull-right hello">
        <a href="/admin/dashboard">
          <span>
            <i class="fa fa-user-secret" aria-hidden="true"></i>
          </span>
        </a>
      </div>
  

  <div id="chat" class="col-sm-offset-8 col-sm-4 navbar-fixed-bottom collapse">
   
      <input id="userCon" type="hidden" size="1" readonly disabled>
     
      <div class="col-sm-12">
        <!-- <div class="panel panel-success">
          <div class="panel-heading" data-toggle="collapse" data-target="#chat" aria-expanded="false" style="cursor: pointer;">Chat
            <span class="pull-right"><i class="fa fa-angle-down" aria-hidden="true"></i></span>
          </div>
          <div class="panel-body" style="padding-bottom: 0;">
            <div class="col-sm-3" style="height: 30vh; overflow-y: auto;">
              <div class="row" style="padding-right: 7px;">
                <div id="roomschat" class="contact-chat"></div>
              </div>
            </div>
            <div id="scroll-chat" class="col-sm-9" style="height: 30vh;overflow-y: auto;">
              <div id="chat-form">

              </div>
            </div>
          </div>
          <div class="panel-body" style="padding-top: 0;">
            <hr>
            <div id="wait"></div>
            <div class="input-group">
              <input type="text" id="mes--chat" class="form-control" placeholder="Chat ...">
              <div class="input-group-btn">
                <button class="btn btn-default" id="send-mes" type="button">
                  <i class="fa fa-paper-plane-o" aria-hidden="true"></i>
                </button>
              </div>
            </div>
          </div>
        </div> -->
      </div>
    
        <div class="table-responsive well">
          <table class="table table-bordered table-hover">
            <thead>
               <tr>
                 <th colspan="2" class="text-danger">Tài khoản chưa được kích hoạt
                <span style="cursor: pointer;" data-toggle="collapse" data-target="#chat" aria-expanded="false" class="pull-right"><i class="fa fa-times-circle-o" aria-hidden="true"></i></span>
                 </th>
               </tr>
               <tr>
                 <th colspan="2">Vui lòng liên hệ</th>
               </tr>
             </thead>
             <tbody>
               <tr>
                 <td>Email</td>
                 <td><a href="mailto:chototvlu@gmail.com">Chototvl@gmail.com</a></td>
               </tr>
               <tr>
                 <td>Số điện thoại</td>
                 <td>0909090909</td>
               </tr>
               <tr>
                 <td>VPK</td>
                 <td>LẦU 7 VĂN PHÒNG KHOA CNTT Đại học Văn Lang</td>
               </tr>
             </tbody>
          </table>
        </div>
   
      <div class="pull-right col-sm-5 well">
        <a href="/dang-nhap">Vui lòng đăng nhập</a>
      </div>

  </div>

</footer>
<!-- js -->
<script type="text/javascript" src="/js/jquery.min.js"></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

<script src="/js/lazyload.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/bootstrap-select.js"></script>
<script src="/js/hiddenporo.js"></script>
<script>
  $(document).ready(function(){$("div.lazy-product, img.lazy-logo, img.lazy-cate, div.lazy-sale, div.lazy-ngung, img.lazy-member, div.lazy-details, div.lazy-lq").lazyload({effect:"fadeIn"});var a=$("#first-disabled2");$("#special").on("click",function(){a.find("option:selected").prop("disabled",!0),a.selectpicker("refresh")}),$("#special2").on("click",function(){a.find("option:disabled").prop("disabled",!1),a.selectpicker("refresh")}),$("#basic2").selectpicker({liveSearch:!0,maxOptions:1}),function(b){b(function(){var c=b("body"),d=b("#menu");d.wrapInner("<div class=\"inner\"></div>"),d._locked=!1,d._lock=function(){return!d._locked&&(d._locked=!0,window.setTimeout(function(){d._locked=!1},350),!0)},d._show=function(){d._lock()&&c.addClass("is-menu-visible")},d._hide=function(){d._lock()&&c.removeClass("is-menu-visible")},d._toggle=function(){d._lock()&&c.toggleClass("is-menu-visible")},d.appendTo(c).on("click",function(e){e.stopPropagation()}).on("click","a",function(e){var f=b(this).attr("href");e.preventDefault(),e.stopPropagation(),d._hide();"#menu"==f||window.setTimeout(function(){window.location.href=f},350)}).append("<a id=\"close--menu\" class=\"close\" href=\"#menu\">Close</a>"),c.on("click","a[href=\"#menu\"]",function(e){e.stopPropagation(),e.preventDefault(),d._toggle()}).on("click",function(){d._hide()}).on("keydown",function(e){27==e.keyCode&&d._hide()})})}(jQuery)});
function GoogleMaps(){var a={lat:10.762936,lng:106.693335},b=new google.maps.Map(document.getElementById('map'),{zoom:15,center:a}),c=new google.maps.Marker({position:a,map:b})}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAtTijdOrawSLXkwdTOT1MKXE7Y0-pVcFI&callback=GoogleMaps"></script>

</body>
</html>
