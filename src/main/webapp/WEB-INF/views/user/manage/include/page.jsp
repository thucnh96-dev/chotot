<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	<div>
		<nav aria-label="Page navigation example">
			<ul class="pagination">
				<c:if test="${data.hasPrevious()}">
					<li class="page-item"><a class="page-link"
						href="/user/manage?page=${data.number -1}&size=${data.size}"
						aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
							<span class="sr-only">Previous</span>
					</a></li>

				</c:if>
				<c:forEach var="i" begin="0" end="${data.totalPages}">
					<li class="active page-item"><a class="page-link"
						href="/user/manage?page=${i}&size=${data.size}">
							${ i+1 } </a></li>

				</c:forEach>


				<c:if test="${data.hasNext()}">
					<li class="page-item"><a class="page-link"
						href="/user/manage?page=${data.number +1}&size=${data.size}"
						aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
							<span class="sr-only">Next</span>
					</a></li>
				</c:if>
			</ul>
		</nav>
	</div>
</body>
</html>