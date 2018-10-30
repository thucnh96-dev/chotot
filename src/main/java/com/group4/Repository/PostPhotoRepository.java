package com.group4.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.PostPhoto;
@Repository
public interface PostPhotoRepository extends JpaRepository<PostPhoto, UUID> {

}
