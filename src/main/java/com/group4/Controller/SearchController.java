package com.group4.Controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.group4.Repository.PostRepository;
import com.group4.Service.CategoryService;
import com.group4.Service.CityService;
import com.group4.Service.PostService;
import com.group4.entity.Post;

@Controller
@RequestMapping("/search")
public class SearchController {
	@Autowired
	PostService postService;
	@Autowired
	CityService cityService;
	@Autowired
	CategoryService categoryService;
	@Autowired
	PostRepository postRepository;

	@GetMapping("/by")
	public String search(@RequestParam("keywork") String keywork, @RequestParam(defaultValue = "0") int city,
			@RequestParam(defaultValue = "0") int district, @RequestParam(defaultValue = "0") int ward,
			@RequestParam(defaultValue = "") String cateId, @RequestParam(defaultValue = "") String subcateId,
			ModelMap map, HttpSession session) {
		session.setAttribute("title", "Tim Kiem");
		UUID cate = null;
		System.out.println(!cateId.equals(""));
		if (!cateId.equals("")) {

			cate = UUID.fromString(cateId);
		}
		UUID subcate = null;
		if (!subcateId.equals("")) {
			subcate = UUID.fromString(subcateId);
		}

		List<Post> posts = postService.search(keywork, city, district, ward, cate, subcate);
		map.addAttribute("POSTS", posts);
		if (cate != null & subcate == null) {
			map.addAttribute("CATEGORIES", categoryService.findAll());
		}
		if (subcate !=null) {
			map.addAttribute("CATEGORY", categoryService.findById(cate).get());
		}
		if (cate == null & subcate == null) {
			map.addAttribute("CATEGORIES", categoryService.findAll());
		}
		map.addAttribute("TOP5", postService.findTop5(5));
		map.addAttribute("CITYS", cityService.findAll());
		return "find/find";

	}
}
