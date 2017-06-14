package dao.quizmodule;

import java.util.ArrayList;
import java.util.Collections;

import dto.Quiz;

public class CheckQuiz {
	Quiz quiz;
	int combo = 0;
	String answer = null;
	ArrayList<String> quizlist;
	public CheckQuiz() {
		super();
	}
	//��� ���� �޼���
	public void setQuizList(Quiz quiz){
		quizlist = new ArrayList();
		String answer = quiz.getQ_answer();
		quizlist.add(quiz.getQ_answer());
		quizlist.add(quiz.getQ_wa_a());
		quizlist.add(quiz.getQ_wa_b());
		quizlist.add(quiz.getQ_wa_c());
		Collections.shuffle(quizlist);
	}
	
	//���� ��� ��ȯ�Ѵ�.
	public ArrayList getQuizList(){
		return quizlist;
	}
	
	//������ ��� ������ �´��� Ȯ���ϴ� �޼���
	public void setQuizCheck(String select) {
		this.quiz = quiz;
	}

	public void setQuiz(Quiz quiz){
		this.quiz = quiz;
	}
	
	public Quiz getQuiz(){
		return this.quiz;
	}
	
	//�̿��ڰ� ������ ������ ���⸦ String���� �����´�. �׸��� ���⼭ Ȯ��
	public void setAnswer(String answer) {
		this.answer = answer;
		if(quiz.getQ_answer().equals(answer)){
			this.combo++;
		}else{
			this.combo = 0;
		}
	}

	//�޺�ȭ�鿡 �ѷ��� combo�� �����Ѵ�.
	public int getCombo() {
		return combo;
	}
	
	
	
	
}
