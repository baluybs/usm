package com.oehm3.ums.dto;
import java.io.Serializable;

public class LoginDTO implements Serializable{
	private String email;
	private String password;
	
	public LoginDTO() {
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

}
