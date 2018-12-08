package com.group4.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.group4.entity.Category;
import com.group4.entity.SubCategory;
import com.group4.Repository.*;
import com.group4.Service.SubCategoryService;
@Service
public class SubCategoryServiceImpl implements SubCategoryService{
	@Autowired
	private SubCategoryRepository subCategoryRepository;
	
	@Override
	public Optional<SubCategory> findById(UUID id) {
		
		return subCategoryRepository.findById(id);
	}

	@Override
	public SubCategory save(SubCategory p) {
		
		return subCategoryRepository.save(p);
	}

	@Override
	public void deleteById(UUID id) {
		subCategoryRepository.deleteById(id);
		
	}

	@Override
	public List<SubCategory> findByName(String name) {
		
		return subCategoryRepository.findByName(name);
	}

	@Override
	public Page<SubCategory> findAll(Pageable pageable) {
		
		return subCategoryRepository.findAll(pageable);
	}

	@Override
	public List<SubCategory> findAll() {
		// TODO Auto-generated method stub
		return (List<SubCategory>) subCategoryRepository.findAll();
	}

	@Override
<<<<<<< HEAD
	public long count() {
		// TODO Auto-generated method stub
		return subCategoryRepository.count();
=======
	public List<SubCategory> findByCategory(Category category) {
		// TODO Auto-generated method stub
		return subCategoryRepository.findByCategory(category);
>>>>>>> feature/trantuyen
	}

	

}
