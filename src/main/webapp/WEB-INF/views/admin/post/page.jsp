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
	<div  >
		<nav aria-label="Page navigation example">
			<ul class="pagination">		
			<c:if test="${data.hasPrevious()}">
					<li class="page-item">
						<a class="page-link" 
						href="/admin/post/content?page=${data.number -1}&size=${data.size}
						                                                &searchCnt=<%=request.getParameter("searchCnt") %>
						                                                &idsubcate=<%=request.getParameter("idsubcate")  %> 
						                                                &search_title=<%=request.getParameter("search_title") %>  
						                                                &search_des=<%=request.getParameter("search_des") %>     
						                                                &user_name=<%=request.getParameter("user_name") %>     "					
						aria-label="Previous"> 
						<span aria-hidden="true">&laquo;</span>
						<span class="sr-only">Previous</span>
						</a>
						
					</li>
				
				</c:if>
				<c:forEach var="i" begin="0" end="${data.totalPages}">
				
				
						
						  <li class="active page-item" >	
					
						  <a class="page-link" 
						  href="/admin/post/content?page=${i}
						                                                &size=${data.size}
						                                                &searchCnt=<%=request.getParameter("searchCnt") %>
						                                                &idsubcate=<%=request.getParameter("idsubcate")  %> 
						                                                &search_title=<%=request.getParameter("search_title") %>  
						                                                &search_des=<%=request.getParameter("search_des") %>     
						                                                &user_name=<%=request.getParameter("user_name") %>  "				 				  
						  > ${ i+1 } </a>	
					</li>	
				  
				</c:forEach>
					
					
				<c:if test="${data.hasNext()}">
					<li class="page-item">
							<a class="page-link" 
							href="/admin/post/content?page=${data.number +1}&size=${data.size}
							                                                &searchCnt=<%=request.getParameter("searchCnt") %>
							                                                &idsubcate=<%=request.getParameter("idsubcate")  %> 
							                                                &search_title=<%=request.getParameter("search_title") %>  
							                                                &search_des=<%=request.getParameter("search_des") %>     
							                                                &user_name=<%=request.getParameter("user_name") %>     "							
							aria-label="Previous"> 
							<span aria-hidden="true">&laquo;</span>
							<span class="sr-only">Next</span>
							</a>							
					 </li>				
				</c:if>
			</ul>
		</nav>
	</div>
</body>
</html>