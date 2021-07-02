package com.starts.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Trainee {
	@Id

	private int traineeId;
	@NotNull
	@Size(min = 4, max = 50, message = "length Should be in between 4-50 ")
	private String traineeFirstName;
	@NotNull
	@Size(min = 4, max = 50, message = "length Should be in between 4-50 ")
	private String traineeLasttName;
	@Pattern(regexp = "^[789]{1}[0-9]{9}", message = "Mobile number should be 10 digits and starting with 7/8/9")
	private String traineePhoneNo;
	@Pattern(regexp = "^(?=.{6,}$)(?=.\\W).$", message = "Should have atleast 1 special character and be minimum of 6 characters")
	private String password;
	private String dob;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeFirstName() {
		return traineeFirstName;
	}

	public void setTraineeFirstName(String traineeFirstName) {
		this.traineeFirstName = traineeFirstName;
	}

	public String getTraineeLasttName() {
		return traineeLasttName;
	}

	public void setTraineeLasttName(String traineeLasttName) {
		this.traineeLasttName = traineeLasttName;
	}

	public String getTraineePhoneNo() {
		return traineePhoneNo;
	}

	public void setTraineePhoneNo(String traineePhoneNo) {
		this.traineePhoneNo = traineePhoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeFirstName=" + traineeFirstName + ", traineeLasttName="
				+ traineeLasttName + ", traineePhoneNo=" + traineePhoneNo + ", password=" + password + ", dob=" + dob
				+ "]";
	}

}
