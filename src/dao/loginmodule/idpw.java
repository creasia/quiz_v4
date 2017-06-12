package dao.loginmodule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbcp.DBConnectionMgr;
import dto.u_battle;
import dto.u_single;

public class idpw {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DBConnectionMgr pool;
	private String sql = "";
	
	public idpw(){
		try{
			pool = DBConnectionMgr.getInstance();
		}
		catch(Exception err){
			System.out.println("DBCP 인스턴스 참조 실패 : "+err);
		}
	}
	
	//List.jsp
	public String[] getBoardList(){
		String [] u_find = new String [20];
		String [] arr = null;
		sql = "select * from u_find";
		try{
			int i=0;
			con = pool.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
				
			while(rs.next()){
				u_find[i] = rs.getString("u_question");
				i++;
			}
			arr = new String [i];
			for(int a=0;a < i ; a++){
				arr[a] = u_find[a];
			}
		}
		catch(Exception err){
			System.out.println("getBoardList() 에서 오류 : "+err);
		}
		finally{
			pool.freeConnection(con,pstmt, rs);
		}
		return arr;
	}
	
}
