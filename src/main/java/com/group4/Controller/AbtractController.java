package com.group4.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.group4.Heper.NullCheckHepper;
import com.group4.Service.UserService;
import com.group4.entity.User;

public abstract class AbtractController {
	@Autowired
	UserService userService;

protected	NullCheckHepper nullcheck=new NullCheckHepper();
	protected PageRequest getListUserOderbyIDDes(int page) {
		return PageRequest.of(page, 20, Sort.Direction.DESC, "id");
	}
	protected PageRequest getListUserPostNotActive(int page,int size) {
		return PageRequest.of(page, size, Sort.Direction.DESC, "id");
	}
	protected PageRequest getListUserPostInActive(int page,int size) {
		return PageRequest.of(page, size, Sort.Direction.DESC, "createdAt");
	}
	
	protected User getCurentUser(Authentication authentication) {
		authentication=SecurityContextHolder.getContext().getAuthentication();
		User user=(User) userService.findByUsername(authentication.getName());
		return user;
	}

}
