package com.group4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
@GetMapping(value="/login")
	public String honme(ModelMap mm) {
	mm.addAttribute("meet", "trungthuc");
		return "auth/login";
	}

@GetMapping(value="/register")
public String regis(ModelMap mm) {
mm.addAttribute("meet", "trungthuc");
	return "auth/register";
}
@GetMapping(value="/findpass")
public String findpass(ModelMap mm) {
mm.addAttribute("meet", "trungthuc");
	return "auth/findpass";
}

@GetMapping(value="/eeror")
public String eror(ModelMap mm) {
mm.addAttribute("meet", "trungthuc");
	return "error/404";
}

@GetMapping(value="/postform")
public String ff(ModelMap mm) {
mm.addAttribute("meet", "trungthuc");
	return "post/form";
}

@GetMapping(value="/home")
public String ffd(ModelMap mm) {
mm.addAttribute("meet", "trungthuc");
	return "home/home";
}
}
