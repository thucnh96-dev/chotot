	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="pagination-div">
<c:if test="${pdata.hasPrevious()}">
<span> <a href="/admin?page=${pdata.number -1 }&size=${page.size}">Previous</a> </span>
</c:if>
<c:forEach var="i" begin="0"  end="${pdata.totalPages- 1}" >
<c:if test="${pdata.number == i }">
<span class="selected">${ i + 1}</span>
</c:if>
<c:if test="${pdata.number == i }">
<span> <a href="/admin?page=${i}&size=${page.size}">${i+1}</a> </span>
</c:if>
<c:if test="${pdata.hasNext()}">
<span> <a href="/admin?page=${pdata.number +1 }&size=${page.size}">Next</a> </span>
</c:if>
</c:forEach>

</div>