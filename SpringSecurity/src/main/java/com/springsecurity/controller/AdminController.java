package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@GetMapping("/admin")
	public String getAdminPage() {
		return "Carefully!!! You have login in ADMIN page";
	}
}
