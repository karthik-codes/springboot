package com.example.Login.JSP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Login.JSP.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	 User findByName(String username);

}
