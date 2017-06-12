<%@ page import="dto.UserInfo"%>
<%@ page import="java.util.List"%>
<%@ page import="dao.loginmodule.Login"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	response.setCharacterEncoding("euc-kr");
%>
	<jsp:useBean id="dao" class="dao.loginmodule.Login"/>
	<jsp:useBean id="dto" class="dto.UserInfo"/>
	<jsp:setProperty name="dto" property="*"/>

<%
	String u_id = request.getParameter("form-username");
	String u_pw = request.getParameter("form-password");
	
	UserInfo userinfo = dao.getUser(u_id);

	
	if(u_pw.equals(userinfo.getU_pw())){
		session.setAttribute("u_id", "u_id");
		response.sendRedirect("../../main.html");
	}
	else{
		session.setAttribute("u_id", "err");
		response.sendRedirect("login_err.html");		
	}

%>