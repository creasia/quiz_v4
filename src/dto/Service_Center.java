package dto;

import java.sql.Timestamp;

public class Service_Center {
	private int sc_num;
	private String u_id;
	private String sc_type;
	private String sc_title;
	private String sc_content;
	private Timestamp sc_regdate;
	//¿ÃπÃ¡ˆ
	private String sc_date;
	
	public int getSc_num() {
		return sc_num;
	}
	public void setSc_num(int sc_num) {
		this.sc_num = sc_num;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getSc_type() {
		return sc_type;
	}
	public void setSc_type(String sc_type) {
		this.sc_type = sc_type;
	}
	public String getSc_title() {
		return sc_title;
	}
	public void setSc_title(String sc_title) {
		this.sc_title = sc_title;
	}
	public String getSc_content() {
		return sc_content;
	}
	public void setSc_content(String sc_content) {
		this.sc_content = sc_content;
	}
	public Timestamp getSc_regdate() {
		return sc_regdate;
	}
	public void setSc_regdate(Timestamp sc_regdate) {
		this.sc_regdate = sc_regdate;
	}
	public String getSc_date() {
		return sc_date;
	}
	public void setSc_date(String sc_date) {
		this.sc_date = sc_date;
	}
}
