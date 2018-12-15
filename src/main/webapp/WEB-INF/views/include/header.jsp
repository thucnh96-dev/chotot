<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<div id="header_all" class="header">
	<div class="container">
		<div class="logo">
			<a href="/"><span><img class="img-responsive image-circle"
					src="/upload/favicon.png" alt="logo" height="64" width="64"
					style="float: left;">Chợ Tốt</span>&nbsp;Văn Lang</a>
		</div>
		<div class="header-right" style="padding: 20px;">
			<div class="dropdown" style="width: fit-content; margin: 0 auto;">

				<button class="btn btn-success dropdown-toggle" type="button"
					data-toggle="dropdown">
					Xin
					chào&nbsp;${pageContext.request.userPrincipal.name}&nbsp; <span
						class="caret"></span>
				</button>
				<ul class="dropdown-menu">
					<c:if test="${empty pageContext.request.userPrincipal.name}">
						<li><a class="" href="/login">Đăng nhập</a></li>
						<li class="divider"></li>
						<li><a class="" href="/auth/register">Đăng ký</a></li>
					</c:if>
					<c:if test="${not empty pageContext.request.userPrincipal.name}">
						<li><a class="" href="/user/profile">Thông tin tài khoản</a></li>
						<li><a class="" href="/dang-xuat">Dang xuat</a></li>
					</c:if>

				</ul>
			</div>
		
		</div>
		<a href="/find">
		<div class="header-right" style="padding: 25px;"><img alt="search" src="/upload/search.png">Tim kiem</div>
		</a>
	</div>
</div>