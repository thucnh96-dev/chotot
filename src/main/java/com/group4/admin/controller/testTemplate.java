package com.group4.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testTemplate {
@GetMapping(value="test/index")
	public String adminpage() {
		
		return "admin/home";
	}
}
