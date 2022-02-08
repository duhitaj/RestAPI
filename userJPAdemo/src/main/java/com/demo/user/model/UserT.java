package com.demo.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



//entity here shows using which databse we are creating tables and accessing them
@NoArgsConstructor
@Setter
@Getter
@Entity(name ="usersignin")
public class UserT {
	
	
	

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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	
	@Id              //here id shows that the userid is the primary key in the table
	
	@SequenceGenerator(name="userid_sequence",sequenceName="userid_sequence",allocationSize=1)
	//here sequence genrator is used to define the sequence , accepts a name and give allocation size
	
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="userid_sequence")
	//generated value here is used to show how the primary key should be generated
	@Column(name = "userid") //for creating the userid column
	private int userid;
	
	@Column(name = "fname" , length=50)  //second column name fname
	private String fname;
	
	@Column(name ="email" , length=100)
	private String email;
	
	@Column(name="status",nullable = false) // here status is used to show the status of the query wheater ran or not
	private int status;
	
}
