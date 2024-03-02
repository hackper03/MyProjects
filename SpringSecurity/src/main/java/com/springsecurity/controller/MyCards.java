package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCards {
	@GetMapping("/my-cards")
	public String getMyCard() {
		return "Hii You have several cards in your bucket";
	}
}
