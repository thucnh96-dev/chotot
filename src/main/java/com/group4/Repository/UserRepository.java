package com.group4.Repository;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;


import com.group4.entity.User;

import java.lang.String;
import java.util.List;


public interface UserRepository extends CrudRepository<User, UUID> , PagingAndSortingRepository<User, UUID> {
	List<User> findByName(String name);
	
	
}
