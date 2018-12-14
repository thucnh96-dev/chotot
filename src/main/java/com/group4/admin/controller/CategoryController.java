package com.group4.admin.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.group4.Heper.FileStorageService;
import com.group4.Service.CategoryService;
import com.group4.Service.PostService;
import com.group4.entity.Category;

@Controller
@RequestMapping("/admin/categories")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	PostService postService;
	@Autowired
	FileStorageService fileStorageService;

	@GetMapping
	public String getListCategoryies(ModelMap modelMap) {
	modelMap.addAttribute("CATEGORIES", categoryService.findAll());
		return "admin/categories";

	}

	@PostMapping(value="/create")
	public String createCategory(@RequestParam String name,@RequestParam("files") MultipartFile[] file, @RequestParam String description,
			 ModelMap mm) throws IOException {
		
		List<Category> list=categoryService.findByName(name);
		for (Category c :list) {
			if (c.getName().equalsIgnoreCase(name)) {
				mm.addAttribute("errorMessage", "Danh mục đã tồn tại");
				return "admin/category";
			}
		}
		
		
		Category category = new Category();
	
		category.setName(name);
		category.setDescription(description);
		if (!file[0].isEmpty()) {
			category.setPhoto(fileStorageService.storeFile(file[0]));
		}
		categoryService.save(category);
		return "redirect:/admin/categories";
	}

	@GetMapping("/create")
	public String createCategory(ModelMap map) {
		map.addAttribute("action", "/admin/categories/create");
		return "admin/category";
	}

	@GetMapping("/update/{id}")
	public String updateCategory(@PathVariable UUID id, ModelMap map) {
		Optional<Category> category = categoryService.findById(id);
		if (!category.isPresent()) {
			return "error/404";
		}
		map.addAttribute("action", "/admin/categories/update");
		map.addAttribute("CATEGORY", category.get());
		return "admin/category";
	}

	@PostMapping("/update")
	public String updateCategory(@RequestParam String name,@RequestParam UUID id, @RequestParam("files") MultipartFile[] file, @RequestParam String description, ModelMap modelMap) throws IOException {
		Optional<Category> cate = categoryService.findById(id);
		Category category = new Category();
		if (!cate.isPresent()) {
			return "redirect:/error";
		} 
		String photoName = cate.get().getPhoto();
		if (!file[0].isEmpty()) {
			photoName = fileStorageService.storeFile(file[0]);
		}
		category.setId(id);
		category.setName(name);
		category.setDescription(description);
		category.setPhoto(photoName);
		Category category2 =categoryService.save(category);
		if (category2 == null) {
			return "redirect:/error";
		}
		return "redirect:/admin/categories";

	}
	@GetMapping("/delete/{id}")
	public String deleteCategory(@PathVariable UUID id, ModelMap map) {
		System.out.println(id);
		Optional<Category> category = categoryService.findById(id);
		if (!category.isPresent()) {
			return "redirect:/error";
		}
		categoryService.deleteById(id);
		return "redirect:/admin/categories";
	}

}
