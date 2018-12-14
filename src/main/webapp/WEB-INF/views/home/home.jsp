<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <%@include file="/WEB-INF/views/include/title.jsp" %>
</head>

<body>
 <%@include file="/WEB-INF/views/include/header.jsp" %>
  
  <!-- Navbar -->
  
  <nav id="open--menu"><ul><li><a href="#menu">Menu</a></li></ul></nav>
  <%@include file="/WEB-INF/views/include/menu.jsp" %>
  
  

  <div class="main-banner banner text-center">
  </div>
    <!-- content-starts-here -->
    <div class="content">
      <div class="categories">
        <div class="container">
          <h2 id="categories--h2">Danh mục</h2>
          <c:forEach var="CATEGORY" items="${CATEGORIES}">
            <div class="col-md-3 focus-grid">
              <a href="/find/${CATEGORY.id}">
                <div class="focus-border">
                  <div class="focus-layout">
                    <div class="focus-image"><img width="140" height="140" alt="avatar" src="/upload/${CATEGORY.photo}"></div>
                    <h4 class="clrchg">${CATEGORY.name}</h4>
                  </div>
                </div>
              </a>
            </div>${CATEGORY.photo}
            </c:forEach>
         
            <div class="clearfix"></div>
        </div>
      </div>
      <hr class="hidden-md hidden-lg hr">
      <div class="flex text-center hidden-xs hidden-sm">
        <img class="hoavan" src="/upload/hoavan.png" alt="hoala">
      </div>
     
    </div>
  <hr>
<%@include file="/WEB-INF/views/include/footer.jsp" %>


	<!-- js -->
	<!-- js -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<!-- js -->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://chototvanlang.herokuapp.com/socket.io/socket.io.js"></script>
	<script src="/js/lazyload.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/bootstrap-select.js"></script>
	<script src="/js/hiddenporo.js"></script>
	<script src='/js/custom.js'></script>
	<script>
  $(document).ready(function(){$("div.lazy-product, img.lazy-logo, img.lazy-cate, div.lazy-sale, div.lazy-ngung, img.lazy-member, div.lazy-details, div.lazy-lq").lazyload({effect:"fadeIn"});var a=$("#first-disabled2");$("#special").on("click",function(){a.find("option:selected").prop("disabled",!0),a.selectpicker("refresh")}),$("#special2").on("click",function(){a.find("option:disabled").prop("disabled",!1),a.selectpicker("refresh")}),$("#basic2").selectpicker({liveSearch:!0,maxOptions:1}),function(b){b(function(){var c=b("body"),d=b("#menu");d.wrapInner("<div class=\"inner\"></div>"),d._locked=!1,d._lock=function(){return!d._locked&&(d._locked=!0,window.setTimeout(function(){d._locked=!1},350),!0)},d._show=function(){d._lock()&&c.addClass("is-menu-visible")},d._hide=function(){d._lock()&&c.removeClass("is-menu-visible")},d._toggle=function(){d._lock()&&c.toggleClass("is-menu-visible")},d.appendTo(c).on("click",function(e){e.stopPropagation()}).on("click","a",function(e){var f=b(this).attr("href");e.preventDefault(),e.stopPropagation(),d._hide();"#menu"==f||window.setTimeout(function(){window.location.href=f},350)}).append("<a id=\"close--menu\" class=\"close\" href=\"#menu\">Close</a>"),c.on("click","a[href=\"#menu\"]",function(e){e.stopPropagation(),e.preventDefault(),d._toggle()}).on("click",function(){d._hide()}).on("keydown",function(e){27==e.keyCode&&d._hide()})})}(jQuery)});
function GoogleMaps(){var a={lat:16.0773318,lng:108.1462627},b=new google.maps.Map(document.getElementById('map'),{zoom:15,center:a}),c=new google.maps.Marker({position:a,map:b})}
</script>


	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAtTijdOrawSLXkwdTOT1MKXE7Y0-pVcFI&callback=GoogleMaps"></script>

	<script src='/js/cropper.min.js'></script>
	<script type="text/javascript">
</body>
</html>
