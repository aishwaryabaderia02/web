package com.tienda.bean;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="user")                                                          //JAXB == JAVA API for XML Binding
public class User {
	private int userId;
	private String userName, email;
	private Set<Link> links;
	
	
	public Set<Link> getLinks() {
		return links;
	}

	public void setLinks(Set<Link> links) {
		this.links = links;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
