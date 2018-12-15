package com.group4.admin.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.group4.Heper.NullCheckHepper;

public abstract class AdminAbtractController {
	static NullCheckHepper nullcheck=new NullCheckHepper();
protected PageRequest postActive(int page,int size) {
	return PageRequest.of(page, size, Sort.Direction.DESC, "id");
}
protected PageRequest postUnActive(int page,int size) {
	return PageRequest.of(page, size, Sort.Direction.DESC, "id");
}
protected PageRequest user(int page,int size) {
	return PageRequest.of(page, size, Sort.Direction.DESC, "createdAt");
}
}
