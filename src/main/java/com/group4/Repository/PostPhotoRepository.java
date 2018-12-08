package com.group4.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.PostPhoto;
import com.group4.entity.Post;
import java.util.List;
@Repository
public interface PostPhotoRepository extends JpaRepository<PostPhoto, UUID> {
List<PostPhoto> findByPost(Post post);
}
