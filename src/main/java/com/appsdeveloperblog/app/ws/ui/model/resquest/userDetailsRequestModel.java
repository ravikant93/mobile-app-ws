package com.appsdeveloperblog.app.ws.ui.model.resquest;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class userDetailsRequestModel {
	@NotBlank(message="firsttname cannot be blank")// NotBlank is better than notnull constarint c
	private String firstname;
	@NotNull(message="lasttname cannot be null")
	private String lastname;
	@NotBlank(message="email cannot be blank")
	@Email
	private String email;
	@NotNull(message="password cannot be blank")
	@Size(min=8,max=16,message="Userid must be more than 8 and less than 16")
	private String password;
	
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
