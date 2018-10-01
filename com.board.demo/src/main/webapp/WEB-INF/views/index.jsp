<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="include/config.jsp" flush="false"/>
<style>
	td{
		text-align: center;
	}
</style>
<div id="wrap">
	<div id="container">
		<header>
			<nav>
				<a href="/insert">게시물작성</a>
			</nav>
		</header>
		<section>
			<article>
				<table>
					<colgroup>
						<col width="100">
						<col width="200">
						<col width="200">
						<col width="200">
						<col width="200">
					</colgroup>
					<thead>
						<th>글번호</th>
						<th>글제목</th>
						<th>작성자</th>
						<th>작성일</th>
						<th>조회수</th>
					</thead>
					<tbody>
						<c:forEach var="tbl" items="${listall}"  varStatus="index">
						<tr>
							<td>${tbl.idx}</td>
							<td><a href="/detail?idx=${tbl.idx}">${tbl.tit}</a></td>
							<td>${tbl.writer}</td>
							<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${tbl.regdate }"/></td>
							<td>${tbl.cnt}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				
				<div>
					<ul>
						<c:if test="${pageMaker.prev }">
							<li><a href="/?page=${pageMaker.startPage - 1}">&laquo;</a></li>
						</c:if>
						
						<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="idx">
							<li <c:out value="${pageMaker.cri.page == idx? 'class=active':''}"/>>
								<a href="/${pageMaker.makeQuery(idx)}">${idx}</a>
							</li>
						</c:forEach>
						
						<c:if test="${pageMaker.next && pageMaker.endPage > 0 }">
							<li>
								<a href="/?page=${pageMaker.endPage + 1 }">&raquo;</a>
							</li>
						</c:if>
					</ul>
				</div>
				
				
			</article>
		</section>
		<footer>
		
		</footer>
	</div>
</div>
</body>
</html>
