package com.group4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
<<<<<<< HEAD:src/main/java/com/group4/Controller/LoginController.java
@RequestMapping("/login")
public class LoginController {
	
	
	@GetMapping
	public String honme(ModelMap mm) {
		return "login";
=======
public class testControllerJSP {
@GetMapping(value="/login")
	public String honme(ModelMap mm) {
	mm.addAttribute("meet", "trungthuc");
		return "auth/login";
>>>>>>> feature/trungthuc:src/main/java/com/group4/Controller/testControllerJSP.java
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
