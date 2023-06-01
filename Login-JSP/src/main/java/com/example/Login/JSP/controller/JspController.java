package com.example.Login.JSP.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Login.JSP.model.User;
import com.example.Login.JSP.repository.UserRepo;

@Controller
public class JspController {

	@Autowired
	private UserRepo uRepo;

	@RequestMapping("/")
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping("/login")
	public String getHomePage(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {

		User u = null;
		try {
			u = uRepo.findByName(username);

		} catch (Exception e) {
			System.out.println("user not found !! " + e);
			return "login";
		}
		if (!(u == null)) {
			model.addAttribute("Username", username);
			return "homePage";
		}
		model.addAttribute("error","user not found");
		return "login";
	}
	
	@PutMapping("/add")
	public ResponseEntity<List<User>> addUserToDatabase(){
		List<User>users=new ArrayList<>();
		
		User user1=new User(1,"karthik","1234");
		User user2=new User(2,"keerthan","3456");
		User user3=new User(3,"kiran","567");
		User user4=new User(4,"keerthi","878");
		User user5=new User(5,"kinna","890");
		User user6=new User(6,"kridhna","343");
		User user7=new User(7,"kamal","6767");
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		users.add(user7);
		
		uRepo.saveAll(users);
		return ResponseEntity.status(201).body(users);
	}
}
