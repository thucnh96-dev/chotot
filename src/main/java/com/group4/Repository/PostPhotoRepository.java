package com.group4.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.group4.entity.PostPhoto;
import com.group4.entity.Post;
import java.util.List;

@Repository
public interface PostPhotoRepository extends JpaRepository<PostPhoto, UUID> {
	List<PostPhoto> findByPost(Post post);

	@Query(value = "DELETE FROM post_photo WHERE id= ?1", nativeQuery = true)
	@Modifying
	@Transactional
	void delete(UUID id);
}
