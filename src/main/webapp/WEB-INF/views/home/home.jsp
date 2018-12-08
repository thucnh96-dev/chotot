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
  <%@include file="/WEB-INF/views/include/footer.jsp" %>
<!-- js -->
<script type="text/javascript" src="/js/jquery.min.js"></script>
<!-- js -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

<script src="/js/lazyload.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/bootstrap-select.js"></script>
<script src="/js/hiddenporo.js"></script>


</body>
</html>
