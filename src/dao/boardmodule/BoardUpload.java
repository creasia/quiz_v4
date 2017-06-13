package dao.boardmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
import dbcp.DBConnectionMgr;

public class BoardUpload {
	 private Connection con;
	 private PreparedStatement pstmt;
	 private ResultSet rs;
	 private dbcp.DBConnectionMgr pool;
	
	private BoardUpload(){
		try{
	         pool = dbcp.DBConnectionMgr.getInstance();
	         con = pool.getConnection();
	      }
	      catch(Exception err){
	         System.out.println("DBCP 인스턴스 참조 실패: " + err);
	      }
	}
	
	
	//BoardWrite_proc.jsp 글쓰기 기능
	public void insertBoard(Board board){
		String sql = "insert into board(b_num, b_title, u_id, b_content, b_regdate, b_count)"
				+ "values('B'||LPAD((seq_b_num.NEXTVAL),4,'0'),?,?,?,sysdate,0)";
		try{
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getB_title());
			pstmt.setString(2, board.getU_id());
			pstmt.setString(3, board.getB_content());
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
