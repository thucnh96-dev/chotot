package com.group4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group4.Service.CategoryService;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	CategoryService categoryService;
	@GetMapping
	public String ffd(ModelMap mm) {
		mm.addAttribute("CATEGORIES", categoryService.findAll());
		return "home/home";
	}
}
