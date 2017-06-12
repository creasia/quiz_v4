<%@page import="dto.Quiz"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script>
	var number; //문제의 총 수량을 가져온다.
	count = 10;
	function timer(){
		var text = document.getElementById("count");
		text.innerHTML= count;
		count--;
		if(count < 0){
			clearInterval(tid);
			if(number >=0){
			location.href="/GuiltyPleasure/quiz?cmd=QUIZ_GET";
			//	number--;
			}else if(number <0){
				alert("문제 끝")
			}
		}
	}
	window.onload = function(){
		tid = setInterval('timer()', 1000);
	}
</script>
</head>
<body>
	<h1>싱글 플레이 시작</h1>

	<div style="float: left; width: 60%">
		첫번째 영역
		<div style="width: 60%; height: 300px">
			퀴즈 문제가 나오는 곳
			<c:import url="/Quiz/SingleQuiz.jsp">
				<c:param name="quiz" value="${quiz}"></c:param>
			</c:import>
		</div>
		<div style="width: 60%; height: 100px">
			퀴즈 보기가 나오는 곳
			<c:import url="/Quiz/SingleAnswer.jsp">
				<c:param name="answer" value="${quiz}"></c:param>
			</c:import>
		<div id="count" style="float: left; width: 50%">
		</div>
		<div style="float: right; width: 50%">
			<input type="button" value="포기하기"/>
		</div>
		</div>
	</div>

	<div style="border: 2px solid; float: right; width: 30%; height: 300px">
		두번째 영역입니다.
		<c:if test="${combo ne null}">
			콤보를 출력합니다.
		</c:if>
	</div>
</body>
</html>