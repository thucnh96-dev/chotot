package com.group4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

	@GetMapping(value = "/register")
	public String register(ModelMap mm) {
		mm.addAttribute("meet", "trungthuc");
		return "auth/register";
	}

	@PostMapping(value = "/register")
	public String createUser(ModelMap mm) {
		mm.addAttribute("meet", "trungthuc");
		return "redirect:/";
	}

	@GetMapping(value = "/forgotPassword")
	public String forgotPassword(ModelMap mm) {
		mm.addAttribute("meet", "trungthuc");
		return "auth/forgotpassword";
	}

}
