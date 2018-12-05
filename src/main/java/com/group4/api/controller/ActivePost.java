package com.group4.api.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.group4.Heper.EmailHepper;
import com.group4.Service.PostService;
import com.group4.Service.UserService;
import com.group4.entity.Post;
@RestController
@RequestMapping(value = "/admin/ative")
public class ActivePost {
	@Autowired
	PostService postService;
	@Autowired
	UserService userService;
	 @Autowired
	  EmailHepper  emailHepper ;

	@GetMapping(value = "/{id}")
	public String isActive(@PathVariable("id") UUID id) {
		Optional<Post> p = postService.findById(id);
		if (!p.isPresent()) {
			return "Post notfoud!";
		}
		Post postIs = p.get();
		postIs.setAccept(true);
		Post post = postService.save(postIs);
		if (post == null) {
			return "ERR";
		}
		return "Active";
	}
	
	@GetMapping(value = "/{id}/notActive")
	public String unActive(@RequestParam("id") UUID id, @RequestParam("message") String message) {
		Optional<Post> p = postService.findById(id);
		if (!p.isPresent()) {
			return "Post notfoud!";
		}
		Post postIs = p.get();
		postIs.setAccept(false);	
	    Post notActive=postService.save(postIs);
		message(notActive.getUser().getEmail(), message);
		return "UnActive";
	}
	

	public void message(String email,String message) {
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setFrom("thucnhpd02000@fpt.edu.vn");
		simpleMailMessage.setTo(email);
		simpleMailMessage.setSubject("Bài Post chưa được duyệt:");
		simpleMailMessage.setText(message);
		simpleMailMessage.setReplyTo("thucnhpd02000@fpt.edu.vn");
		emailHepper.sendEmail(simpleMailMessage);
		
	}

}
