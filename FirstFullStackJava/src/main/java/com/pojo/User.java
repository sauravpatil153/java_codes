package com.pojo;

import java.time.LocalDate;
import java.util.Date;

public class User {
	//| id | name    | email          | password | reg_amt | reg_date   | role
	
	private int id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private double regAmt;
	
	private Date regDate;
	
	private String role;

	public User(int id, String name, String email, String password, double regAmt, Date regDate, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmt = regAmt;
		this.regDate = regDate;
		this.role = role;
	}

	public User(String name, String email, String password, double regAmt, Date regDate, String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmt = regAmt;
		this.regDate = regDate;
		this.role = role;
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegAmt() {
		return regAmt;
	}

	public void setRegAmt(double regAmt) {
		this.regAmt = regAmt;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
