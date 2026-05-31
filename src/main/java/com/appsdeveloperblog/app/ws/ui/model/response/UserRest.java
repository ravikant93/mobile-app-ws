package com.appsdeveloperblog.app.ws.ui.model.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRest {
	//@NotNull(message="firstname cannot be null")
 private String firstname;
	//@NotNull(message="lasttname cannot be null")
 private String lastname;
	//(message="Email cannot be null")
	//@Email
 private String email;
	//
 private String userId;
 private String Password;
 
 public String getPassword() {
	return Password;
}
 public void setPassword(String password) {
	Password = password;
 }
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
 public String getUserId() {
	return userId;
 }
 public void setUserId(String userId) {
	this.userId = userId;
 }
}
