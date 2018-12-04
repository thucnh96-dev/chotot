package com.group4.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

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
@RestController
@RequestMapping(value="/admin/post/content")
public class AdminPostController extends AbtractController {
	@Autowired
	PostService postService ;
	@Autowired
	UserService uerService ;
	@Autowired
	SubCategoryService subCategoryService ;
    
	@GetMapping("")
	public String data(@RequestParam HashMap<String, Object> res, Model model) {
	
		String views="admin/post/list";
		int page= res.get("page")==null ?0: Integer.parseInt(res.get("page").toString());
		int size= res.get("size")==null ?10: Integer.parseInt(res.get("size").toString());
		
		// param url size
	     int searchCnt=nullcheck.intCheck(res, "searchCnt");	     
	     String namesubcate =    nullcheck.stringCheck(res, "idsubcate");
	     String searchDescription =  nullcheck.stringCheck(res, "search_des");
	     String searchTitle =  nullcheck.stringCheck(res, "search_title");
	     String searchusername =  nullcheck.stringCheck(res, "user_name");
	     if(searchCnt>0) size=searchCnt;
		
	     Specification<Post> spec=null;
	     spec= PostSpec.defualtWhere();
	     
	     if (!"".equals(searchDescription)) {
			spec=spec.and(PostSpec.likeDescription(searchDescription));
		 }
//	     if (!"".equals(searchTitle)) {
//			spec=spec.or(PostSpec.likeTitle(searchTitle));
//		 }
//	 
//	     if (!"".equals(searchusername)) {
//		    	spec=spec.or(PostSpec.likeUser(searchusername));
//			 }
//	     if (!"".equals(namesubcate)) {
//		    	spec=spec.or(PostSpec.equalCategory(namesubcate));
//			 }
	     System.out.println("start page");
 	     Page<Post> data=postService.findAll(spec,  PageRequest.of(page,size));
 	     for(Post p:data.getContent()) {
 	    	 System.out.println(p.getTitle());
 	     }
 	     System.out.println(data.getSize()+"is");
 	     System.out.println("end page");
 	     List<SubCategory> sub=subCategoryService.findAll();
 	     model.addAttribute("SUB", sub);
 	     model.addAttribute("data", data);
 	    
		return views;
	}
}
