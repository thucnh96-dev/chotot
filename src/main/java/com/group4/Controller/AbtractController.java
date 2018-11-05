package com.group4.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.group4.Service.UserService;
import com.group4.entity.User;

public abstract class AbtractController {
	@Autowired
	UserService userService;

	
	protected PageRequest getListUserOderbyIDDes(int page) {
		return PageRequest.of(page, 20, Sort.Direction.DESC, "id");
	}
	
	protected User getCurentUser(Authentication authentication) {
		authentication=SecurityContextHolder.getContext().getAuthentication();
		User user=(User) userService.findByName(authentication.getName());
		return user;
	}

}
