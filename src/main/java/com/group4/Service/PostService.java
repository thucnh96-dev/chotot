package com.group4.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.group4.entity.*;

public interface PostService {
	Page<Post> findAll(Pageable pageable);

	Optional<Post> findById(UUID id);

	Post save(Post p);

    void deleteById(UUID id);
    List<Post> findAllByUser(User user);
    Page<Post> findAllByIsAcceptTrue(Pageable pageable);
    Page<Post> findAllByIsAcceptFalse(Pageable pageable);
}
