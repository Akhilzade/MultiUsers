package com.pojo;

public class Register {

	private String name;
	private String username;
	private String email;
	private String password;
	private String status;

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Register(String name, String username, String email, String password, String status) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
