package com.demo.user.requestBean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor             //for automatically having a default constructor
@Getter                        //for all the getters to initialize
@Setter                        //for all the setter to set values

public class UserRequestFields {

	
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotBlank(message="name must be mentioned")
	//for the field to not be blanked message will appear
	
	@JsonProperty("fname")
	//for the json to identify the field
	
	private String fname;
	
	@Email(message = "email must be valid")
	@JsonProperty("email")
	private String email;
	
	
}
