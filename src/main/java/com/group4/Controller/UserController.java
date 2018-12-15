
package com.group4.Controller;


import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.group4.Repository.RoleRopository;
import com.group4.Service.SecurityService;
import com.group4.Service.UserService;
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



	@GetMapping(value = "/profile")
	public String userProfile(Authentication authentication, Model mm) {
		User user=this.getCurentUser(authentication);  
		mm.addAttribute("userinfo", user);
		return "user/profile";
	}
	@PostMapping(value = "/update")
	public String userProfile(Authentication authentication, HttpServletRequest request, ModelMap mm) {				
		User object=this.getCurentUser(authentication);
        mm.addAttribute("userinfo", object)	;	
        String phone=request.getParameter("tphone");
		String name=request.getParameter("tname");	
		object.setName(name);
		object.setPhone(phone);
	    userService.save(object);
	   mm.addAttribute("succesMessage", "Lưu trữ thành công ");
		return "user/profile";
	}
	@GetMapping(value="/changepass")
	public String page(){
		return "auth/changepassword";
	}
	@PostMapping(value = "/changepass")
	public String forgotPassword(Authentication authentication,HttpServletRequest request, Model model) {
	    User user=this.getCurentUser(authentication);
	    model.addAttribute("userinfo", user);
	    String currentpassword=request.getParameter("password");
	    String newpassword=request.getParameter("npassword");
	    String cfnewpassword=request.getParameter("cfnpassword");
	    
	    if (!bCryptPasswordEncoder.matches(currentpassword, user.getPasssword())) {
	    	model.addAttribute("error", "Không trùng mật khẩu cũ");
	    	return "auth/changepassword";
		}if(!newpassword.equals(cfnewpassword)) {
			model.addAttribute("error1", "Mật khẩu không khớp");
	    	return "auth/changepassword";
		}
	    
	    user.setPasssword(bCryptPasswordEncoder.encode(cfnewpassword));
	    userService.save(user);
	    model.addAttribute("successMessage", "Thay đổi mật khẩu thành công!");
		return "auth/changepassword";
	}
}
