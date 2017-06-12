package dao.quizmodule;

import dto.Quiz;

public class CheckQuiz {
	Quiz quiz;
	int combo = 0;
	String answer = null;

	public CheckQuiz() {
		super();
	}

	//보여지는 퀴즈의 정보를 가져온다. 사용자가 선택한 보기보다 먼저 실행되어야한다.
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	//이용자가 선택한 퀴즈의 보기를 String으로 가져온다. 그리고 여기서 확인
	public void setAnswer(String answer) {
		this.answer = answer;
		if(quiz.getQ_answer().equals(answer)){
			this.combo++;
		}else{
			this.combo = 0;
		}
	}

	//콤보화면에 뿌려질 combo를 리턴한다.
	public int getCombo() {
		return combo;
	}
	
	
	
	
}
