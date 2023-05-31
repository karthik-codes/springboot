package com.example.MultithreadingSalary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salary")
public class SalaryController {

	@GetMapping("/{id}")
	public String getEmployeeSalary(@PathVariable ("id") String id) throws InterruptedException {
		Thread.sleep(3000);
		if(id.equals("USER_1")) {
				return "70000";
		}
		throw new RuntimeException();
	}
}
