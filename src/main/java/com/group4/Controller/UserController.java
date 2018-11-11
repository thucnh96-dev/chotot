
package com.group4.Controller;


import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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



	@GetMapping(value = "/{id}")
	public String userProfile(@PathVariable("id") UUID id,Authentication authentication, Model mm) {
//		/*User curent=this.getCurentUser(authentication);*/
		Optional<User> user = userService.findById(id);
	    System.out.println(user.get().getId());
		mm.addAttribute("userinfo", user.get());
		return "user/profile";
	}

}
