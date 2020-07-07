package com.project.v2vcouriers.V2VCouriors.entity;

import java.sql.Date;

public class User {
	private int id;
	private String name;
	private String user_type;
	private String location;
	private Date birthDate;
	private String email;
	
	public User()
	{
		
	}
	public User(int id, String name, String user_type, String location, Date birthDate, String email) {
		super();
		this.id = id;
		this.name = name;
		this.user_type = user_type;
		this.location = location;
		this.birthDate = birthDate;
		this.email = email;
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
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("\nPerson [id=%s, name=%s, user_type==%s, location=%s, birthDate=%s, email=%s]", id, name, user_type, location, birthDate, email);
	}
}
