package com.group4.Service;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.group4.entity.Category;

public interface CategoryService {
	List<Category> findAll();

	Optional<Category> findById(UUID id);

	Category save(Category p);

    void deleteById(UUID id);

    List<Category> findByName(String name);
}
