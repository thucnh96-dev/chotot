<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>

	<div class="box box-search">
		<div class="box-header with-border">
			<i class="fa fa-search"></i>
			<h3 class="box-title">Search</h3>
			<div class="box-tools pull-right">
			
			</div> 
		</div>

		<div class="box-body">
			<div class="row">
				<form action="" method="get" class="form-inline">
					<div class="form-group">
						<select class="form-control" name="searchCnt">
							<option value="10" selected="<%=request.getParameter("size")=="10" || request.getParameter("searchCnt") =="10"%>" >10
								User</option>
							<option value="20" selected="<%=request.getParameter("size")=="20" || request.getParameter("searchCnt") =="20"%>">20
								User</option>
							<option value="30" selected="<%=request.getParameter("size")=="30" || request.getParameter("searchCnt") =="30"%>">30
								User</option>
							<option value="50" selected="<%=request.getParameter("size")=="50" || request.getParameter("searchCnt") =="50"%>">50
								User</option>
							<option value="100"selected="<%=request.getParameter("size")=="100" || request.getParameter("searchCnt") =="100"%>">100
								User</option>
						</select>
					</div>
			

					<div class="form-group">
						<input type="text" class="form-control" name="text"
							placeholder="text" value="<%=request.getParameter("text")==null? "":request.getParameter("text")%>" autocomplete="off">
					</div>
			

                        
					<div class="form-group">
						<input type="submit" class="form-control btn btn-info" value="Tìm kiếm">
					</div>
				
				</form>
			</div>
		</div>
	</div>
</body>
</html>