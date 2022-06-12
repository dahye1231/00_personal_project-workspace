package com.dh.vo.model;

import java.sql.Date;

public class Member {

	private int userNo;
	
	private String userId;
	private String userPwd;
	private String userName;
	private String pNo;
	private String phone;
	private String address;
	private String userMode;
	
	private Date enrollDate;
	
	
	public Member() {}


	public Member(int userNo, String userId, String userPwd, String userName, String pNo, String phone, String address,
			String userMode, Date enrollDate) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.pNo = pNo;
		this.phone = phone;
		this.address = address;
		this.userMode = userMode;
		this.enrollDate = enrollDate;
	}


	public int getUserNo() {
		return userNo;
	}


	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getpNo() {
		return pNo;
	}


	public void setpNo(String pNo) {
		this.pNo = pNo;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUserMode() {
		return userMode;
	}


	public void setUserMode(String userMode) {
		this.userMode = userMode;
	}


	public Date getEnrollDate() {
		return enrollDate;
	}


	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}


	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", pNo=" + pNo + ", phone=" + phone + ", address=" + address + ", userMode=" + userMode
				+ ", enrollDate=" + enrollDate + "]";
	}


	
	
	
	
	
}
