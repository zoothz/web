package com.web.model;

import java.sql.Date;

public class CarModel extends AbsModel<CarModel> {
	
	private String name;
	private Date buydate;
	private UserModel buyuser;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBuydate() {
		return buydate;
	}
	public void setBuydate(Date buydate) {
		this.buydate = buydate;
	}
	public UserModel getBuyuser() {
		return buyuser;
	}
	public void setBuyuser(UserModel buyuser) {
		this.buyuser = buyuser;
	}
	
}	
