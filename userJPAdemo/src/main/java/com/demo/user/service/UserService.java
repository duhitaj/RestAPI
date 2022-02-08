package com.demo.user.service;

import org.springframework.stereotype.Service;

import com.demo.user.requestBean.UserRequest;
import com.demo.user.responseBean.UserResponseFields;

@Service
public interface UserService {

	//all the abstract methods are here which will be implemented in impl class 
	
	void getUserById(int userid , UserResponseFields userResponseFields);
	//here for response we are passing userresponsefields object so that by giving user id we can have all the details as response
	
	void addUser(UserRequest userRequest, UserResponseFields userResponseFields);
	// for adding any user using post method first we would need to request the user for all the validation and then adding it to 
	// response field
	
	
}
