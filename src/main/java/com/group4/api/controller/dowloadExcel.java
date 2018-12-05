package com.group4.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import com.group4.Service.PostService;
import com.group4.Service.UserService;
import com.group4.entity.Post;
import com.group4.entity.User;
import com.group4.excel.UserPostExcel;


@RequestMapping(value="/user/dowload")
public class dowloadExcel {
	@Autowired
	PostService postService;
	@Autowired
	UserService  userService ;
	
@RequestMapping(value="/{id}")
public View dowloadPost(HttpServletRequest request,
        HttpServletResponse response,
        Model model, @PathVariable UUID id) {
	Optional<User> u=userService.findById(id);
	List<Post> findAllbyUserID=postService.findAllByUser(u.get());
	model.addAttribute("list", findAllbyUserID); 
	return new UserPostExcel();
}
}
