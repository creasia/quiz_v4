package dao.quizmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbcp.DBConnectionMgr;
import dto.Quiz;

public class GetQuiz {
	DBConnectionMgr db = null;
	Connection con = null;
	//먼저 db와 연결하기위해 부르고 이 객체를 통해 퀴즈를 생성한다.
	public GetQuiz() {
		try {
			this.db = DBConnectionMgr.getInstance();
			this.con = db.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//퀴즈를 생성하는 메서드
	public Quiz makeQuiz(){
		PreparedStatement pre=null;
		ResultSet rs = null;
		Quiz q = null;
		String sql = "select * from(select * from quiz order by dbms_random.value) where rownum <6";
		try {
			pre = con.prepareStatement(sql);
			rs = pre.executeQuery();
			while(rs.next()){
				q = new Quiz();
				q.setQ_answer(rs.getString("Q_ANSWER"));
				q.setQ_question(rs.getString("Q_QUESTION"));
				q.setQ_wa_a(rs.getString("Q_WA_A"));
				q.setQ_wa_b(rs.getString("Q_WA_B"));
				q.setQ_wa_c(rs.getString("Q_WA_C"));
			}
		} catch (SQLException e) {
			System.out.println("getquiz : "+ e);
		}
		return q;
	}
	
	
}
	
