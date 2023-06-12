package com.dockerdemo.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockerdemo.entity.Item;

@RestController
public class ItemController {

	@GetMapping("/docker")
	public ResponseEntity<List<Item>> getItemInfo() {
		List<Item> lists = new ArrayList<>();
		lists.add(new Item(1, "realme", 10000));
		lists.add(new Item(2, "samsung", 15000));
		lists.add(new Item(3, "nokia", 13000));
		lists.add(new Item(4, "realme", 9000));
		lists.add(new Item(5, "apple", 167000));
		lists.add(new Item(6, "lg", 1000));
		lists.add(new Item(7, "realme", 10000));

		Map<String, Long> maps = lists.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		System.out.println(maps);

		List<Item> i = lists.stream().sorted(Comparator.comparing(Item::getPrice)).collect(Collectors.toList());
		return ResponseEntity.status(HttpStatus.OK).body(i);
	}

	@GetMapping("/greet")
	public String sayHello() {
		return "Hello world";
	}
}
