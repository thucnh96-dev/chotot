<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<%@include file="/WEB-INF/views/user/manage/include/navbar.jsp"%>
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- inclue menu -->
			<%@include file="/WEB-INF/views/user/manage/include/sidebar.jsp"%>

			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row purchace-popup">
						<div class="col-12">
							<span class="d-block d-md-flex align-items-center">
								<p>Like what you see? Check out our premium version for
									more.</p> <a class="btn ml-auto download-button d-none d-md-block"
								href="https://github.com/BootstrapDash/Staradminv1-Free-Bootstrap-adminv1-Template"
								target="_blank">Download Free Version</a> <a
								class="btn purchase-button mt-4 mt-md-0"
								href="https://www.bootstrapdash.com/product/star-adminv1-pro/"
								target="_blank">Upgrade To Pro</a> <i
								class="mdi mdi-close popup-dismiss d-none d-md-block"></i>
							</span>
						</div>
					</div>
					<div class="row">
						<div
							class="col-xl-3 col-lg-3 col-md-3 col-sm-6 grid-margin stretch-card">
							<div class="card card-statistics">
								<div class="card-body">
									<div class="clearfix">
										<div class="float-left">
											<i class="mdi mdi-cube text-danger icon-lg"></i>
										</div>
										<div class="float-right">
											<p class="mb-0 text-right">Bạn đã tổng</p>
											<div class="fluid-container">
												<h3 class="font-weight-medium text-right mb-0">${total} -> bài đăng</h3>
											</div>
										</div>
									</div>
									<p class="text-muted mt-3 mb-0">
										<i class="mdi mdi-alert-octagon mr-1" aria-hidden="true"></i>
										Bài đăng
									</p>
								</div>
							</div>
						</div>
						<div
							class="col-xl-3 col-lg-3 col-md-3 col-sm-6 grid-margin stretch-card">
							<div class="card card-statistics">
								<div class="card-body">
									<div class="clearfix">
										<div class="float-left">
											<i class="mdi mdi-receipt text-warning icon-lg"></i>
										</div>
										<div class="float-right">
											<p class="mb-0 text-right">Đã duyệt</p>
											<div class="fluid-container">
												<h3 class="font-weight-medium text-right mb-0">${totalac} -> bài đăng</h3>
											</div>
										</div>
									</div>
									<p class="text-muted mt-3 mb-0">
										<i class="mdi mdi-bookmark-outline mr-1" aria-hidden="true"></i>
										Bài đăng
									</p>
								</div>
							</div>
						</div>
						<div
							class="col-xl-3 col-lg-3 col-md-3 col-sm-6 grid-margin stretch-card">
							<div class="card card-statistics">
								<div class="card-body">
									<div class="clearfix">
										<div class="float-left">
											<i class="mdi mdi-poll-box text-success icon-lg"></i>
										</div>
										<div class="float-right">
											<p class="mb-0 text-right">Chưa được duyệt</p>
											<div class="fluid-container">
												<h3 class="font-weight-medium text-right mb-0">
												${totalnot} -> bài đăng
											
												</h3>
											</div>
										</div>
									</div>
									<p class="text-muted mt-3 mb-0">
										<i class="mdi mdi-calendar mr-1" aria-hidden="true"></i>
										Bài đăng
									</p>
								</div>
							</div>
						</div>
						<div
							class="col-xl-3 col-lg-3 col-md-3 col-sm-6 grid-margin stretch-card">
							<div class="card card-statistics">
								<div class="card-body">
									<div class="clearfix">
										<div class="float-left">
											<i class="mdi mdi-account-location text-info icon-lg"></i>
										</div>
										<div class="float-right">
											<p class="mb-0 text-right">Bài đăng đang sẵn sàng</p>
											<div class="fluid-container">
												<h3 class="font-weight-medium text-right mb-0">${totalac} -> bài đăng</h3>
											</div>
										</div>
									</div>
									<p class="text-muted mt-3 mb-0">
										<i class="mdi mdi-reload mr-1" aria-hidden="true"></i>
										Bài đăng
									</p>
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-lg-12 grid-margin">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Quản lý bài post</h4>
									<div class="table-responsive">


										<%@include file="/WEB-INF/views/admin/post/search.jsp"%>

										<table class="table table-bordered" id="postactive">
											<thead>
												<tr>
													<th>Tiêu đề</th>													
													<th>Thông tin</th>
													<th>Giá</th>
													<th>Số Lượng</th>
													<th>Ngày đăng</th>
													<th>Danh mục</th>
													<th>Hình thức</th>
													<th>Trạng thái</th>
													<th>Action</th>
												</tr>
											</thead>
											<tbody>
											<c:forEach var="p" items="${DATA.content}">
												<tr>
													
													<td>${p.title}</td>
													<td>${p.description}</td>
													<td>${p.price}</td>
													<td class="text-danger">
													 <i class="mdi mdi-arrow-down">${p.quantity}</i>
													</td>
													<td>${p.createdAt}</td>
													<td>${p.subCategory.name}</td>
													<td>${p.status}</td>
													<td>${p.isAccept()}</td>
													<td>
														<div class="btn-group dropdown">
															<button type="button"
																class="btn btn-success dropdown-toggle btn-sm"
																data-toggle="dropdown" aria-haspopup="true"
																aria-expanded="false">Chức năng</button>
															<div class="dropdown-menu">
																<a class="dropdown-item" href="#"> <i
																	class="fa fa-reply fa-fw"></i>Xem
																</a> <a class="dropdown-item" href="#"> <i
																	class="fa fa-history fa-fw"></i>Xóa
																</a>
																<div class="dropdown-divider"></div>
															</div>
														</div>
													</td>
												</tr>
												</c:forEach>
											</tbody>
										</table>


									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 grid-margin">
							<div class="card">
								<div class="card-body">
									<h5 class="card-title mb-4">Xét duyệt Tickets</h5>
									<div class="fluid-container">
										<div class="row ticket-card mt-3 pb-2 border-bottom pb-3 mb-3">
											<div class="col-md-1">
												<img class="img-sm rounded-circle mb-4 mb-md-0"
													src="/adminv1/images/faces/face1.jpg" alt="profile image">
											</div>
											<div class="ticket-details col-md-9">
												<div class="d-flex">
													<p class="text-dark font-weight-semibold mr-2 mb-0 no-wrap">James
														:</p>
													<p class="text-primary mr-1 mb-0">[#23047]</p>
													<p class="mb-0 ellipsis">Donec rutrum congue leo eget
														malesuada.</p>
												</div>
												<p class="text-gray ellipsis mb-2">Donec rutrum congue
													leo eget malesuada. Quisque velit nisi, pretium ut lacinia
													in, elementum id enim vivamus.</p>
												<div class="row text-gray d-md-flex d-none">
													<div class="col-4 d-flex">
														<small class="mb-0 mr-2 text-muted text-muted">Last
															responded :</small> <small
															class="Last-responded mr-2 mb-0 text-muted text-muted">3
															hours ago</small>
													</div>
													<div class="col-4 d-flex">
														<small class="mb-0 mr-2 text-muted text-muted">Due
															in :</small> <small
															class="Last-responded mr-2 mb-0 text-muted text-muted">2
															Days</small>
													</div>
												</div>
											</div>
											<div class="ticket-actions col-md-2">
												<div class="btn-group dropdown">
													<button type="button"
														class="btn btn-success dropdown-toggle btn-sm"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Xét duyệt</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#"> <i
															class="fa fa-reply fa-fw"></i>Quick reply
														</a> <a class="dropdown-item" href="#"> <i
															class="fa fa-history fa-fw"></i>Another action
														</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#"> <i
															class="fa fa-check text-success fa-fw"></i>Resolve Issue
														</a> <a class="dropdown-item" href="#"> <i
															class="fa fa-times text-danger fa-fw"></i>Close Issue
														</a>
													</div>
												</div>
											</div>
										</div>
										<div class="row ticket-card mt-3 pb-2 border-bottom pb-3 mb-3">
											<div class="col-md-1">
												<img class="img-sm rounded-circle mb-4 mb-md-0"
													src="/adminv1/images/faces/face2.jpg" alt="profile image">
											</div>
											<div class="ticket-details col-md-9">
												<div class="d-flex">
													<p class="text-dark font-weight-semibold mr-2 mb-0 no-wrap">Stella
														:</p>
													<p class="text-primary mr-1 mb-0">[#23135]</p>
													<p class="mb-0 ellipsis">Curabitur aliquet quam id dui
														posuere blandit.</p>
												</div>
												<p class="text-gray ellipsis mb-2">Pellentesque in ipsum
													id orci porta dapibus. Sed porttitor lectus nibh. Curabitur
													non nulla sit amet nisl.</p>
												<div class="row text-gray d-md-flex d-none">
													<div class="col-4 d-flex">
														<small class="mb-0 mr-2 text-muted">Last responded
															:</small> <small class="Last-responded mr-2 mb-0 text-muted">3
															hours ago</small>
													</div>
													<div class="col-4 d-flex">
														<small class="mb-0 mr-2 text-muted">Due in :</small> <small
															class="Last-responded mr-2 mb-0 text-muted">2
															Days</small>
													</div>
												</div>
											</div>
											<div class="ticket-actions col-md-2">
												<div class="btn-group dropdown">
													<button type="button"
														class="btn btn-success dropdown-toggle btn-sm"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Xét duyệt</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#"> <i
															class="fa fa-reply fa-fw"></i>Quick reply
														</a> <a class="dropdown-item" href="#"> <i
															class="fa fa-history fa-fw"></i>Another action
														</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#"> <i
															class="fa fa-check text-success fa-fw"></i>Resolve Issue
														</a> <a class="dropdown-item" href="#"> <i
															class="fa fa-times text-danger fa-fw"></i>Close Issue
														</a>
													</div>
												</div>
											</div>
										</div>
										<div class="row ticket-card mt-3">
											<div class="col-md-1">
												<img class="img-sm rounded-circle mb-4 mb-md-0"
													src="/adminv1/images/faces/face3.jpg" alt="profile image">
											</div>
											<div class="ticket-details col-md-9">
												<div class="d-flex">
													<p class="text-dark font-weight-semibold mr-2 mb-0 no-wrap">John
														Doe :</p>
													<p class="text-primary mr-1 mb-0">[#23246]</p>
													<p class="mb-0 ellipsis">Mauris blandit aliquet elit,
														eget tincidunt nibh pulvinar.</p>
												</div>
												<p class="text-gray ellipsis mb-2">Nulla quis lorem ut
													libero malesuada feugiat. Proin eget tortor risus. Lorem
													ipsum dolor sit amet.</p>
												<div class="row text-gray d-md-flex d-none">
													<div class="col-4 d-flex">
														<small class="mb-0 mr-2 text-muted">Last responded
															:</small> <small class="Last-responded mr-2 mb-0 text-muted">3
															hours ago</small>
													</div>
													<div class="col-4 d-flex">
														<small class="mb-0 mr-2 text-muted">Due in :</small> <small
															class="Last-responded mr-2 mb-0 text-muted">2
															Days</small>
													</div>
												</div>
											</div>
											<div class="ticket-actions col-md-2">
												<div class="btn-group dropdown">
													<button type="button"
														class="btn btn-success dropdown-toggle btn-sm"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Xét duyệt</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#"> <i
															class="fa fa-reply fa-fw"></i>Quick reply
														</a> <a class="dropdown-item" href="#"> <i
															class="fa fa-history fa-fw"></i>Another action
														</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#"> <i
															class="fa fa-check text-success fa-fw"></i>Resolve Issue
														</a> <a class="dropdown-item" href="#"> <i
															class="fa fa-times text-danger fa-fw"></i>Close Issue
														</a>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:partials/_footer.html -->
				<%@include file="/WEB-INF/views/user/manage/include/footer.jsp"%>
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