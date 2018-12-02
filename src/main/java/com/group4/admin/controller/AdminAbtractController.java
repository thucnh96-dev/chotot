package com.group4.admin.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public abstract class AdminAbtractController {
protected PageRequest postActive(int page,int size) {
	return PageRequest.of(page, size, Sort.Direction.DESC, "id");
}
}
