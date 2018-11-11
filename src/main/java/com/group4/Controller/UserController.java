
package com.group4.Controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.group4.Repository.RoleRopository;
import com.group4.Service.SecurityService;
import com.group4.Service.UserService;
import com.group4.entity.Role;
import com.group4.entity.User;

@Controller
@RequestMapping("/user")
public class UserController extends AbtractController {
	@Autowired
	UserService userService;
	@Autowired
	RoleRopository roleRopository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	SecurityService securityService;



	@GetMapping(value = "/{id}")
	public String userProfile(@PathVariable("id") UUID id, Model mm) {
		Optional<User> user = userService.findById(id);
		mm.addAttribute("userinfo", user.get());
		return "user/profile";
	}

}
