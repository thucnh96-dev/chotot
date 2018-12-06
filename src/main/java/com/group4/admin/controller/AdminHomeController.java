package com.group4.admin.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.group4.Service.PostService;
import com.group4.Service.UserService;
import com.group4.entity.Post;

@Controller
@RequestMapping(value="/admin")
public class AdminHomeController extends AdminAbtractController {
	@Autowired
	PostService postService;
	@Autowired
	UserService serService;
	
	@GetMapping("")
	public String homepage(Authentication authentication,@PageableDefault(size=20)  Pageable pageable ,Model model) {
		Page<Post> pagepostUnactive=postService.findAllByIsAcceptFalse(pageable);
		model.addAttribute("pdata", pagepostUnactive);
		return "admin/home";
	}
	
	
	
	
	

    
	@GetMapping(value="/actives")
	@ResponseBody
	public Page<Post> home(@RequestParam HashMap<String, Object> res, Model model) {
		int page=Integer.parseInt(res.get("page").toString());
		int size=Integer.parseInt(res.get("size").toString());
		Page<Post> getListPostunActive=postService.findAllByIsAcceptFalse(this.postActive(page,size));
		return getListPostunActive;
	}
	
	
	
}