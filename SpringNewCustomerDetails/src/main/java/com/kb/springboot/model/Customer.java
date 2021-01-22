package com.kb.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name ="Name")
	private String name;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Email")
	private String email;
	@Column(name = "MobileNo")
	private String mobile;
	@Column(name = "Address1")
	private String address;
	@Column(name = "Address2")
	private String addressline;
	@Column(name = "City")
	private String city;
	@Column(name = "State")
	private String state;
	@Column(name = "Country")
	private String country;
	@Column(name = "ZipCode")
	private String code;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Customer() {
		
	}
	public Customer(int id, String name, String gender, String email, String mobile, String address,
			String addressline, String city, String state, String country, String code) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.addressline = addressline;
		this.city = city;
		this.state = state;
		this.country = country;
		this.code = code;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", mobile="
				+ mobile + ", address=" + address + ", addressline=" + addressline + ", city=" + city + ", state="
				+ state + ", country=" + country + ", code=" + code + "]";
	}
	

	
	
	
	
	
	
	
	
	
	

}
