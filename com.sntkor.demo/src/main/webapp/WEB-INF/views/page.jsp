<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/resources/demomenu/css/common_page.css" type="text/css" rel="stylesheet">
<link href="/resources/demomenu/css/bootstrap-touch-slider.css" type="text/css" rel="stylesheet">
<link href="/resources/demomenu/css/jquery.fullPage.css" type="text/css" rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css" rel="stylesheet" media="all">

<title>반응형 네비게이션 메뉴</title>

<script type="text/javascript" src="/resources/demomenu/js/jquery.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<script type="text/javascript" src="/resources/demomenu/js/common_page.js"></script>
<script type="text/javascript" src="/resources/demomenu/js/bootstrap-touch-slider-min.js"></script>
<script type="text/javascript" src="/resources/demomenu/js/bootstrap-touch-slider.js"></script>
<script type="text/javascript" src="/resources/demomenu/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/demomenu/js/jquery.fullPage.js"></script>

</head>
<body>
	<div class="wrap">
		<div class="section" id="section01">
			<div class="header">
				<div class="row">
					<a href="">
						<div class="logo">
							<img alt="logo" src="/resources/demomenu/images/logo.jpg">
						</div>
					</a>
					<div class="nav">
						<ul>
							<li></li>
							<li></li>
							<li></li>
							<li></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="container">
				<form id="idc">
					<input type="text" name="company" id="company" placeholder="고객사">
					<input type="text" name="vender" id="vender" placeholder="벤더사">
				</form>
				<button onclick="new_add();">생성하기</button>
				<button onclick="rack_add();">rack 추가</button>
				<div class="test_area">
					<div class="t_content_add">
					</div>
					<div class="t_content_wrap">
						<div class="rack_1">
							<c:forEach var="list" varStatus="status" items="${list}">
								<span class="test test_${status.count}" onmouseenter="move();" ondblclick="info(${status.count});">sever_${list.idx}</span>
							</c:forEach>
						</div>
					</div>
				</div>
				
			</div>
		</div>
	<!-- 	<div class="section" id="section02"></div>
		<div class="section" id="section03"></div>
		<div class="section" id="section04"></div> -->
	</div>
</body>
</html>
