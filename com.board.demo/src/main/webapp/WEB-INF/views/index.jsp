<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="include/config.jsp" flush="false"/>

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
							<td>${tbl.tit}</td>
							<td>${tbl.writer}</td>
							<td>${tbl.regdate}</td>
							<td>${tbl.cnt}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</article>
		</section>
		<footer>
		
		</footer>
	</div>
</div>
</body>
</html>
