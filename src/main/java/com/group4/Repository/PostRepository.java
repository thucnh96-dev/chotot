package com.group4.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
Post findByTitle(String title);
}
