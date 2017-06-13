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
	
	public String searchId(String name, String email){
		String id="";
		sql = "select u_id from userinfo where u_name = '"+name+"' and u_email='"+email+"'";
		try{
			int i=0;
			con = pool.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
				
			while(rs.next()){
				id = rs.getString("u_id");				
			}
		}
		catch(Exception err){
			System.out.println("searchId 에서 오류 : "+err);
		}
		finally{
			pool.freeConnection(con,pstmt, rs);
		}
		return id;
	}
	
	public String searchPw(String id, String email, String U_QUESTION, String U_ANSWER){
		String pw="";
		sql = "select u_pw from userinfo where u_id = '"+id+"' and u_email='"+email+"' and "+
		"u_question = '"+U_QUESTION+"' and u_answer='"+U_ANSWER+"'";
		try{
			int i=0;
			con = pool.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
				
			while(rs.next()){
				pw = rs.getString("u_pw");				
			}
		}
		catch(Exception err){
			System.out.println("searchPw 에서 오류 : "+err);
		}
		finally{
			pool.freeConnection(con,pstmt, rs);
		}
		return pw;
	}
}
