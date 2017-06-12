<%@page import="dto.u_battle"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<jsp:useBean id="dao" class="dao.exam"></jsp:useBean>
<meta charset="EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../bootstrap332/css/bootstrap.min.css">
<script src="../bootstrap332/js/jquery-3.2.1.min.js"></script>
<script src="../bootstrap332/js/bootstrap.min.js"></script>
<style>body{margin-top: 40px}</style>
<%
	request.setCharacterEncoding("euc-kr");
	List list = dao.getBoardList();
%>
<title>Ranking</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container" >
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
             
            </div>    
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
                <ul class="nav navbar-nav"  >
                <li>
                <img src="https://cdn0.iconfinder.com/data/icons/chinese-new-year-4/64/treasure-chinese-new-year-heritage-diamond-128.png"
                	width="100px" height="50px">
                	
                </li>
                    <li>
                        <a href="#">로그인</a>
                    </li>
                    <li>
                        <a href="#">회원가입</a>
                    </li>
                    <li>
                    	<a href="idpw.html">아이디/비밀번호 찾기</a>     
                    </li>
                </ul>
            </div>
        </div>
</nav>
    
<div class="container">   
        <div class="row col-lg-12">
            <div class="col-lg-12" >
            <div class="col-lg-12" align="center">
                <h1 class="page-header">배틀 승률 랭킹 </h1>
               <a href="#">배틀 승률</a> &nbsp;&nbsp;&nbsp;<a href="#">정답률</a><br><br>
           	<br>
            </div>
 <%
			u_battle One = (u_battle)list.get(0);			
			u_battle Two = (u_battle)list.get(1);			
			u_battle Three = (u_battle)list.get(2);			
%>		          	
          <div class="col-lg-12" >
           	<div class="alert alert-dismissible alert-danger col-lg-3">
				 
				  <h4>1위 <%=One.getU_nickname()%></h4>
				  <p><%=One.getU_comment()%></p>		  
			</div>
           <div class="col-lg-1" ></div>
            <div class="alert alert-dismissible alert-info col-lg-3">
				  
				  <h4>2위 <%=Two.getU_nickname()%></h4>
				  <p><%=Two.getU_comment()%></p>
			</div>
             <div class="col-lg-1" ></div>
            <div class="alert alert-dismissible alert-success col-lg-3">
				  
				  <h4>3위 <%=Three.getU_nickname()%></h4>
				  <p><%=Three.getU_comment()%></p>
            </div>
            <br><br>
           </div>
        
            	<h2 class="page-header" align="center">내 랭킹</h2>
<%
String id="";
if(id.length()>0){
%>
            	
            	<table class="table table-striped table-hover ">
				  <thead>
				    <tr>
				      <th>순위</th>
				      <th>닉네임</th>
				      <th>승리</th>
				      <th>패배</th>
				      <th>승률</th>
				    </tr>
				  </thead>
				  <tbody>
				  <tr class="active">
				      <td>7</td>
				      <td>아무개</td>
				      <td>5</td>
				      <td>5</td>
				      <td>50%</td>
				    </tr>
				  </tbody>
				</table>
<%
	}else{
%>		
<div align="center">

<a href="#">로그인</a>이 필요한 서비스 입니다.
</div>
<%		
}
%>
				<br><br>
                <h2 class="page-header" align="center">전체 랭킹</h2>
                <table class="table table-striped table-hover ">
				  <thead>
				    <tr>
				      <th>순위</th>
				      <th>닉네임</th>
				      <th>승리</th>
				      <th>패배</th>
				      <th>승률</th>
				    </tr>
				  </thead>
				  <tbody>
 <%
	for(int i=0; i<list.size();i++){
			u_battle dto = (u_battle)list.get(i);	
%>			
		<tr <%if(i%2==0){%>class="info"<%} %>>
			<td><%=i+1%></td>
			<td><%=dto.getU_nickname()%></td>
			<td><%=dto.getU_win() %></td>
			<td><%=dto.getU_lose() %></td>
			<td><%=dto.getU_win()*100/(dto.getU_win()+dto.getU_lose())%>%</td>
		</tr>
<% 		}%>
				  </tbody>
				</table> 
            </div>
        </div>
         <footer>
            <div class="row">
                <div class="col-md-12">
                    <p>Copyright &copy; Guilty Pleasure</p>
                </div>
            </div>

        </footer>
</div>
<!-- container -->   
     
</body>
</html>