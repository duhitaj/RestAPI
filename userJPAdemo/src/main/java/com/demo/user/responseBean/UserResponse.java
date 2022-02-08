package com.demo.user.responseBean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {

	@JsonProperty("response")
	Object response;
	
	public Object getResponse() {
		return response;
	}
	
	
	
	
	//in this class we are simply setting and getting the response
	public void setResponse(UserResponseFields response) {
		this.response = response;
	}
	
	
}
