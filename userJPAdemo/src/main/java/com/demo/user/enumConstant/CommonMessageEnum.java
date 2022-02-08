package com.demo.user.enumConstant;

public enum CommonMessageEnum {

	RECORD_INSERT_SUCCESS("user data inserted successfully"),
	RECORD_INSERT_ERROR("error inserting data"),
	DATA_FETCHED_SUCCESSFULLY("data fetched successfully"),
	DATA_FETCHED_ERROR("error fetching data");
	
	String value;
	
    CommonMessageEnum(String value){
    	this.value = value;
    }
    public String getValue() {
    	return value;
    }
	
}
