package com.springmvc.ecom.Ecommerce.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/404")
	public String _404Page() {
		System.out.println("printing 404");
		return "404";
	}
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Ayush Asati");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
		model.addAttribute("date", formatter.format(date));
		System.out.println("printing home");
		return "home";
	}
	@GetMapping("/search")
	public String search() {
		System.out.println("printing search");
		return "search";
	}
	@GetMapping("/cart")
	public String cart() {
		System.out.println("printing cart");
		return "cart";
	}
}
