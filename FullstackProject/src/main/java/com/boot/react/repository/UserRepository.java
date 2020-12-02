package com.boot.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.react.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//	@Query("SELECT u FROM User u WHERE u.userame=:usnername")
//	public User getUserByUserName(@Param("username")String username);

	
   
	
}
