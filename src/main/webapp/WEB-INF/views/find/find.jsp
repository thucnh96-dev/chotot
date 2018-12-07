<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>
  <title>Title</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
    crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
<script type="text/javascript" src="/js/custom.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

</head>

<body>
  <div id="header_all" class="header">
    <div class="container">
      <div class="logo">
        <a href="/"><span><img class="img-responsive image-circle" src="../Admin(js,css,img,font)/images/admin.jpg" alt="logo"
              height="64" width="64" style="float: left;">Chá»£ Tá»t</span>&nbsp;VÄn Lang</a>
      </div>
      <div class="header-right" style="padding: 20px;">
        <div class="dropdown" style="width: fit-content; margin: 0 auto;">
          <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">Xin
            chÃ o&nbsp;Tuen&nbsp;^^&nbsp;
            <span class="caret"></span></button>
          <ul class="dropdown-menu">

            <li><a class="" href="/thong-tin-ca-nhan">ThÃ´ng tin tÃ i khoáº£n</a></li>
            <li class="divider"></li>
            <li><a class="" href="/dang-xuat">ThoÃ¡t</a></li>

            <li><a class="" href="/dang-nhap">ÄÄng nháº­p</a></li>
            <li class="divider"></li>
            <li><a class="" href="/dang-ky">ÄÄng kÃ½</a></li>

          </ul>
        </div>
      </div>
    </div>
  </div>

  <div class="container">

    <div class="row">
      <div class="col-lg-2">

      </div>
      <div class="col-lg-8">
        <h4 id="loadName">${CATEGORY.name} Toàn quốc 2018 Giá Rẻ</h4>
        <form action="" method="post" class="form-horizontal">
          <div class="input-group col-lg-11">
            <input class="form-control py-2" type="search"  id="search-input">
            <span class="input-group-append">
              <button class="btn btn-outline-secondary" type="button" onclick="search()">
                <i class="fa fa-search"></i>
              </button>
            </span>
          </div>


        </form>
        <br />
        <div class="row">
          <div class="col-lg-5">
            <!-- Button trigger modal -->
            <button type="button" class="btn btn-lg btn-block dropdown-toggle dropdown-toggle-split" data-toggle="modal"
              data-target="#addressId" name="exampleModalLongTitle">
              Toan quoc
            </button>

            <!-- Modal -->
            <div class="modal fade" id="addressId" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" id="modal_address"
              aria-hidden="true">
              <div class="modal-dialog" role="document">
                <div class="modal-content">
                  <div class="modal-header">
                    <h2 class="modal-title" name="exampleModalLongTitle">Chon khu vuc</h2>
                    <i class="fa fa-close close " aria-hidden="true" data-dismiss="modal"></i>
                    <!-- <button type="button" class="close mr-12" data-dismiss="modal"> -->
                    <!-- <span aria-hidden="true">&times;</span> -->

                  </div>
                  <ul class="list-group modal-body" id="address">
                    <a href="#" style="text-decoration: none;" >
                      <li class="list-group-item " name="exampleModalLongTitle">Toan Quoc <i class="fa fa-angle-right fa-5 pull-right"></i></li>
                    </a>
                    <c:forEach var="CITY" items="${CITYS}">
                     <a href="#" style="text-decoration: none;" onclick="addressShow('${CITY.id}', '${CITY.name}')">
                      <li class="list-group-item ">${CITY.name} <i class="fa fa-angle-right fa-5 pull-right"></i></li>
                    </a>
                    </c:forEach>


                  </ul>
                </div>
              </div>
            </div>

          </div>
          <div class="col-lg-5">
            <div class="dropdown">
            <c:set var="CATE" value="Danh Muc"></c:set>
            <c:if test="${CATEGORY != null}">
            <c:set var="CATE" value="${CATEGORY.name}"></c:set>
            </c:if>
              <button type="button" class="btn btn-lg btn-block dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" id="btn_name_Cate">
                ${CATE}
              </button>
              <div class="dropdown-menu " >
              <c:if test="${CATEGORY==null}">
              <c:forEach items="${CATEGORIES}" var="CATE">
                <a class="dropdown-item" href="#" id="subcategory" value="${CATE.id}" onclick="btnCate('${CATE.id}', '${CATE.name}')">${CATE.name}</a>
               </c:forEach>
              
              </c:if>
               <c:forEach items="${CATEGORY.getSubcategories()}" var="SUB">
                <a class="dropdown-item" href="#" id="subcategory" value="${SUB.id}" onclick="btnSubcate('${SUB.id}', '${SUB.name}')" >${SUB.name}</a>
               </c:forEach>
              </div>
            </div>
          </div>
          <div class="col-lg-2">
            <div class="dropdown">
              <button type="button" class="btn btn-lg btn-block dropdown-toggle dropdown-toggle-split" data-toggle="dropdown">
                Loc
              </button>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="#">Link 1</a>
                <a class="dropdown-item" href="#">Link 2</a>
                <a class="dropdown-item" href="#">Link 3</a>
              </div>
            </div>
          </div>

        </div>
        <br />
        <div class="border border-dark p-5">
          <h3>tin dac biet</h3>
          <div class="row">

            <div class="card-deck">
              <div class="card">
                <img class="card-img-top" src="..." alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Card title</h5>

                </div>
                <div class="card-footer">
                  <small class="text-muted">Last updated 3 mins ago</small>
                </div>
              </div>
              <div class="card">
                <img class="card-img-top" src="..." alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Card title</h5>

                </div>
                <div class="card-footer">
                  <small class="text-muted">Last updated 3 mins ago</small>
                </div>
              </div>
              <div class="card">
                <img class="card-img-top" src="..." alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Card title</h5>

                </div>
                <div class="card-footer">
                  <small class="text-muted">Last updated 3 mins ago</small>
                </div>
              </div>
              <div class="card">
                <img class="card-img-top" src="..." alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Card title</h5>

                </div>
                <div class="card-footer">
                  <small class="text-muted">Last updated 3 mins ago</small>
                </div>
              </div>
              <div class="card">
                <img class="card-img-top" src="..." alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Card title</h5>

                </div>
                <div class="card-footer">
                  <small class="text-muted">Last updated 3 mins ago</small>
                </div>
              </div>
            </div>

          </div>
        </div>
        <br />
        <div class="border border-dark">
          <div class="row">
            <div class="col-lg-8">
              <div class="row">
                <div class="col-lg-2 text-center mt-2"><a href="#" class="active">Tat ca</a></div>
                <div class="col-lg-2 text-center mt-2"><a  href="#" >ca nhan</a></div>
                <div class="col-lg-3 text-center mt-2"><a  href="#" >ban chuyen</a></div>
              </div>

            </div>
            <div class="col-lg-4">
                <div class="dropdown">
                    <button type="button" class="btn btn-default dropdown-toggle dropdown-toggle-split" data-toggle="dropdown">
                      Tim moi truoc
                    </button>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">tin moi truoc</a>
                      <a class="dropdown-item" href="#">Gia thap den cao</a>
                      <a class="dropdown-item" href="#">Gia cao den thap</a>
                    </div>
                  </div>
            </div>
          </div>



        </div>
        <br/>
        <div id="body_content">
          <c:forEach items="${POSTS}" var="POST">
          <div class="media">
           <a href="/post/view/${POST.id}"> <img class="media-left" width="120" height="120" alt="Image" src="/upload/danhmuc.jpg"></a>
            <div class="media-body">
               <h3 class="card-title">${POST.title}</h3>
               <p class="card-text">${POST.price}</p>
               <br/>
               <p class="card-text">${POST.getUser().getName()} |${POST.getAddress().getWard().getCity().getName()}</p>
            </div>
             </div>
             <br/>
             <hr/>
          </c:forEach>
          </div>
        
    
      </div>
      <div class="col-lg-2"></div>
    </div>
  </div>
  <footer>
    <div id="footer-all">
      <div>
        <div class="foo-grids">
          <div class="col-md-6 footer-grid footer-top">
            <div class="col-sm-offset-3 col-sm-7">
              <!-- <a href="/"><img class="lazy-logo" style="max-width: 79%;" data-original="../images/chotot.png" alt="Logo"></a> -->
              <h4 class="footer-head">LiÃªn há»</h4>
              <span class="hq">Trá»¥ sá» chÃ­nh</span>
              <address>
                <ul class="location">
                  <li><span class="glyphicon glyphicon-map-marker"></span></li>
                  <li>Láº¦U 7 VÄN PHÃNG KHOA CNTT Äáº¡i há»c VÄn Lang</li>
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
            <div class="row">
              <div id="map" style="width:100%;height:45vh;"></div>
            </div>
          </div>
          <div class="clearfix"></div>
        </div>
      </div>
    </div>
    <div class="footer-bottom text-center">
      <div class="container">
        <div class="footer-logo">
          <a href="/"><span>Chá»£ Tá»t</span>&nbsp;VÄn Lang</a>
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
          <p> Â© 2018 Chá»£ tá»t VÄn Lang. All Rights Reserved |&nbsp;<span id="Id_online"></span>&nbsp;| Design by <a href="mailto:w.a.f-group@gmail.com">
              W.A.F Group</a></p>
        </div>
        <div class="clearfix"></div>
      </div>
    </div>

    <div class="text-center pull-right hello top hidden-xs" title="LÃªn TOP">
      <span>
        <i class="fa fa-angle-double-up" aria-hidden="true"></i>
      </span>
    </div>


    <div class="text-center pull-right hello caht" data-toggle="collapse" data-target="#chat" aria-expanded="true"
      title="TÃ­nh nÄng Äang ÄÆ°á»£c phÃ¡t triá»n">
      <span>
        <i class="fa fa-users" aria-hidden="true"></i>
      </span>
    </div>

    <div class="text-center pull-right hello caht" data-toggle="collapse" data-target="#chat" aria-expanded="true"
      title="TÃ­nh nÄng Äang ÄÆ°á»£c phÃ¡t triá»n">
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

     <!--  <input id="userCon" type="hidden" value=">" size="1" readonly disabled>-->

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
              <th colspan="2" class="text-danger">TÃ i khoáº£n chÆ°a ÄÆ°á»£c kÃ­ch hoáº¡t
                <span style="cursor: pointer;" data-toggle="collapse" data-target="#chat" aria-expanded="false" class="pull-right"><i
                    class="fa fa-times-circle-o" aria-hidden="true"></i></span>
              </th>
            </tr>
            <tr>
              <th colspan="2">Vui lÃ²ng liÃªn há»</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>Email</td>
              <td><a href="mailto:chototvlu@gmail.com">Chototvl@gmail.com</a></td>
            </tr>
            <tr>
              <td>Sá» Äiá»n thoáº¡i</td>
              <td>0909090909</td>
            </tr>
            <tr>
              <td>VPK</td>
              <td>Láº¦U 7 VÄN PHÃNG KHOA CNTT Äáº¡i há»c VÄn Lang</td>
            </tr>
          </tbody>
        </table>
      </div>

      <div class="pull-right col-sm-5 well">
        <a href="/dang-nhap">Vui lÃ²ng ÄÄng nháº­p</a>
      </div>

    </div>

  </footer>
<!-- js -->
<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
