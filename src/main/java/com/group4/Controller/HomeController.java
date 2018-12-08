package com.group4.Controller;

import javax.servlet.http.HttpSession;

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
	public String ffd(ModelMap mm, HttpSession session) {
		session.setAttribute("title", "Trang Chu");
		mm.addAttribute("CATEGORIES", categoryService.findAll());
		return "home/home";
	}
}
