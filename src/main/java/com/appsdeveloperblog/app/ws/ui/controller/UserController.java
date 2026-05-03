package com.appsdeveloperblog.app.ws.ui.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping(path="/{userId}")
	public String getUser(@PathVariable String userId)
	{
		return "get user was called with userId:"+userId;
	}
	
	@GetMapping
	public String getUser(@RequestParam(value="page")int page, @RequestParam(value="limit") int limit)
	{
		return "get user was called with page:"+page+"and limit:"+ limit;
	}
	@PostMapping
	public String CreateUser()
	{
		return "create user was called";	
	}
	@PutMapping
	public String UpdateUser()
	{
		return "Update user was called";			
	}
	@DeleteMapping
	public String DeleteUser()
	{
		return "Delete user was called now 	";
				
	} 	
}
