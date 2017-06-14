package dao.quizmodule;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.Command;
import controller.CommandFactory;

/**
 * Servlet implementation class QuizRegister
 */
@WebServlet("/QuizRegister")
public class QuizRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//아이디값 가져오기
		/**/
		String u_id = (String) session.getAttribute("u_id");
		response.setCharacterEncoding("euc-kr");
		request.setCharacterEncoding("euc-kr");

		String cmd = request.getParameter("cmd");
		request.setAttribute("u_id", u_id);
		
		CommandFactory factory = CommandFactory.newInstance();
		Command command = factory.createCommand(cmd);
		String url = (String) command.processCommand(request, response);
		RequestDispatcher view = request.getRequestDispatcher(url);
		view.forward(request, response);
	}

}
