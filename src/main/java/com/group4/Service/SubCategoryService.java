package com.group4.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.group4.entity.*;

public interface SubCategoryService {
	Page<SubCategory> findAll(Pageable pageable);

	List<SubCategory> findAll();

	Optional<SubCategory> findById(UUID id);

	SubCategory save(SubCategory p);

	void deleteById(UUID id);

	List<SubCategory> findByName(String name);

	List<SubCategory> findByCategory(Category category);

}
