package com.group4.Repository;


import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.Post;
import com.group4.entity.User;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
Post findByTitle(String title);
List<Post> findAllByUser(User user);
Page<Post>findAllByUser( User user,Specification<Post> spec,Pageable pageable);
Page<Post>findAllByUser( User user,Pageable pageable);
Page<Post> findAll(Pageable pageable);
Page<Post> findAll(Specification<Post> spec, Pageable pageable);
Page<Post> findAllByUserAndIsAcceptTrue(User user,Pageable pageable);
Page<Post> findAllByUserAndIsAcceptFalse(User user,Pageable pageable);
Page<Post> findAllByIsAcceptTrue(Pageable pageable);
Page<Post> findAllByIsAcceptFalse(Pageable pageable);
List<Post> findAllByCreatedAtBetween(Date start,Date end);
}
