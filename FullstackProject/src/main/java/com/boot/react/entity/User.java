package com.boot.react.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="register")
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO) 
	private int id;
	@Column(name = "full_name")
	private String FullName;
	@Column(name = "user_name")
	private String UserName;
	@Column(name = "email_address")
	private String EmailAddress;
	@Column(name = "password")
	private String Password;
	@Column(name = "address")
	private String Address;
	@Column(name = "phone_no")
	private String PhoneNo;
//	private String role;
	
	
//	public String getRole() {
//		return role;
//	}
//	public void setRole(String role) {
//		this.role = role;
//	}
//	public User(String role) {
//		super();
//		this.role = role;
//	}
	public User(int id, String fullName, String userName, String emailAddress, String password, String address,
			String phoneNo) {
		super();
		this.id = id;
		FullName = fullName;
		UserName = userName;
		EmailAddress = emailAddress;
		Password = password;
		Address = address;
		PhoneNo = phoneNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public User() {
		
	}
	
	
	}


