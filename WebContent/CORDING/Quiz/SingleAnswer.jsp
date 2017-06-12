<%@page import="dto.Quiz"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<%request.setCharacterEncoding("euc-kr");%>
<script>
	function combocheck(i){
		//var i = "\""+"select"+i+"\"";
		answer = document.getElementById(i).value;
	</script>
	<input type="hidden" name="cmd" value="QUIZ_CHECK"/>
	<input type="hidden" name="answer" value=answer/>
	<script>
	location.href="/GuiltyPleasure/quiz?cmd=QUIZ_GET";
	}
</script>
</head>
<body>
	<h1>보기가 나오는 곳입니다.</h1>
	<form method="post" name = "button">
		<input type="button" value="${quiz.getQ_wa_a()}"  id="1" onclick="combocheck(1)"/>
		<input type="button" value="${quiz.getQ_answer()}"  id="2" onclick="combocheck(2)"/>
		<input type="button" value="${quiz.getQ_wa_b()}"  id="3" onclick="combocheck(3)"/>
		<input type="button" value="${quiz.getQ_wa_c()}" id="4" onclick="combocheck(4)"/>
	</form>
</body>
</html>