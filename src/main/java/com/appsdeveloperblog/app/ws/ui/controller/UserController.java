package com.appsdeveloperblog.app.ws.ui.controller;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import com.appsdeveloperblog.app.ws.ui.model.resquest.userDetailsRequestModel;


@RestController
@RequestMapping("/users")
public class UserController {
	/*
	  @GetMapping(path="/{userId}", 
	  produces= {MediaType.APPLICATION_XML_VALUE,
	  			MediaType.APPLICATION_JSON_VALUE}) 
	  public UserRest getUser(@PathVariable String userId) 
	  {
		  UserRest returnValue=new UserRest();
		  returnValue.setFirstname("ravi"); 
		  returnValue.setLastname("kant");
		  returnValue.setFirstname("test@gmail.com"); 
		  return returnValue;
	  }
	  */
	@GetMapping(path="/{userId}", produces= {MediaType.APPLICATION_XML_VALUE,
			  MediaType.APPLICATION_JSON_VALUE}) 
				public ResponseEntity<UserRest> getUser(@PathVariable String userId) //responseEntity is used for setting the status code
			  {
				  UserRest returnValue=new UserRest();
				  returnValue.setFirstname("ravi"); 
				  returnValue.setLastname("kant");
				  returnValue.setEmail("test@gmail.com");
				  returnValue.setUserId(userId);
				  
				  return new ResponseEntity<UserRest>(returnValue, HttpStatus.ACCEPTED);// response Entity is setting the status code(here 202) in the return value.
				  
			  }
	
	@GetMapping
	public String getUser(@RequestParam(value="page", defaultValue="10")int page, 
			@RequestParam(value="limit",defaultValue="25") int limit,
			@RequestParam(value="sort",defaultValue="desc",required=false)String sort)
	{
		return "get user was called with page: "+page+"and limit: "+ limit;
	}
	

	@PostMapping(consumes= {MediaType.APPLICATION_XML_VALUE,
			  				MediaType.APPLICATION_JSON_VALUE},
					produces= {	MediaType.APPLICATION_XML_VALUE,
								MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity <UserRest> createUser(@RequestBody userDetailsRequestModel userDetails)
	{
		 UserRest returnValue=new UserRest();
		  returnValue.setFirstname(userDetails.getFirstname()); 
		  returnValue.setLastname(userDetails.getLastname());
		  returnValue.setEmail(userDetails.getEmail());
		  returnValue.setPassword(userDetails.getPassword());
		 // returnValue.setUserId(userDetails.getUserId());
		 // retur
		  
		  return new ResponseEntity<UserRest>(returnValue, HttpStatus.CREATED);	
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
