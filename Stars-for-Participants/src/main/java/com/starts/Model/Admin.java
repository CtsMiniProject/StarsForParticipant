package com.starts.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity
public class Admin {
	@Id
	private int adminId;
	@Pattern(regexp = "^(?=.{6,}$)(?=.\\W).$", message = "Should have atleast 1 special character and be minimum of 6 characters")
	private String password;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + "]";
	}

}
