package com.yash.controller;

public class User {
	int userid;
	String fname;
	String lname;
	String email;
	String password;
	String gender;
	String dob;
	String dateofRegstration;
	String sec_question;
	String sec_answer;
	public User() {
		super();
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDateofRegstration() {
		return dateofRegstration;
	}
	public void setDateofRegstration(String dateofRegstration) {
		this.dateofRegstration = dateofRegstration;
	}
	public String getSec_question() {
		return sec_question;
	}
	public void setSec_question(String sec_question) {
		this.sec_question = sec_question;
	}
	public String getSec_answer() {
		return sec_answer;
	}
	public void setSec_answer(String sec_answer) {
		this.sec_answer = sec_answer;
	}
}
