package com.raihan.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	
	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "views/loginForm";
	}
}
