package com.appsdeveloperblog.app.ws.ui.model.resquest;

import jakarta.validation.constraints.*;


public class updateUserDetailsModel {
	@NotBlank(message="firstname cannot be empty")
	private String firstname;
	@NotBlank(message="lastname cannot be empty")
	private String lastname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
