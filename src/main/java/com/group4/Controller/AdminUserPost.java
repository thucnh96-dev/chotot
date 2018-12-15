package com.group4.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.group4.Service.PostService;
import com.group4.Service.SubCategoryService;
import com.group4.Service.UserService;
import com.group4.entity.Post;
import com.group4.entity.User;

@Controller
@RequestMapping(value = "/user/manager")
public class AdminUserPost extends AbtractController {
	
	@Autowired
	UserService userService;
	@Autowired
	PostService postService;
	@Autowired
	SubCategoryService subCategoryService;

	@GetMapping("")
	public String home(Model model, Authentication authentication, @RequestParam HashMap<String, Object> res) {
		String view = "user/manage/post";
		User user = this.getCurentUser(authentication);
		System.out.println(user.getEmail());
		if (user == null) {
			return "redirect:/auth/login";
		}

		int page = res.get("page") == null ? 0  : Integer.parseInt(res.get("page").toString());
		int size = res.get("size") == null ? 10 : Integer.parseInt(res.get("size").toString());
        
		Page<Post> data = postService.findAllByUser(user,this.getListUserPostInActive(page, size));
		Page<Post> datapostactive
		=postService.findAllByUserAndIsAcceptTrue(user,this.getListUserPostInActive(page, size));
		Page<Post> datapostnotactive
		=postService.findAllByUserAndIsAcceptFalse(user,this.getListUserPostInActive(page, size));
        model.addAttribute("DATA", data);
        model.addAttribute("total", data.getTotalPages());
        model.addAttribute("totalac", datapostactive.getTotalPages()==0 ?0: datapostactive.getTotalPages());
        model.addAttribute("totalnot", datapostnotactive.getTotalPages()==0 ?0: datapostnotactive.getTotalPages());
        model.addAttribute("DATAVIEWA", datapostactive);
        model.addAttribute("DATAVIEWN", datapostnotactive);
		return view;
	}
	
	
}
