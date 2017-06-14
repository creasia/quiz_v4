package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.Command;
import dao.quizmodule.GetQuiz;
import dto.Quiz;

public class QuizgetCommand implements Command {

	@Override
	public Object processCommand(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO ��� �������� Ŭ����
		GetQuiz quiz = new GetQuiz();
		Quiz q = quiz.makeQuiz();
		req.setAttribute("quiz", q);
		//System.out.println("�����? +" +q.toString());
		return "/CORDING/Quiz/SinglePlay.jsp";
	}
}
