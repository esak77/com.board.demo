<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="include/config.jsp" flush="false"/>

<div id="wrap">
	<div id="container">
		<header>
			<nav>
				<a href="/">리스트가기</a>
			</nav>
		</header>
		<section>
			<article>
				<form id="b_frm" action="/insert_db" method="post">
					<p><lable>제목</lable><input type="text" name="tit"></p>
					<p><lable>작성자</lable><input type="text" name="writer"></p>
					<lable>내용</lable><textarea rows="10" cols="50" style="resize: none;" name="content"></textarea>
					<input type="submit" value="작성하기">
				</form>
			</article>
		</section>
		<footer>
		
		</footer>
	</div>
</div>
</body>
</html>
