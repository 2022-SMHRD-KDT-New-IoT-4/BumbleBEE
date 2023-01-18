package com.smhrd.model;

public class MessageDTO {
	private String email;
	private String pw;
	private String phone;
	private String address;
	public MessageDTO(String email, String pw, String phone, String address) {
		super();
		this.email = email;
		this.pw = pw;
		this.phone = phone;
		this.address = address;
	}
	public MessageDTO() {
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	public void setaddress(String address) {
		this.address = address;
	}
	
	
	
	
}
