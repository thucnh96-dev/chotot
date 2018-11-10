
package com.group4.Controller;


import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group4.Service.UserService;
import com.group4.entity.User;



@Controller
@RequestMapping("/user")
public class UserController extends AbtractController {
	@Autowired
	UserService userService;


	
	@GetMapping(value="/{id}")
	public String userProfile(@PathVariable("id") UUID id,Model mm) {
		Optional<User> user=userService.findById(id);
		mm.addAttribute("userinfo", user.get());
		return "user/profile";
	}


}