package com.group4.api.controller;

import java.io.IOException;
import java.lang.ref.PhantomReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.group4.Heper.FileStorageService;
import com.group4.Service.PostPhotoService;
import com.group4.Service.PostService;
import com.group4.entity.Post;
import com.group4.entity.PostPhoto;
import com.group4.untils.AppConstants;


@RestController
@RequestMapping(value="/user/api/post")
public class PostAPI {
	@Autowired
	PostService postService;
	@Autowired
	FileStorageService   fileStorageService;
	@Autowired
	PostPhotoService  postPhotoService;
	
	ObjectMapper mapper=new ObjectMapper();
	@GetMapping(value="/new", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ApiReponse createPosts
	(
			@RequestParam(value=AppConstants.POST_JSON_PARAM,required=true) String postjson,
			@RequestParam(value=AppConstants.POST_FILE_PARAM ,required=true) MultipartFile[] file,
			PostPhoto postPhoto
	) throws JsonParseException, JsonMappingException, IOException {
		String fileName = null;
		for (MultipartFile upload: file) {
//			fileName = fileStorageService.storeFile(file);
		}			
		Post post=mapper.readValue(postjson, Post.class);
		postService.save(post);
		postPhoto.setPost(post);
		postPhoto.setName(fileName);
		postPhotoService.save(postPhoto);
		return new ApiReponse(AppConstants.SUCCESS_MSG, AppConstants.SUCCESS_CODE);
	}

}
