package com.group4.api.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import com.group4.Service.PostService;
import com.group4.entity.Post;
import com.group4.excel.AdminPostExcel;

@Controller
@RequestMapping(value="/admin/dowload")
public class AdminDowloadExcel {
	@Autowired
	PostService postService;
	
	@GetMapping
	public View dowloadAll(Model model) {
	List<Post>	 data=postService.findAll();
	model.addAttribute("listdate", data);
	return new AdminPostExcel();
	}
	
	@GetMapping(value="/{start}/{end}")
	public View dowloadExcel(@PathVariable("start") Date date,@PathVariable("end") Date end,Model model) {
		Timestamp convertStart=new Timestamp(date.getTime());
		Timestamp convertEnd=new Timestamp(date.getTime());
		List<Post> listPostDate=postService.findAllByCreatedAtBetween(convertStart, convertEnd);
		model.addAttribute("listdate", listPostDate);
		return new AdminPostExcel();
	}

}
