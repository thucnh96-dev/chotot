package com.group4.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.group4.Service.CategoryService;
import com.group4.Service.CityService;
import com.group4.Service.PostService;
//import com.group4.entity.Category;
import com.group4.entity.Post;

@Controller
@RequestMapping("/find")
public class FindController {
	@Autowired
	PostService postService;
	@Autowired
	CityService cityService;
	@Autowired 
	CategoryService categoryService;

	@GetMapping("/{id}")
	public String searchByCategory(@PathVariable UUID id,@RequestParam(defaultValue = "1") int page,ModelMap map ) {
			Pageable pageable = PageRequest.of(page - 1, 20);
			List<Post> postss = new ArrayList<>();
			List<List<Post>> posts = postService.findByCategory(id, pageable);
			System.out.println(posts.size());
			for (int i = 0; i < posts.size(); i++) {
				for (int j = 0; j < posts.get(i).size(); j++) {
					postss.add(posts.get(i).get(j));
					System.out.println(posts.get(i).get(j).getId());
				}
				
			}
			map.addAttribute("POSTS", postss);
			map.addAttribute("CATEGORY", categoryService.findById(id).get());
			map.addAttribute("CITYS", cityService.findAll());
		return "find/find";

	}
	@GetMapping
	public String search(ModelMap map ) {
		
			map.addAttribute("POSTS", postService.findAll());
			map.addAttribute("CATEGORIES", categoryService.findAll());
			map.addAttribute("CITYS", cityService.findAll());
		return "find/find";

	}


}
