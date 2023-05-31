package com.example.multithreadingEmployee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Employee")
public class EmployeeController {

	@GetMapping("name/{id}")
	public String getEmployeeName(@PathVariable ("id") String id) throws InterruptedException {
		Thread.sleep(3000);
		if(id.equalsIgnoreCase("USER_1")) {
			return "Sumit";
		}
		throw new RuntimeException();
	}
}
