package com.wellnwill.jm2009.learn.model;

import java.util.Arrays;

public class User {

	private String email;

	private String street1;

	private String street2;

	private String city;

	private String state;

	private String zip;

	private String[] courses;

	private String gender;
	
	private String typeOfUser;

	public String getTypeOfUser() {
		return typeOfUser;
	}

	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", courses=" + Arrays.toString(courses) + ", gender=" + gender
				+ ", typeOfUser=" + typeOfUser + "]";
	}

	
}
