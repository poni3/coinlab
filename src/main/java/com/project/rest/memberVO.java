package com.project.rest;

import java.util.Date;

public class memberVO {
	
	private int uid;
	private String name;
	private String user_id;
	private Date  created_date;
	private Date  modified_date;
	private String  email;
	private String  nickname;
	private String   password;
	private int       bad_password_count;
	private Date     password_change_date;
	private String  status;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getModified_date() {
		return modified_date;
	}
	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBad_password_count() {
		return bad_password_count;
	}
	public void setBad_password_count(int bad_password_count) {
		this.bad_password_count = bad_password_count;
	}
	public Date getPassword_change_date() {
		return password_change_date;
	}
	public void setPassword_change_date(Date password_change_date) {
		this.password_change_date = password_change_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
