<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>

<%@include file="/WEB-INF/views/include/title.jsp"%>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css"
	integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
<script type="text/javascript" src="/js/custom.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

</head>

<body>
	<%@include file="/WEB-INF/views/include/header.jsp"%>

	<div class="container">

		<div class="row">
			<div class="col-lg-2"></div>
			<div class="col-lg-8">
				<h4 id="loadName">${CATEGORY.name}Toàn quốc 2018 Giá Rẻ</h4>
				<form action="" method="post" class="form-horizontal">
					<div class="input-group col-lg-11">
						<input class="form-control py-2" type="search" id="search-input">
						<span class="input-group-append">
							<button class="btn btn-outline-secondary" type="button"
								onclick="search()">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>


				</form>
				<br />
				<div class="row">
					<div class="col-lg-5">
						<!-- Button trigger modal -->
						<button type="button"
							class="btn btn-lg btn-block dropdown-toggle dropdown-toggle-split"
							data-toggle="modal" data-target="#addressId"
							name="exampleModalLongTitle">Toan quoc</button>

						<!-- Modal -->
						<div class="modal fade" id="addressId" tabindex="-1" role="dialog"
							aria-labelledby="exampleModalLongTitle" id="modal_address"
							aria-hidden="true">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<h2 class="modal-title" name="exampleModalLongTitle">Chon
											khu vuc</h2>
										<i class="fa fa-close close " aria-hidden="true"
											data-dismiss="modal"></i>
										<!-- <button type="button" class="close mr-12" data-dismiss="modal"> -->
										<!-- <span aria-hidden="true">&times;</span> -->

									</div>
									<ul class="list-group modal-body" id="address">
										<a href="#" style="text-decoration: none;">
											<li class="list-group-item " name="exampleModalLongTitle">Toan
												Quoc <i class="fa fa-angle-right fa-5 pull-right"></i>
										</li>
										</a>
										<c:forEach var="CITY" items="${CITYS}">
											<a href="#" style="text-decoration: none;"
												onclick="addressShow('${CITY.id}', '${CITY.name}')">
												<li class="list-group-item ">${CITY.name}<i
													class="fa fa-angle-right fa-5 pull-right"></i></li>
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
							<button type="button"
								class="btn btn-lg btn-block dropdown-toggle dropdown-toggle-split"
								data-toggle="dropdown" id="btn_name_Cate">${CATE}</button>
							<div class="dropdown-menu ">
								<c:if test="${CATEGORY==null}">
									<c:forEach items="${CATEGORIES}" var="CATE">
										<a class="dropdown-item" href="#" id="subcategory"
											value="${CATE.id}"
											onclick="btnCate('${CATE.id}', '${CATE.name}')">${CATE.name}</a>
									</c:forEach>

								</c:if>
								<c:forEach items="${CATEGORY.getSubcategories()}" var="SUB">
									<a class="dropdown-item" href="#" id="subcategory"
										value="${SUB.id}"
										onclick="btnSubcate('${SUB.id}', '${SUB.name}')">${SUB.name}</a>
								</c:forEach>
							</div>
						</div>
					</div>
					<div class="col-lg-2">
						<div class="dropdown">
							<button type="button"
								class="btn btn-lg btn-block dropdown-toggle dropdown-toggle-split"
								data-toggle="dropdown">Loc</button>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="#">Link 1</a> <a
									class="dropdown-item" href="#">Link 2</a> <a
									class="dropdown-item" href="#">Link 3</a>
							</div>
						</div>
					</div>

				</div>
				<br />
				<div class="border border-dark p-5">
					<h3>tin dac biet</h3>
					<div class="row">

						<div class="card-deck">
						<c:forEach var="TOP" items="${TOP5}">
						<div class="card">
								<img class="card-img-top" src="/upload/${TOP.getPhotos().get(0).getName()}" alt="Card image cap">
								<div class="card-body">
									<h5 class="card-title">${TOP.title}</h5>

								</div>
								<div class="card-footer">
									<small class="text-muted">${TOP.createdAt}</small>
								</div>
							</div>
						</c:forEach>
						</div>

					</div>
				</div>
				<br />
				<div class="border border-dark">
					<div class="row">
						<div class="col-lg-8">
							<div class="row">
								<div class="col-lg-2 text-center mt-2">
									<a href="#" class="active">Tat ca</a>
								</div>
								<div class="col-lg-2 text-center mt-2">
									<a href="#">ca nhan</a>
								</div>
								<div class="col-lg-3 text-center mt-2">
									<a href="#">ban chuyen</a>
								</div>
							</div>

						</div>
						<div class="col-lg-4">
							<div class="dropdown">
								<button type="button"
									class="btn btn-default dropdown-toggle dropdown-toggle-split"
									data-toggle="dropdown">Tim moi truoc</button>
								<div class="dropdown-menu">
									<a class="dropdown-item" href="#">tin moi truoc</a> <a
										class="dropdown-item" href="#">Gia thap den cao</a> <a
										class="dropdown-item" href="#">Gia cao den thap</a>
								</div>
							</div>
						</div>
					</div>



				</div>
				<br />
				<div id="body_content">
					<c:forEach items="${POSTS}" var="POST">
						<div class="media">
							<a href="/post/view/${POST.id}"> <img class="media-left"
								width="120" height="120" alt="Image" src="/upload/${TOP.getPhotos().get(0).getName()}"></a>
							<div class="media-body">
								<h3 class="card-title">${POST.title}</h3>
								<p class="card-text">${POST.price}</p>
								<br />
								<p class="card-text">${POST.getUser().getName()}
									|${POST.getAddress().getWard().getCity().getName()}</p>
							</div>
						</div>
						<br />
						<hr />
					</c:forEach>
				</div>

				<nav aria-label="Page navigation example">
					<ul class="pagination">
						<c:forEach var="i" begin="1" end="${PAGE}">
							<c:if test="${PAGE > 1}">
								<li class="page-item "><a class="page-link"
									href="/find?page=${i-1}">Previous</a></li>
							</c:if>
							<c:choose>
								<c:when test="${i == PAGE }">
									<li class="page-item active"><a class="page-link"
										href="/find?page=${i}">1</a></li>
								</c:when>
								<c:otherwise>
									<li class="page-item"><a class="page-link" href="#">${i}</a></li>
								</c:otherwise>
							</c:choose>

							<c:if test="${PAGE > 1}">
								<li class="page-item"><a class="page-link"
									href="/find?page=${i+1}">Next</a></li>
							</c:if>

						</c:forEach>

					</ul>
				</nav>
			</div>

			<div class="col-lg-2"></div>
		</div>
	</div>
	<%@include file="/WEB-INF/views/include/footer.jsp"%>
	<!-- js -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<!-- js -->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

	<script src="/js/lazyload.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/bootstrap-select.js"></script>
	<script src="/js/hiddenporo.js"></script>

</body>
</html>
