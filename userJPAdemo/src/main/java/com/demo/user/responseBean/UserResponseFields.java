package com.demo.user.responseBean;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserResponseFields {

	// this class is made for all the fields that will participate in response functionality
	
	
	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	@JsonProperty("code")
	private int code;
	//for showing status code
	

	@JsonProperty("status")
	private String status;
	//for status value true or false
	
	@JsonProperty("userid")
	private int userid;
	
	@JsonProperty("fname")
	private String fname;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("message")
	private String message;
	
	
	
	
}
