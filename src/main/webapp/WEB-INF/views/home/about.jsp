<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
 <link rel="stylesheet" href="/css/style.css">
  <style type="text/css">
  .nostart,body,img{margin:0;padding:0}body,input,select,textarea{font-family:Georgia,"Times New Roman",Times,serif}html{overflow-y:scroll}body{font-size:13px;color:#919191;background-color:#232323}.justify{text-align:justify}.bold{font-weight:700}.center{text-align:center}.right{text-align:right}.nostart{list-style:none}.hidden{display:none}.clear:after{content:".";display:block;height:0;clear:both;visibility:hidden;line-height:0}.clear{display:inline-block;clear:both}html[xmlns] .clear{display:block}* html .clear{height:1%}a{outline:0;text-decoration:none}.fl_left{float:left}.fl_right{float:right}img{border:none;line-height:normal;vertical-align:middle}.imgholder,.imgl,.imgr{padding:4px;border:1px solid #D6D6D6;text-align:center}.imgl{float:left;margin:0 15px 15px 0;clear:left}.imgr{float:right;margin:0 0 15px 15px;clear:right}address,article,aside,div.wrapper,figcaption,figure,footer,header,hgroup,nav,section{margin:0;padding:0;display:block}div.wrapper{width:100%;text-align:left}.row1,.row1 a{color:#C0BAB6;background-color:#333}.row2,.row2 a{background-color:#FFF}.row2{color:#979797}.row2 a{color:#F90}.row3,.row3 a{color:#919191;background-color:#232323}#header #topnav,#header #topnav li a{color:#C0BAB6;background-color:#232323}div.wrapper h1,div.wrapper h2,div.wrapper h3,div.wrapper h4,div.wrapper h5,div.wrapper h6{margin:0 0 15px;padding:0;font-size:20px;font-weight:400;line-height:normal}fieldset,form,legend{margin:0;padding:0;border:none}legend{display:none}input,select,textarea{font-size:12px}#container,#footer,#header{display:block;margin:0 auto;text-align:center}#header{padding:20px 0}#header .fl_left h1,#header .fl_left h2{margin:0;padding:0;font-weight:400;text-transform:none}#header .fl_left h1{font-size:36px}#header .fl_left h2{font-size:13px}#header #topnav{display:block;float:right;margin:0;padding:20px;list-style:none;-webkit-border-radius:10px;-moz-border-radius:10px;border-radius:10px}#header #topnav li{display:inline;margin-right:25px;text-transform:uppercase}#header #topnav li.last{margin-right:0}#header #topnav li a:hover,#header #topnav li.active a{color:#F90;background-color:#232323}#container{padding:30px 0}#container a{background-color:transparent}#container #gallery,#container #portfolio{margin-bottom:30px}#container .pagination{display:block;width:100%;text-align:center;clear:both;font-family:Verdana,Geneva,sans-serif}#container .pagination ul{margin:0;padding:0;list-style:none}#container .pagination li{display:inline}#container .pagination strong{font-weight:400}#container .pagination .next{margin:0}#container .pagination .current strong,#container .pagination .splitter strong,#container .pagination a{display:inline-block;padding:2px 6px;margin:0 2px 0 0}#container .pagination a{border:1px solid #DFDFDF}#footer{padding:20px 0}#footer p{margin:0;padding:0}#about-us{display:block;width:100%;line-height:1.6em}#about-us #about-intro{margin-bottom:50px}#about-us #about-intro div blockquote{position:relative;margin:0;padding:0}#about-us #about-intro div blockquote p{margin:0;padding:0 0 0 60px;font-size:22px;font-style:italic;text-align:justify;line-height:1.6em}#about-us #about-intro div blockquote p span{position:absolute;top:0;left:0;font-size:120px;line-height:.8em}#about-us #about-intro .imgr{background-color:#FFF;margin:0}#about-us #team{margin-bottom:0}#about-us #team ul{margin:0;padding:0;list-style:none}#about-us #team ul li{margin-bottom:30px}#about-us #team ul li figure{text-align:center}#about-us #team ul li figure img{margin-bottom:15px}#about-us #team ul li figure figcaption p{margin:0;padding:0}#about-us #team ul li figure figcaption .team_name{font-weight:700}#about-us #team ul li figure figcaption .team_title{margin:0;font-size:11px;line-height:normal}.four_fifth,.one_fifth,.one_half,.one_quarter,.one_third,.three_fifth,.three_quarter,.two_fifth,.two_quarter,.two_third{display:inline-block;float:left;margin:0 0 0 20px;list-style:none}.one_third,.two_third{margin:0 0 0 30px}.first,.four_fifth:first-child,.one_fifth:first-child,.one_half:first-child,.one_quarter:first-child,.one_third:first-child,.three_fifth:first-child,.three_quarter:first-child,.two_fifth:first-child,.two_quarter:first-child,.two_third:first-child{margin-left:0}.five_fifth,.four_quarter,.three_third,.two_half{display:block;width:100%;clear:both}.one_half{width:470px}.one_third{width:300px}.two_third{width:630px}.one_quarter{width:225px}.two_quarter{width:470px}.three_quarter{width:715px}.one_fifth{width:176px}.two_fifth{width:372px}.three_fifth{width:568px}.four_fifth{width:764px}
  </style>
</head>
<body>
  <div id="header_all" class="header">
    <div class="container">
      <div class="logo">
        <a href="/"><span><img class="img-responsive image-circle" src="/upload/favicon.png" alt="logo" height="64" width="64" style="float: left;">Chợ Tốt</span>&nbsp;Văn Lang</a>
      </div>
      <div class="header-right" style="padding: 20px;">
        <div class="dropdown" style="width: fit-content; margin: 0 auto;">
          <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">Xin chào&nbsp;tuyen&nbsp;^^&nbsp;
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
  
  <nav id="menu">
    <h2 id="h2--menu">Menu</h2>
    <ul>
      <li><a href="/">Trang chủ</a></li>
      <li><a href="/danh-muc/5af85f65419cadab24fbc6ad">Danh mục</a></li>
      <li><a href="/kenh-nguoi-ban">Kênh Người Bán</a></li>
      <li><a href="/gioi-thieu">Giới thiệu</a></li>
      <li><a href="/lien-he">Liên hệ</a></li>
    </ul>
  </nav>
  <div class="main-banner banner text-center">
    <!-- <div class="container">
      <h1>Chào mừng bạn   <span class="segment-heading">    đến với trang </span> mua sắm online ChoTotVL</h1>
      <p>Olala</p>
    </div> -->
  </div>
  
  <div class="wrapper row2">
    <div id="container" class="container">
      <div id="about-us" class="clear">
        <section id="about-intro" class="clear">
          <div class="col-xs-12 col-sm-6 col-md-offset-1 col-lg-offset-2">
            <blockquote>
              <p><span>&ldquo;</span> Title about <span>&ldquo;</span></p>
            </blockquote><br>
            <p style="font-size: 15px"> Mo ta</p>
          </div>
          <div class="one_third hidden-xs"><img id="logoChotot" src="/upload/favicon.png" alt=""></div>
        </section>
      
      </div>
    </div>
  </div>

  <footer>
    <div id="footer-all">
      <div>
        <div class="foo-grids">
          <div class="col-md-6 footer-grid footer-top">
            <div class="col-sm-offset-3 col-sm-7">
              <!-- <a href="/"><img class="lazy-logo" style="max-width: 79%;" data-original="../images/chotot.png" alt="Logo"></a> -->
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