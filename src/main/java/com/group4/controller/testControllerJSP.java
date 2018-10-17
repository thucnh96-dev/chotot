package com.group4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testControllerJSP {
@GetMapping(value="/index")
	public String honme(ModelMap mm) {
	mm.addAttribute("meet", "trungthuc");
		return "index";
	}
}
