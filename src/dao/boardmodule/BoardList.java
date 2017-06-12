package dao.boardmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbcp.DBConnectionMgr;
import dto.Board;

public class BoardList {
	 private Connection con;
	 private PreparedStatement pstmt;
	 private ResultSet rs;
	 private dbcp.DBConnectionMgr pool;
	
	private BoardList(){}
	
	private static BoardList instance = new BoardList();
	
	public static BoardList getInstance(){
		return instance;
	}
	
	//BoardList.jsp - 게시판 글 리스트 가져오기
	public List<Board> getBoardList(String keyword, String keyfield){
		ArrayList list = new ArrayList<Board>();
		String sql = "";
		
		//검색기능
		if(keyword!=null){
			sql = "select * from board where " + keyfield + " like '%" + keyword + "%' order by b_num";
		}
		else{
			sql = "select * from board order by b_num";
		}
		
		try{
			con = pool.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Board board = new Board();
				board.setB_num(rs.getInt("b_num"));
				board.setU_id(rs.getString("u_id"));
				board.setU_nickname(rs.getString("u_nickname"));
				board.setB_title(rs.getString("b_title"));
				board.setB_content(rs.getString("b_content"));
				board.setB_regdate(rs.getTimestamp("b_regdate"));
				board.setB_count(rs.getInt("b_count"));
				board.setB_reply(rs.getString("b_reply"));
				
				list.add(board);
			}
		}
		catch(Exception err){
			System.out.println("getBoardList()에서 오류: "+err);
			err.printStackTrace();
		}
		finally{
			if(pool!=null){
				pool.freeConnection(con, pstmt, rs);
			}
		}
		return list;
	}
}
