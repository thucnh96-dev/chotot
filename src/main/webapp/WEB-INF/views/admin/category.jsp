<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Star adminv1 Free Bootstrap adminv1 Dashboard Template</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="/adminv1/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="/adminv1/vendors/css/vendor.bundle.base.css">
<link rel="stylesheet"
	href="adminv1/vendors/css/vendor.bundle.addons.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="/adminv1/css/style.css">
<!-- endinject -->
<link rel="shortcut icon" href="/adminv1/images/favicon.png" />
</head>

<body>
	<div class="container-scroller">
		<!-- partial:partials/_navbar.html -->
		<%@include file="/WEB-INF/views/admin/include/navbar.jsp"%>
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_sidebar.html -->
			<%@include file="/WEB-INF/views/admin/include/sidebar.jsp"%>
			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row">
						<div class="col-lg-4 grid-margin"></div>
						<div class="col-lg-4 grid-margin">
							<div class="card">
								<div class="card-body">

									<h4 class="card-title">${action} Category</h4>
									<div class="table-responsive">
										<form action="/categories/${action}" method="post"
											enctype="multipart/form-data">
											<div class="form-group">
												<label for="">Ten</label> <input type="text"
													class="form-control" name="name" value="${CATEGORY.name}">
											</div>
											<div class="form-group">
												<label for="description">Mo ta</label>
												<textarea class="form-control"
													name="description" id="description" rows="3">${CATEGORY.description}</textarea>
											</div>
											<input type="hidden" name="id" value="${CATEGORY.id}">
											<div class="form-group">
												<label for="">Anh </label> <input type="file"
													class="form-control-file" name="files" multiple>
											</div>
											<div class="form-group">
												<label for="">Luu</label> <input type="submit"
													class="form-control" name="action"
													aria-describedby="helpId" placeholder="">
											</div>
										</form>

									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-4 grid-margin"></div>
					</div>

					<!-- content-wrapper ends -->
					<!-- partial:partials/_footer.html -->
					<footer class="footer">
						<div class="container-fluid clearfix">
							<span
								class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright
								© 2018 <a href="http://www.bootstrapdash.com/" target="_blank">Bootstrapdash</a>.
								All rights reserved.
							</span> <span
								class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted
								& made with <i class="mdi mdi-heart text-danger"></i>
							</span>
						</div>
					</footer>
					<!-- partial -->
				</div>
				<!-- main-panel ends -->
			</div>
			<!-- page-body-wrapper ends -->
		</div>
		<!-- container-scroller -->

		<!-- plugins:js -->
		<script src="/adminv1/vendors/js/vendor.bundle.base.js"></script>
		<script src="/adminv1/vendors/js/vendor.bundle.addons.js"></script>
		<!-- endinject -->
		<!-- Plugin js for this page-->
		<!-- End plugin js for this page-->
		<!-- inject:js -->
		<script src="/adminv1/js/off-canvas.js"></script>
		<script src="/adminv1/js/misc.js"></script>
		<!-- endinject -->
		<!-- Custom js for this page-->
		<script src="/adminv1/js/dashboard.js"></script>
		<!-- End custom js for this page-->
</body>

</html>