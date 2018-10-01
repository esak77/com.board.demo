<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="include/config.jsp" flush="false"/>


<script>
$(function(){
	$("input[type='submit']").hide();
	
})


function update(){
	$("input[type='submit']").show();
	$("input[name='tit']").attr("readonly",false);
	$("textarea[name='content']").attr("readonly",false);
}

function delete_content(idx){
	location.href="/delete?idx="+idx
}

function history_back(){
	history.go(-1);
}
</script>

<div id="wrap">
	<div id="container">
		<header>
			<nav>
				<a onclick="history_back();">리스트가기</a>
			</nav>
		</header>
		<section>
			<article>
				<form id="b_frm" action="/update_db" method="post" >
					<input type="hidden" name="idx" value="${detail.idx }">
					<input type="hidden" name="page" value="${cri.page }">
					<input type="hidden" name="perPageNum" value="${cri.perPageNum }">
					
					<p><lable>제목</lable><input type="text" name="tit" value="${detail.tit }" readonly="readonly"></p>
					<p><lable>작성자</lable><input type="text" name="writer" value="${detail.writer }" disabled="disabled"></p>
					<lable>내용</lable><textarea rows="10" cols="50" style="resize: none;" name="content"  readonly="readonly">${detail.content }</textarea>
					<input type="button" value="수정하기" onclick="update();">
					<input type="button" value="삭제하기" onclick="delete_content(${detail.idx});">
					<input type="submit" value="전송하기">
				</form>
			</article>
		</section>
		<footer>
		
		</footer>
	</div>
</div>
</body>
</html>
