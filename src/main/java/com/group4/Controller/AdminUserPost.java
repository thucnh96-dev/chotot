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

@Controller
@RequestMapping(value = "/user/manage")
public class AdminUserPost extends AbtractController {
	
	@Autowired
	UserService userService;
	@Autowired
	PostService postService;
	@Autowired
	SubCategoryService subCategoryService;

	@GetMapping("")
	public String home(Model model, Authentication authentication, @RequestParam HashMap<String, Object> res) {
		
		// view on website
		String view = "user/manage/post";

		int page = res.get("page") == null ? 0  : Integer.parseInt(res.get("page").toString());
		int size = res.get("size") == null ? 10 : Integer.parseInt(res.get("size").toString());

		Page<Post> data = postService.findAllByUser(this.getCurentUser(authentication),this.getListUserPostInActive(page, size));		
        List<Post> listpost=postService.findAllByUser(this.getCurentUser(authentication));
        model.addAttribute("DATA", data);
        model.addAttribute("DATAVIEW", listpost);
		return view;
	}
}
