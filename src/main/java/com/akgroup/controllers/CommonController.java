package com.akgroup.controllers;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CommonController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}
