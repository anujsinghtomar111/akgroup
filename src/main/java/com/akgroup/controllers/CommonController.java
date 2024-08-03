package com.akgroup.controllers;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
//	@GetMapping("/header")
//	public String header() {
//		return "header";
//	}
//	@GetMapping("/footer")
//	public String footer() {
//		return "footer";
//	}
//	@GetMapping("/fragments")
//	public String fragments() {
//		return "fragments";
//	}
}
