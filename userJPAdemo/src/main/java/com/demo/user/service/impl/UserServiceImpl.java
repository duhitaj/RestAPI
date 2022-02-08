package com.demo.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.user.data.UserDataTransformation;
import com.demo.user.enumConstant.CommonMessageEnum;
import com.demo.user.requestBean.UserRequest;
import com.demo.user.responseBean.UserResponseFields;
import com.demo.user.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	
	//before this class transforming of data is necessary 
		@Autowired
		UserDataTransformation userDataTransform;

	@Override
	public void getUserById(int userid, UserResponseFields userResponseFields) {
		
		
		//here we are using datatransformation object and getting the method with userid and responsefields  and setting the response
				try {
					
					userResponseFields.setCode(200);
					userResponseFields.setStatus("success");
					userResponseFields.getFname();
					userResponseFields.getEmail();
					
				}
				catch(Exception e) {
					userResponseFields.setCode(500);
					userResponseFields.setStatus("failed");
					userResponseFields.setMessage(CommonMessageEnum.DATA_FETCHED_ERROR.getValue());
				}
				
		
		
		
	}

	@Override
	public void addUser(UserRequest userRequest, UserResponseFields userResponseFields) {
		// TODO Auto-generated method stub
		
		
		try {
			
			userDataTransform.UserDataRequestTransform(userRequest, userResponseFields);
			userResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_SUCCESS.getValue());;
			userResponseFields.setCode(200);
			userResponseFields.setStatus("success");
			
			}
			catch(Exception e) {
			
				userResponseFields.setCode(500);
				userResponseFields.setStatus("success");
				userResponseFields.setMessage(CommonMessageEnum.RECORD_INSERT_ERROR.getValue());
			}
		
		
	}

}
