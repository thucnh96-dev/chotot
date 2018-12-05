package com.group4.admin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.group4.Controller.AbtractController;
import com.group4.Service.PostService;
import com.group4.Service.SubCategoryService;
import com.group4.Service.UserService;
import com.group4.entity.Post;
import com.group4.entity.SubCategory;
import com.group4.spec.PostSpec;

@Controller

@RequestMapping(value = "/admin/post/content")
public class AdminPostController extends AbtractController {
	@Autowired
	PostService postService;
	@Autowired
	UserService uerService;
	@Autowired
	SubCategoryService subCategoryService;

	@GetMapping("")
	public String data(@RequestParam HashMap<String, Object> res, Model model) {
		String views = "admin/post/list";
		int page = res.get("page") == null ? 0 : Integer.parseInt(res.get("page").toString());
		int size = res.get("size") == null ? 10 : Integer.parseInt(res.get("size").toString());
        List<SubCategory> sub=subCategoryService.findAll();
        model.addAttribute("SUB", sub);
		
		int searchCnt = nullcheck.intCheck(res, "searchCnt");
		String subcate = nullcheck.stringCheck(res, "subcate");
		String text = nullcheck.stringCheck(res, "text");
		String username = nullcheck.stringCheck(res, "username");
		if (searchCnt > 0)
			size = searchCnt;
		Page<Post> datas = postService.findAll(PostSpec.likeTitle(text, username, subcate), PageRequest.of(page, size));
		
		List<Post> list=datas.getContent();
		for (Post p : datas.getContent()) {
			System.out.println(p.getTitle());
		}
		 model.addAttribute("datas", list);
		 model.addAttribute("data", datas);
		return views;
	}
}
