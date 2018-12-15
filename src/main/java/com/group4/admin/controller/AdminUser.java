package com.group4.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.group4.Service.UserService;
import com.group4.entity.User;
import com.group4.spec.UserSpec;

@Controller
@RequestMapping(value="/admin/user")
public class AdminUser extends AdminAbtractController{
@Autowired
UserService userService;
	
	@GetMapping(value="")
	public String home(@RequestParam HashMap<String, Object> res, Model mm) {
		int page = res.get("page") == null ? 0 : Integer.parseInt(res.get("page").toString());
		int size = res.get("size") == null ? 10 : Integer.parseInt(res.get("size").toString());
		int searchCnt = nullcheck.intCheck(res, "searchCnt");
		String text = nullcheck.stringCheck(res, "text");
		if (searchCnt > 0)
			size = searchCnt;
		Page<User> findAll=userService.findAll(UserSpec.likeTitle(text), this.user(page, size));
		List<User> datas=findAll.getContent();
		mm.addAttribute("data", findAll);
		mm.addAttribute("datas", datas);
		return "admin/user/list";
	}
}
