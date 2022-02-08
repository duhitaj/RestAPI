package com.demo.user.data.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.user.data.UserDataTransformation;
import com.demo.user.model.UserT;
import com.demo.user.repository.UserTRepo;
import com.demo.user.requestBean.UserRequest;
import com.demo.user.requestBean.UserRequestFields;
import com.demo.user.responseBean.UserResponseFields;


@Service
public class UserDataTransformationImpl implements UserDataTransformation{

	@Autowired
	UserTRepo userTRepo;//injecting usertrepo object
	
	
	
	@Override
	public void UserDataRequestTransform(UserRequest userRequest, UserResponseFields userResponseFields) {
		// TODO Auto-generated method stub
		
		
		UserT userT = new UserT();
		//here we are creating object of usert so that everytime a new request come it can create a new user
		
		UserRequestFields userRequestFields = userRequest.getUserRequestFields();
		// by first validating all the entered fields if correct or not 
		createUserT(userRequestFields,userT);
		
		
	}
	
private void createUserT(UserRequestFields userRequestFields,UserT userT) {
		
		
		try {
		//in this try block we will create new user by first validating them then sending them to set the values in the object
			
		
			userT.setFname(userRequestFields.getFname());
			userT.setEmail(userRequestFields.getEmail());
			userT.setStatus(1);
			
			userT = userTRepo.save(userT);
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	

	@Override
	public void getUserDetailsById(Integer userid, UserResponseFields userResponseFields) {
		// TODO Auto-generated method stub
		
		try {
			
			UserT userT = userTRepo.findUserById(userid);
			
			userResponseFields.setFname(userT.getFname());
	        userResponseFields.setEmail(userT.getEmail());
			userResponseFields.setCode(200);
			userResponseFields.setStatus("success");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
