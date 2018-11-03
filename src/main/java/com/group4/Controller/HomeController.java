package com.group4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping
	public String ffd(ModelMap mm) {
		mm.addAttribute("meet", "trungthuc");
		return "home/home";
	}
}
