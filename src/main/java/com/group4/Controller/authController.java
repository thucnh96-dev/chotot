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
@RequestMapping(value="/auth")
public class authController {
	@Autowired
	UserService userService;
    @Autowired
    SecurityService securityService ;
    @Autowired
    RoleRopository roleRopository ;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder ;
	@GetMapping(value = "/register")
	public String register(ModelMap mm) {
		mm.addAttribute("user", new User());
		return "auth/register";
	}
	

	@PostMapping(value = "/register")
	public String createUser(@Valid @ModelAttribute("user") User user,BindingResult bindingResult,RedirectAttributes redirectAttributes, ModelMap mm) {
		if (!(user.getPasssword().equals(user.getConfimpassword()))) {
			bindingResult.rejectValue("confimpassword", "matchpassword");
		}
		if (bindingResult.hasErrors()) {
			return "auth/register";
		}
		Role r=roleRopository.findByName("USER");
		user.setRoles(new HashSet<Role>(Arrays.asList(r)));
		user.setPasssword(bCryptPasswordEncoder.encode(user.getPasssword()));
		user.setActive(true);
		userService.save(user);
		securityService.autologin(user.getUsername(), user.getPasssword());
		redirectAttributes.addFlashAttribute("userinfo", user);
		return "redirect:/user/"+user.getId()+"";
	}
	


	@GetMapping(value = "/forgotPassword")
	public String forgotPassword(ModelMap mm) {
		mm.addAttribute("meet", "trungthuc");
		return "auth/forgotpassword";
	}
	
	@GetMapping(value = "/login")
	public String login(ModelMap mm) {
	
		return "auth/login";
	}
}
