package com.group4.Controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.group4.Heper.FileStorageService;
import com.group4.Service.AddressService;
import com.group4.Service.CityService;
import com.group4.Service.PostPhotoService;
import com.group4.Service.PostService;
import com.group4.Service.SubCategoryService;
import com.group4.Service.UserService;
import com.group4.entity.Address;
import com.group4.entity.Post;
import com.group4.entity.PostPhoto;
import com.group4.entity.User;
import com.group4.entity.Ward;

@Controller
@RequestMapping(value = "/post")
public class PostController extends AbtractController {

	@Autowired
	PostService postService;
	@Autowired
	AddressService addressService;
	@Autowired
	PostPhotoService postPhotoService;
	@Autowired
	SubCategoryService subCategoryService;
	@Autowired
	UserService userService;
	@Autowired
	FileStorageService fileStorageService;
	@Autowired
	CityService cityService;

	@GetMapping(value = "/new")
	public String createNew(Model model, Authentication authentication) {
		User user = this.getCurentUser(authentication);
		System.out.println(user.getEmail());
		if (user == null) {
			return "redirect:/auth/login";
		}

		model.addAttribute("CITYS", cityService.findAll());
		model.addAttribute("post", new Post());
		model.addAttribute("subcate", subCategoryService.findAll());
		return "post/form";
	}

	@GetMapping(value = "/{id}")
	public String createNew(@PathVariable("id") UUID id, Model model, Authentication uthentication) {
		User user = this.getCurentUser(uthentication);
		Post post = postService.findById(id).get();
		System.out.println(user.getPosts().get(0).getId());
		List<PostPhoto> photos = postPhotoService.findByPost(post);
		if (user.getPosts().indexOf(post) < 0) {
			return "redirect:/error";
		}
		model.addAttribute("CITYS", cityService.findAll());
		model.addAttribute("subcate", subCategoryService.findAll());
		model.addAttribute("IMAGES", photos);
		System.out.println(photos.size());
		model.addAttribute("post", post);
		System.out.println("oke");
		return "post/updatepost";
	}

	@PostMapping(value = "update")
	public String updatePost(@ModelAttribute("post") Post post, @RequestParam("images") MultipartFile[] file,
			Model model, Authentication uthentication, @RequestParam("imageIds") UUID[] ids) {
		User user = this.getCurentUser(uthentication);
		System.out.println(ids.length);
		List<PostPhoto> photos = postPhotoService.findByPost(post);
		for (int i = 0; i < photos.size(); i++) {
			for (int j = 0; j < ids.length; j++) {
				if (photos.get(i).getId() != ids[j]) {
					
				} else {
System.out.println(photos.get(i).getId());
				}
			}
		}
		if (user == null) {
			return "redirect:/auth/login";
		}
		
//		if (user.getPosts().indexOf(post) < 0) {
//			return "redirect:/error";
//		}
		System.out.println(photos.size());
		model.addAttribute("post",post);
		System.out.println("oke");
		return "post/updatepost";
	}

	@PostMapping(value = "/new/upload")
	public String createNew(@ModelAttribute("post") Post post, @RequestParam("images") MultipartFile[] file,
			@RequestParam int ward_id, @RequestParam String address_string, Model model, Authentication uthentication)
			throws IOException {
		System.out.println(file.length);
		Ward ward = new Ward();
		ward.setId(ward_id);
		Address add = new Address();
		add.setAddress(address_string);

		add.setWard(ward);
		Address address = addressService.save(add);

		post.setCreatedAt(new Timestamp(new Date().getTime()));
		post.setAccept(false);

		post.setAddress(address);

		post.setUser(this.getCurentUser(uthentication));
		/* post.setPhotos(photos); */

		Post postSave = postService.save(post);
		if (postSave == null) {

		}
		for (int i = 0; i < file.length; i++) {
			PostPhoto p = new PostPhoto();
			p.setPost(postSave);
			p.setName(fileStorageService.storeFile(file[i]));
			postPhotoService.save(p);
		}

		return "post/form";
	}
	@GetMapping(value = "/view/{id}")
	public String viewPost(@PathVariable UUID id, ModelMap modelMap) {
		Post post = postService.findById(id).get();
		modelMap.addAttribute("POST", post);
		List<PostPhoto> photos = postPhotoService.findByPost(post);
		modelMap.addAttribute("PHOTOS", photos);
		return "post/view";
		
	}

}
