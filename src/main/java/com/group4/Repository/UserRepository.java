package com.group4.Repository;
import java.util.UUID;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.User;

import java.lang.String;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> , PagingAndSortingRepository<User, UUID> {
	List<User> findByName(String name);
	User findByUsername(String username);
	User findByToken(String token);
	User findByEmail(String token);
	
	
}
