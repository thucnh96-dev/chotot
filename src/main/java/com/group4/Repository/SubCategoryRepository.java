package com.group4.Repository;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.group4.entity.SubCategory;

import java.lang.String;
import java.util.List;
import com.group4.entity.Category;


public interface SubCategoryRepository extends CrudRepository<SubCategory, UUID> , PagingAndSortingRepository<SubCategory, UUID> {
	List<SubCategory> findByName(String name);

	List<SubCategory> findByCategory(Category category);
	  
}
