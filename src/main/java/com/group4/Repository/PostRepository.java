package com.group4.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.Post;
import com.group4.entity.SubCategory;
import com.group4.entity.Address;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
	Post findByTitle(String title);

	List<Post> findBySubCategory(SubCategory subcategory);
	List<Post> findByAddress(Address address);
}
