package com.backend.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	private String userEmail;
	private String userName;
	private String userPassword;
	private String userPhone;
	private String gender;
	private Address address;
	public User() {
		super();
	}
	public User(String userEmail, String userName, String userPassword, String userPhone, String gender,
			Address address) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.gender = gender;
		this.address = address;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userPhone=" + userPhone + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
}
