package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	@GetMapping("/my-loan")
	public String getLoadDetails() {
		return "Hello this is loan details";
	}
}
