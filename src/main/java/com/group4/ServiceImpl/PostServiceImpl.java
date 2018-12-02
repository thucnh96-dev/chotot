package com.group4.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.group4.Repository.AdressRepository;
import com.group4.Repository.PostRepository;
import com.group4.Service.PostService;
import com.group4.entity.Address;
import com.group4.entity.Post;
import com.group4.entity.User;
@Service
public class PostServiceImpl implements PostService{
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private AdressRepository adressRepository;
	
	@Override
	public Optional<Post> findById(UUID id) {
		
		return postRepository.findById(id);
	}

	@Override
	public Post save(Post p) {
		return postRepository.save(p);
	}

	@Override
	public void deleteById(UUID id) {
		postRepository.deleteById(id);
		
	}

	

	@Override
	public Page<Post> findAll(Pageable pageable) {
		
		return postRepository.findAll(pageable);
	}

	@Override
	public List<Post> findAllByUser(User user) {
	
		return postRepository.findAllByUser(user);
	}

	@Override
	public Page<Post> findAllByIsAcceptTrue(Pageable pageable) {	
		return postRepository.findAllByIsAcceptTrue(pageable);
	}

	@Override
	public Page<Post> findAllByIsAcceptFalse(Pageable pageable) {
		// TODO Auto-generated method stub
		return postRepository.findAllByIsAcceptFalse(pageable);
	}

	

}
