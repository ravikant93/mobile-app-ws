package com.appsdeveloperblog.app.ws.ui.model.response;

public class UserRest {
 private String firstname;
 private String lastname;
 private String email;
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
