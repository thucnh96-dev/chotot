package com.group4.Repository;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
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
<<<<<<< HEAD
	User findByPhone(String phone);
	@Query(value="select u.* from user_role ur ,role r,user u where ur.user_id=u.id and ur.role_id=r.id and r.id=2;",nativeQuery=true)
	List<User>findByRolesIsAdmin();
	Page<User> findAll(Specification<User>spec,Pageable pageable);
=======
	List<User> findByPhone(String phone);
>>>>>>> feature/trantuyen
	
	
}
