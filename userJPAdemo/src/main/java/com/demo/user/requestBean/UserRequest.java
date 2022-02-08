package com.demo.user.requestBean;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {

	@NotNull (message="Sorry bad request")
	@JsonProperty("request")
	@Valid
	UserRequestFields userRequestFields;//to validate the field if correct or not
	
	boolean validate;
	
	public boolean isValidate() {
		return validate;
		
		// returning if validate or not
	}
	
	public void setValidate(boolean validate) {
		this.validate = validate;
		//setting the validation if true or false
	}
	
	public UserRequestFields getUserRequestFields() {
		return userRequestFields;
		// returning all the request fields 
		
		
	}
	
	public void setUserRequestFields(UserRequestFields userRequestFields) {
		this.userRequestFields = userRequestFields;
		//setting the values to request fields
	}
	
	
	
}
