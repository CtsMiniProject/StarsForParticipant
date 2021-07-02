package com.starts.Model;

import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

@Component
public class Users {

	private int userId;
	@Pattern(regexp = "^(?=.{6,}$)(?=.\\W).$", message = "Should have atleast 1 special character and be minimum of 6 characters")
	private String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", password=" + password + "]";
	}

}
