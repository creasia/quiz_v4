package dao.boardmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;

public class BoardUpload {
	 private Connection con;
	 private PreparedStatement pstmt;
	 private ResultSet rs;
	 private dbcp.DBConnectionMgr pool;
	
	private BoardUpload(){}
	
	private static BoardUpload instance = new BoardUpload();
	
	public static BoardUpload getInstance(){
		return instance;
	}
	
	//postProc.jsp 글쓰기 기능
	public void insertBoard(Board board){
		String sql = "insert into board(b_num, b_title, b_content, b_regdate, b_count)"
				+ "values('B'||LPAD((seq_b_num.NEXTVAL),4,'0'),?,?,sysdate,0)";
		try{
			con = pool.getConnection();
			pstmt = con.prepareStatement(sql);
				
			//작성자???? id? nickname?
			pstmt.setString(1, board.getB_title());
			pstmt.setString(2, board.getB_content());
			pstmt.executeUpdate();
		}
		catch(Exception err){
			System.out.println("insertBoard()에서 오류 :"+err);
			err.printStackTrace();
		}
		finally{
			pool.freeConnection(con, pstmt);
		}	
	}
}
