package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	@GetMapping("/my-balance")
	public String getBalanace() {
		return "Here is your balance";
	}
}
