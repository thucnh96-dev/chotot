package com.group4.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.group4.entity.Post;
import com.group4.entity.PostPhoto;

public interface PostPhotoService {
	Optional<PostPhoto> findById(UUID id);

	void save(PostPhoto postPhoto);

	void delete(UUID uuid);

	List<PostPhoto> findByPost(Post post);

}
