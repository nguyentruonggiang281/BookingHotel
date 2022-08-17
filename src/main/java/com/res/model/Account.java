package com.res.model;

public class Account {

	private int id;
	
	private String phone;
	
	private String password;
	
	private String address;
	
	private String role;

	public Account() {
		
	}

	public Account(String phone, String password, String address, String role) {
		this.phone = phone;
		this.password = password;
		this.address = address;
		this.role = role;
	}

	public Account(int id, String phone, String password, String address, String role) {
		this.id = id;
		this.phone = phone;
		this.password = password;
		this.address = address;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", phone=" + phone + ", password=" + password + ", address=" + address + ", role="
				+ role + "]";
	}

	
}
