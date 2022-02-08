package com.demo.user.data;

import org.springframework.stereotype.Service;

import com.demo.user.requestBean.UserRequest;
import com.demo.user.responseBean.UserResponseFields;

@Service 

public interface UserDataTransformation {

	void UserDataRequestTransform(UserRequest userRequest , UserResponseFields userResponseFields);
	void getUserDetailsById(Integer userid , UserResponseFields userResponseFields);
	
	
}
