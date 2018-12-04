package com.group4.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.domain.Pageable;

import com.group4.entity.*;

public interface PostService {
	List<Post> findAll();

	Optional<Post> findById(UUID id);

	Post save(Post p);

	void deleteById(UUID id);

	List<List<Post>> findByCategory(UUID id, Pageable pageable);
}
