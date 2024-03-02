package com.springmvc.ecom.Ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class SignController {
	@GetMapping
	public String veiwPage() {
		return "addtocart";
	}
}
