package com.example.beans;

public class UserInfoRes {

	
	private String userNm;
	private String firstName;
	private String lastName;
	private String mobileNo;
	private Long empId;
	private Boolean isUserExist;
	private String message;
	
	
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Boolean getIsUserExist() {
		return isUserExist;
	}
	public void setIsUserExist(Boolean isUserExist) {
		this.isUserExist = isUserExist;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserInfoRes(String userNm, String firstName, String lastName, String mobileNo, Long empId
			) {
		super();
		this.userNm = userNm;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.empId = empId;
		
	}
	public UserInfoRes() {
		super();
	}
	
	
	
}
