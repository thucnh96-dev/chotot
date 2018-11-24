package com.group4.admin.controller;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.group4.Service.SubCategoryService;
import com.group4.entity.Category;
import com.group4.entity.SubCategory;

@Controller
@RequestMapping("/subCategories")
public class SubCategoryController {
	@Autowired
	SubCategoryService subCategoryService;
	@Autowired
	CategoryService categoryService;

	@GetMapping
	public String getListCategoryies(ModelMap modelMap) {
		modelMap.addAttribute("SUBCATEGORIES", subCategoryService.findAll());
		return "admin/sub_categories";

	}

	@PostMapping("/create")
	public String createCategory(@RequestParam String name, @RequestParam UUID categoryId, ModelMap mm)
			throws IOException {
		Category category = new Category();
		category.setId(categoryId);
		SubCategory subCategory = new SubCategory();
		subCategory.setName(name);
		subCategory.setCategory(category);
		SubCategory subCategory2 = subCategoryService.save(subCategory);
		if (subCategory2 == null) {
			return "error/404";
		}
		return "redirect:/subCategories";
	}

	@GetMapping("/create")
	public String createSubCategory(ModelMap map) {
		map.addAttribute("action", "create");
		map.addAttribute("CATEGORIES", categoryService.findAll());
		
		return "admin/sub_category";
	}

	@GetMapping("/update/{id}")
	public String updateSubCategory(@PathVariable UUID id, ModelMap map) {
		System.out.println(id);
		Optional<SubCategory> subcategory = subCategoryService.findById(id);
		if (!subcategory.isPresent()) {
			return "error/404";
		}
		map.addAttribute("action", "update");
		map.addAttribute("SUBCATEGORY", subcategory.get());
		map.addAttribute("CATEGORIES", categoryService.findAll());
		return "admin/sub_category";
	}

	@PostMapping("/update")
	public String updateSubCategory(@RequestParam String name,@RequestParam UUID id, @RequestParam UUID categoryId, ModelMap modelMap) throws IOException {
		SubCategory subCategory = new SubCategory();
		subCategory.setId(id);
		Category category = new Category();
		category.setId(categoryId);
		subCategory.setName(name);
		subCategory.setCategory(category);
		SubCategory subCate = subCategoryService.save(subCategory);
		if (subCate == null) {
			return "error/404";
		}
		return "redirect:/subCategories";

	}

	@GetMapping("/delete/{id}")
	public String deleteSubCategory(@PathVariable UUID id, ModelMap map) {
		Optional<SubCategory> subcategory = subCategoryService.findById(id);
		System.out.println(subcategory.get().getName());
		if (!subcategory.isPresent()) {
			return "error/404";
		}
		subCategoryService.deleteById(id);
		return "redirect:/subCategories";
	}

}
