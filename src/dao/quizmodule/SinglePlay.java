package dao.quizmodule;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.Command;
import controller.CommandFactory;
import dto.Quiz;

@WebServlet(urlPatterns = "/quiz")
public class SinglePlay extends HttpServlet {
	Quiz q;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		String cmd = req.getParameter("cmd");
		CommandFactory factory = CommandFactory.newInstance();
		Command command = factory.createCommand(cmd);
	
		String url = (String) command.processCommand(req, resp);
		Quiz q = (Quiz) req.getAttribute("quiz");
		
		req.setAttribute("quiz", q);
		RequestDispatcher dis = req.getRequestDispatcher(url);
		dis.forward(req, resp);
	}

}
