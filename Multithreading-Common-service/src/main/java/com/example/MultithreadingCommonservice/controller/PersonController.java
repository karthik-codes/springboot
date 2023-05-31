package com.example.MultithreadingCommonservice.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.MultithreadingCommonservice.Entity.Person;

/* common service to fetch data using restTemplate
 * 3 services running at a time.
 * 
 */
@RestController
@RequestMapping("/user-details")
public class PersonController {

	@Autowired
	RestTemplate template;
	
	@Value("${name.url}")
	private String nameUrl;
	
	@Value("${salary.url}")
	private String salaryUrl;

	@GetMapping("/{id}")
	public ResponseEntity<Person> getUserDetails(@PathVariable("id") String id) {

		StopWatch st = new StopWatch();
		Person p = new Person();
		st.start();
//		ResponseEntity<String> name = template.exchange("http://localhost:8080/Employee/name/"+id,HttpMethod.GET,
//				null, String.class);
//		ResponseEntity<String> salary = template.exchange("http://localhost:8081/salary/"+id,HttpMethod.GET,
//				null, String.class);
//		
//		p.setName(name.getBody());
//		p.setSalary(salary.getBody());
		
		//efficient way is CompletableFuture class.

		CompletableFuture.allOf(
				CompletableFuture.supplyAsync(() -> template.exchange(nameUrl+ id,
						HttpMethod.GET, null, String.class)).thenAccept(x -> p.setName(x.getBody())))
				.join();

		CompletableFuture.allOf(CompletableFuture.supplyAsync(
				() -> template.exchange(salaryUrl+ id, HttpMethod.GET, null, String.class))
				.thenAccept(x -> p.setSalary(x.getBody()))).join();

		st.stop();
		System.out.println("Total time taken ===========: " + st.getTotalTimeMillis());
		return ResponseEntity.status(200).body(p);
	}
}
