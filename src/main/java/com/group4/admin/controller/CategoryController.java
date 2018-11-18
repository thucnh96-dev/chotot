package com.group4.admin.controller;

import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.group4.Service.CategoryService;
import com.group4.entity.Category;

@Controller
@RequestMapping("/categories")
public class CategoryController {
@Autowired
CategoryService categoryService;
	@GetMapping
	public String getListCategoryies() {
		return "admin/categores";

	}

	@PostMapping("/create")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult bindingResult,
			RedirectAttributes redirectAttributes, ModelMap mm) {
		return "admin/createCategory";
	}

	@GetMapping("/create")
	public String createCategory(ModelMap map) {
		map.addAttribute("category", new Category());
		return "admin/createCategory";
	}

	@GetMapping("/update/{id}")
	public String updateCategory(@PathVariable UUID id, ModelMap map) {
		Optional<Category> category = categoryService.findById(id);
		if (!category.isPresent()) {
			return "error/404";
		}
		map.addAttribute("category", category.get());
		return null;
	}

	@PostMapping("/update")
	public String updateCategory(@RequestParam UUID id, @RequestParam String name, @RequestParam String filename) {
		return null;

	}

}
