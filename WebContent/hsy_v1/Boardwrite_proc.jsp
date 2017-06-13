<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	request.setCharacterEncoding("euc-kr");
%>

<jsp:useBean id="dao" class="dao.boardmodule.BoardUpload"/>
<jsp:useBean id="dto" class="dto.Board">
	<jsp:setProperty property="*" name="dto"/>
</jsp:useBean>

<%
	
	dao.insertBoard(dto);
	response.sendRedirect("BoardList.jsp");
%>
