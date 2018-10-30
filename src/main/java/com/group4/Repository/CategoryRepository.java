package com.group4.Repository;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.group4.entity.Category;
import com.group4.entity.User;

import java.lang.String;
import java.util.List;


public interface CategoryRepository extends CrudRepository<Category, UUID> , PagingAndSortingRepository<Category, UUID> {
	List<Category> findByName(String name);
	
	
}
