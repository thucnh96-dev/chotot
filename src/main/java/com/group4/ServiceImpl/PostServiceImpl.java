package com.group4.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.group4.Repository.AdressRepository;
import com.group4.Repository.PostRepository;
import com.group4.Repository.SubCategoryRepository;
import com.group4.Service.PostService;
import com.group4.entity.Category;
import com.group4.entity.Post;
import com.group4.entity.SubCategory;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private SubCategoryRepository subCategoryRepository;

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
	public List<Post> findAll() {

		return postRepository.findAll();
	}

	@Override
	public List<List<Post>> findByCategory(UUID id, Pageable pageable) {
		List<List<Post>> posts = new ArrayList<>();
		Category category = new Category();
		category.setId(id);
		List<SubCategory> subCategories = subCategoryRepository.findByCategory(category);
		for (int i = 0; i < subCategories.size(); i++) {
			posts.add(postRepository.findBySubCategory(subCategories.get(i)));
		}
		return posts;
	}

}
