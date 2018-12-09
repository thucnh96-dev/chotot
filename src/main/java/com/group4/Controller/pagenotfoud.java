package com.group4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pagenotfoud {

	@GetMapping(value="/403")
	public String error(ModelMap mm) {
		mm.addAttribute("meet", "trungthuc");
		return "error/404";
	}
}
