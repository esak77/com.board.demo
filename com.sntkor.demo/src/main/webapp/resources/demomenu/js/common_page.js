$(function(){
	//$(".wrap, .section").height($(window).height());
	
	/*$(".section").each(function () {
        // 개별적으로 Wheel 이벤트 적용
        $(this).on("mousewheel DOMMouseScroll", function (e) {
            e.preventDefault();
            var delta = 0;
            if (!event) event = window.event;
            if (event.wheelDelta) {
                delta = event.wheelDelta / 120;
                if (window.opera) delta = -delta;
            } else if (event.detail) delta = -event.detail / 3;
            var moveTop = null;
            // 마우스휠을 위에서 아래로
            if (delta < 0) {
                if ($(this).next() != undefined) {
                    moveTop = $(this).next().offset().top;
                }
            // 마우스휠을 아래에서 위로
            } else {
                if ($(this).prev() != undefined) {
                    moveTop = $(this).prev().offset().top;
                }
            }
            // 화면 이동 0.8초(800)
            $("html,body").stop().animate({
                scrollTop: moveTop + 'px'
            }, {
                duration: 800, complete: function () {
                }
            });
        });
    });*/
	
	console.log(typeof($(".rack_1").offset().top) + " : "+$(".rack_1").offset().left);
	$(".test_1").offset({
		left : $(".rack_1").offset().left
	})
})


function new_add(){
	var form = $("#idc").serialize();
	$.ajax({
		type : "POST",
		url : "/insert",
		data : form,
		dataType : "text",
		success : function(data) {
			// 갯수 구하기
			var idx = $(".test").length+1;
			var tag = "<span class='test test_"+idx+"'"+"onmouseenter='move();' ondblclick='info();'>server_"+idx+"</span>";
			$(".t_content_add").append(tag);
			$("#company, #vender").text("");
		}
	});
}
function rack_add(){
	
}
function move(){
	var idx = $(".test").length;
	for(var i=1; i<=idx; i++){
		$(".test_"+i).draggable({
			stop:function(){
				console.log($(this).offset().top + " : " +$(this).offset().left);
			}
		})
	}
}
function info(idx){
	console.log(idx + " : " + typeof(idx));
	window.open("/detail?idx="+idx,"_blank","width=400,height=300");
}


