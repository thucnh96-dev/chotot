<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>quản lí bài đăng</title>
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
			 <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item nav-profile">
            <div class="nav-link">
              <div class="user-wrapper">
                <div class="profile-image">
                  <img src="/adminv1/images/faces/face1.jpg" alt="profile image">
                </div>
  
              </div>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/">
              <i class="menu-icon mdi mdi-television"></i>
              <span class="menu-title">Trang chủ</span>
            </a>
          </li>
 
        </ul>
      </nav>

			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
				
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

                                <%@include file="/WEB-INF/views/user/manage/include/page.jsp"%>
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