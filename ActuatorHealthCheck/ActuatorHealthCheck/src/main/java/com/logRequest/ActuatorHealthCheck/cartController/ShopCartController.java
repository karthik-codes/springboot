package com.logRequest.ActuatorHealthCheck.cartController;

import java.io.FileReader;
import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import com.google.gson.Gson;

import com.google.gson.JsonObject;

import com.google.gson.stream.JsonReader;

import com.logRequest.ActuatorHealthCheck.service.CartService;

@RestController
@RequestMapping("/cart")
@Endpoint(id = "my")
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopCartController {

	@Autowired
	CartService cService;

	@ReadOperation
	@Bean
	@GetMapping("/get")
	public ResponseEntity<List<String>> getItems() {
		return cService.getAllItems();
	}

	@GetMapping("/parse")
	public String printToConsole() throws StreamReadException, DatabindException, IOException {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new FileReader(
				"C:\\Users\\karthik.nagaraja\\Downloads\\ActuatorHealthCheck\\ActuatorHealthCheck\\target\\Cart.json"));
		Object js = gson.fromJson(reader, Object.class);

		// System.out.println(jsonObject);

		StringBuilder str = new StringBuilder();
		str.append(js.toString());
		System.out.println(str);

		return ResponseEntity.status(200).body(str).toString();
	}

}
