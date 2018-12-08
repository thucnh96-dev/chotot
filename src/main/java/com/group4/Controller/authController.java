package com.group4.Controller;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.core.Authentication;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.group4.Heper.EmailHepper;
import com.group4.Heper.EmailSender;
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
    @Autowired
    EmailHepper  emailHepper ;
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
		user.setCreatedAt(new Timestamp(new Date().getTime()));
		user.setRoles(new HashSet<Role>(Arrays.asList(r)));
		user.setPasssword(bCryptPasswordEncoder.encode(user.getPasssword()));
		user.setActive(true);
		userService.save(user);
		securityService.autologin(user.getUsername(), user.getPasssword());
		redirectAttributes.addFlashAttribute("userinfo", user);
		return "redirect:/user/profile";
	}
	


	@GetMapping(value = "/forgotPassword")
	public String forgotPassword(ModelMap mm) {
		mm.addAttribute("meet", "trungthuc");
		return "auth/forgotpassword";
	}
	@PostMapping(value = "/forgotPassword")
	public ModelAndView  forgotPassword(@RequestParam("email") String email,ModelAndView modelAndView ) {
		User forgot=userService.findByemail(email);
		String res="http://localhost:8080/auth/reset?token=";
		if (forgot==null) {
			modelAndView.addObject("errorMessage", "Not email in data!");
		}
		forgot.setToken(UUID.randomUUID().toString());
		userService.save(forgot);
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setFrom("thucnhpd02000@fpt.edu.vn");
		simpleMailMessage.setTo(forgot.getEmail());
		simpleMailMessage.setSubject("Forgot password request!");
		simpleMailMessage.setText("Click link forgot your password <br>"
				+ " <a  href="+res+forgot.getToken()+"> click me !</a> ");
		simpleMailMessage.setReplyTo("thucnhpd02000@fpt.edu.vn");
		emailHepper.sendEmail(simpleMailMessage);
		modelAndView.addObject("successMessage", "A password reset link has been sent to " + forgot.getEmail());
		modelAndView.setViewName("auth/forgotpassword");
		return modelAndView;
		
	}
	@GetMapping(value="/reset")
	public ModelAndView reset(ModelAndView modelAndView, @RequestParam("token") String token) {
		User u = userService.findByToken(token);
		System.out.println(u.getUsername());

		if (u != null) {
			modelAndView.addObject("token", u.getToken());
		} else {
			modelAndView.addObject("errorMessage", "Oops!fdsf  This is an invalid password reset link.");
		}
		modelAndView.setViewName("auth/resetpassword");
		return modelAndView;
	}
	@PostMapping(value = "/reset")
	public ModelAndView resetpass(ModelAndView modelAndView, @RequestParam("token")String token,@RequestParam("password")String password,
			RedirectAttributes redir) {
		User u = userService.findByToken(token);
		System.out.println(u.getEmail());
	
		if (u != null) {
			u.setToken(null);
			u.setPasssword(bCryptPasswordEncoder.encode(password) );
			userService.save(u);
			redir.addFlashAttribute("successMessage", "You have successfully reset your password.  You may now login.");
			modelAndView.setViewName("redirect:/login");
			return modelAndView;
		} else {
			modelAndView.addObject("errorMessage", "Oops!  This is an invalid password reset link.");
			modelAndView.setViewName("auth/resetpassword");
		}
		return modelAndView;
	}
	
	@GetMapping(value = "/login")
	public String login(ModelMap mm) {
	
		return "auth/login";
	}
	

}
