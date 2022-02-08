package com.demo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.user.model.UserT;

public interface UserTRepo extends JpaRepository<UserT,Integer>{
	//here in generics we have passed the class name in which all the columns are made and Integer is used tp represent the data type 
	//of the primary key which is userid
	
	@Query("from usersignin WHERE userid=?1 and status=1")
	//here ?1 means that the query will put the value of first variable where ?1 is placed
	//and status means that the record is there and not deleted
	public UserT findUserById(Integer userid);

	
}
