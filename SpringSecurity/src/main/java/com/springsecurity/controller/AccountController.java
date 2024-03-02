package com.springsecurity.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AccountController {
	@GetMapping("/my-acount")
	public String getAccountDetails() {
		return "Here are the account Details";
	}
	
}
