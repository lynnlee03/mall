package com.lynn.dao.meta;

public class User {	
	private String username;	
	private Integer usertype;	
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String userName) {
		this.username = userName;
	}
	public Integer getUsertype() {
		return usertype;
	}
	public void setUsertype(Integer userType) {
		this.usertype = userType;
	}
}
