<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- meta css info  -->
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
  <section>
    <div id="page-wrapper" class="sign-in-wrapper">
      <div class="graphs">
        <div class="sign-in-form">
          <div class="sign-in-form-top">
            <h1>Login</h1>
          </div>
          <div class="signin">
            <div class="signin-rit">
              <span class="checkbox1">
              <label class="checkbox"><input type="checkbox" name="checkbox" checked="">Quên Mật khẩu ?</label>
           </span>
              <p><a href="/lay-mat-khau">Bấm vào đây</a></p>
              <div class="clearfix"> </div>
            </div>
            <c:if test="${param.error}">
            <span>Tai khoan hoạc mat khau khong dung</span>
            </c:if>
            
        

            <form:form action="/login" method="post">
              <div class="log-input">
                <div class="log-input-left">
                  <input type="text" name="username" class="user" placeholder="Nhập username"  required/>
                </div>
                <span class="checkbox2">
           </span>
                <div class="clearfix"> </div>
              </div>
              <div class="log-input">
                <div class="log-input-left">
                  <input type="password" name="passsword" class="lock" placeholder="Mật khẩu" min="8" maxlength="35" pattern=".{8,35}" required/>
                </div>
                <span class="checkbox2">
           </span>
                <div class="clearfix"> </div>
              </div>
                 <div class="log-input">
                <div class="log-input-left">
                  <input type="checkbox" name="chotot" /> Remember me
                </div>
                <span class="checkbox2">
           </span>
                <div class="clearfix"> </div>
              </div>
              <input type="hidden" name="_csrf" value="">
              <input type="submit" value="Đăng nhập">
            </form:form>
          </div>
          <div class="new_people">
            <h2>Cho Người Mới</h2>
            <p>Có kinh nghiệm trong việc tạo ra các thiết kế sáng tạo, chúng tôi cung cấp các giải pháp thiết kế.</p>
            <a href="/auth/register">Đăng ký ngay!</a>
          </div>
        </div>
      </div>
    </div>
    <!--footer section start-->
    <footer class="diff">
      <p class="text-center">© 2018 Chợ tốt Văn Lang. All Rights Reserved | Design by <a href="mailto:w.a.f-group@gmail.com"> W.A.F Group</a></p>
    </footer>
    <!--footer section end-->

  </section>

 <!-- js -->
<script type="text/javascript" src="/js/jquery.min.js"></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://chototvanlang.herokuapp.com/socket.io/socket.io.js"></script>
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
