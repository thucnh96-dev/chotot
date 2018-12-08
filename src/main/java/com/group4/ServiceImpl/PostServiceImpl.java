package com.group4.ServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.group4.Repository.AdressRepository;
import com.group4.Repository.CityRepository;
import com.group4.Repository.DistricRepository;
import com.group4.Repository.PostRepository;
import com.group4.Repository.SubCategoryRepository;
import com.group4.Repository.WardRepository;
import com.group4.Service.PostService;
import com.group4.entity.Address;
import com.group4.entity.Category;
import com.group4.entity.City;
import com.group4.entity.Distric;
import com.group4.entity.Post;
import com.group4.entity.SubCategory;

import com.group4.entity.User;
import com.group4.entity.Ward;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private SubCategoryRepository subCategoryRepository;
	@Autowired
	private AdressRepository addressReposity;
	@Autowired
	private DistricRepository districtReposity;
	@Autowired
	private WardRepository wardRepository;
	@Autowired
	private CityRepository cityRepository;

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

	@Override
	public List<Post> findAllByCreatedAtBetween(Date start, Date end) {
		// TODO Auto-generated method stub
		return postRepository.findAllByCreatedAtBetween(start, end);
	}

	@Override
	public Page<Post> findAllByUserAndIsAcceptTrue(User user, Pageable pageable) {
		// TODO Auto-generated method stub
		return postRepository.findAllByUserAndIsAcceptTrue(user, pageable);
	}

	@Override
	public Page<Post> findAllByUserAndIsAcceptFalse(User user, Pageable pageable) {
		// TODO Auto-generated method stub
		return postRepository.findAllByUserAndIsAcceptFalse(user, pageable);
	}

	@Override
	public Page<Post> findAllByUser(User user, Specification<Post> spec, Pageable pageable) {
		// TODO Auto-generated method stub
		return postRepository.findAllByUser(user, spec, pageable);
	}

	@Override
	public Page<Post> findAll(Specification<Post> spec, Pageable pageable) {
		// TODO Auto-generated method stub
		return postRepository.findAll(spec, pageable);
	}

	@Override
	public Page<Post> findAllByUser(User user, Pageable pageable) {
		// TODO Auto-generated method stub
		return postRepository.findAllByUser(user, pageable);
	}

	@Override
<<<<<<< HEAD

=======
>>>>>>> feature/trantuyen
	public long count() {
		// TODO Auto-generated method stub
		return postRepository.count();
	}

<<<<<<< HEAD


	

=======

	
>>>>>>> feature/trantuyen
	public List<Post> search(String text, int city, int district, int wrad, UUID cate, UUID subcate) {
		List<Post> posts = new ArrayList<>();
		List<UUID> postIds = new ArrayList<>();
		boolean isReturn = false;
		if (city != 0 & district == 0 & wrad == 0) {
			posts = postRepository.findAllByCity(city);
			isReturn = true;
		}
		if (district != 0 & city != 0) {
			posts = postRepository.findAllByDistrict(district);
			isReturn = true;
		}

		if (wrad != 0) {
			isReturn = true;
			posts = postRepository.findAllByward(wrad);
		}
		if (cate != null & subcate == null) {
			isReturn = true;
			posts.addAll(postRepository.findAllByCategory(cate));
		}
		if (subcate != null) {
			isReturn = true;
			SubCategory subCategory = new SubCategory();
			subCategory.setId(subcate);
			posts.addAll(postRepository.findBySubCategory(subCategory));
		}
		for (int i = 0; i < posts.size(); i++) {
			postIds.add(posts.get(i).getId());
		}
		if (postIds.size() == 0 & isReturn == false) {
			posts = postRepository.findAllByTitle(text);
			return posts;
		}
		posts = postRepository.findAllByTitle(text, postIds);System.out.println(posts.size());
		return posts;
	}

	@Override
	public Page<Post> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return null;
	}

=======
		return postRepository.findAll(pageable);
	}
>>>>>>> feature/trantuyen

}
