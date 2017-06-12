<%@ page import="dto.UserInfo"%>
<%@ page import="java.util.List"%>
<%@ page import="dao.loginmodule.Resistration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	response.setCharacterEncoding("euc-kr");
%>
	<jsp:useBean id="dao" class="dao.loginmodule.Resistration"/>
	<jsp:useBean id="dto" class="dto.UserInfo"/>
	<jsp:setProperty name="dto" property="*"/>

<%
	dao.regUser(dto);
	//dao.regUser(U_ID, U_PW, U_NAME, U_NICKNAME, U_PHONE, U_EMAIL, U_ADDR, U_POSTNUMBER, U_BIRTH, U_GENDER, 
	//U_INTRODUCE, U_REGDATE, U_POINT, U_POWER, U_DELETE, U_QUESTION, U_ANSWER, U_COMMENT	)
%>

<h2>회원가입이 완료되었습니다.</h2>
<a href="../geoyeop_v1/main.html">메인으로</a>
<%=dto.getU_id()%>
<%=dto.getU_pw() %>
<%=dto.getU_name() %>
<%=dto.getU_nickname() %>
<%=dto.getU_phone() %>
<%=dto.getU_email() %>
<%=dto.getU_birth() %>
<%=dto.getU_gender() %>
<%=dto.getU_question() %>
<%=dto.getU_answer() %>


