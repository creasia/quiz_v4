<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="bootstrap332/css/bootstrap.min.css">
<script src="bootstrap332/js/jquery-3.2.1.min.js"></script>
<script src="bootstrap332/js/bootstrap.min.js"></script>
<style>body{margin-top: 40px}</style>

<script>
	$(
			function(){
				$("#btnPopup").click(
						function(){
							$("#theModal").modal();
						}
						);
			}
	);
</script>
<%
	request.setCharacterEncoding("euc-kr");
	response.setCharacterEncoding("euc-kr");
	String u_id ="";
	if(session.getAttribute("u_id")!=null){
		u_id = (String)session.getAttribute("u_id");
	}
%>
<title>Main</title>
</head>
<body>
<jsp:include page="/top.jsp"/>

<div class="container">   
        <div class="row">
            <div class="col-lg-12" align="center">
                <h1 class="page-header">Guilty Pleasure
                 
                </h1>
              <div class="alert alert-dismissible alert-warning">
				  <button type="button" class="close" data-dismiss="alert">&times;</button>
				  <h4>���� !!</h4>
				  <p>�ƹ����� ���� ���� �ȵǴ� ��� Ǫ�� ����Ʈ �Դϴ�.. �ȶ��� ���� �;� ��� �Դٸ� ���ư� �ּ��� :(</p>
				</div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 portfolio-item"  align="center">
                <a href="#">
                    <img class="img-responsive" src="https://cdn3.iconfinder.com/data/icons/forall/110/game-128.png" alt="">
                </a>
                <h3>
                    <a href="CORDING/QUIZ/SIngleStart.html">�̱��÷���</a>
                </h3>
             	<br><br><br>
            </div>
            <div class="col-md-4 portfolio-item"  align="center">
                <a href="#">
                    <img class="img-responsive" src="https://cdn0.iconfinder.com/data/icons/pokemon-go-vol-1/135/_Battle-128.png" alt="">
                </a>
                <h3>
                    <a href="#">��Ʋ�÷���</a>
                </h3>
               
            </div>
            <div class="col-md-4 portfolio-item"  align="center">
                <a href="#">
                    <img class="img-responsive" src="https://cdn3.iconfinder.com/data/icons/shopping-icons-14/128/01_Shopping_Cart-128.png" alt="">
                </a>
                <h3>
                    <a href="#">����</a>
                </h3>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 portfolio-item" align="center">
                <a href="#">
                    <img class="img-responsive" src="https://cdn2.iconfinder.com/data/icons/miscellaneous-31/60/birdhouse-128.png" alt="">
                </a>
                <h3>
                    <a href="#">������</a>
                </h3>
              	<br><br><br>
            </div>
            <div class="col-md-4 portfolio-item" align="center">
                <a href="CORDING/rank/rankBattle.jsp">
                    <img class="img-responsive" src="https://cdn4.iconfinder.com/data/icons/infographic-bar-pie-chart-vol-5-1/512/5-128.png" alt="">
                </a>
                <h3>
                    <a href="CORDING/rank/rankBattle.jsp">��ŷ</a>
                </h3>
               
            </div>
            <div class="col-md-4 portfolio-item" align="center">
                <a href="#">
                    <img class="img-responsive" src="https://cdn4.iconfinder.com/data/icons/business-finance-vol-12-2/512/24-128.png" alt="">
                </a>
                <h3>
                    <a href="#">��������</a>
                </h3>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 portfolio-item" align="center">
                <a href="#">
                    <img class="img-responsive" src="https://cdn2.iconfinder.com/data/icons/xomo-basics/128/document-05-128.png" alt="">
                </a>
                <h3>
                    <a href="#">�����Խ���</a>
                </h3>

            </div>
            <div class="col-md-4 portfolio-item" align="center">
                <a href="#">
                    <img class="img-responsive" src="https://cdn0.iconfinder.com/data/icons/office-icon-set-2/100/Noun_Project_100Icon_10px_grid-17-128.png" alt="">
                </a>
                <h3>
                    <a href="#">������</a>
                </h3>
    
            </div>
            <div class="col-md-4 portfolio-item" align="center">
                <a href="#theModal" data-toggle="modal">
                    <img class="img-responsive" src="https://cdn2.iconfinder.com/data/icons/new-year-s-hand-drawn-basic/64/question_mark-128.png" alt="">
                </a>
                <h3>
                    <a href="#theModal" data-toggle="modal">����Ʈ �ȳ�</a> 
                </h3>
             
            </div>
        </div>

        <hr>


        <footer>
            <div class="row">
                <div class="col-md-12">
                    <p>Copyright &copy; Guilty Pleasure</p>
                </div>
            </div>

        </footer>

    </div>
    
 <div class="modal fade" id="theModal" data-backdrop="static">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h3>�������� �������Ʈ �Դϴ�.</h3>
							</div>
							<div class="modal-body">
								<p>������ �����ϰ� ������ ������ ������ Ǯ��</p>
								<p>��ŷ�� �����ϼ���</p>
							</div>
							<div class="modal-footer">
							<button class="btn btn-primary" data-dismiss="modal">�ݱ�</button>
							</div>
						</div>
					</div>
 </div><!-- ��� -->   
</body>
</html>