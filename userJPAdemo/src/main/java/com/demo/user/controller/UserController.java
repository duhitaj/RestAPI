package com.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.user.responseBean.UserResponse;
import com.demo.user.responseBean.UserResponseFields;
import com.demo.user.service.UserService;

@RestController
@CrossOrigin(origins="*",allowedHeaders ="*")
@RequestMapping(value="/v1/user")


public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(value="/userid/{userid}",produces = "application/json")
	UserResponse getuserById(@PathVariable("userid") int userid) {
		
		UserResponse userResponse = new UserResponse();
		//creating userresponse object for getting and setting the json object response
		UserResponseFields userResponseFields = new UserResponseFields();
		//creating userresponsefields object to get and set the json properties 
		
		userResponse.setResponse(userResponseFields);
		userService.getUserById(userid, userResponseFields);

		return userResponse;
	}
	
	
}
