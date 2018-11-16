package com.group4.ServiceImpl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.Repository.PostPhotoRepository;
import com.group4.Service.PostPhotoService;
import com.group4.entity.PostPhoto;
@Service
public class PostPhotoServiceImpl implements PostPhotoService {
	@Autowired
	PostPhotoRepository postPhotoRepository ;

	@Override
	public Optional<PostPhoto> findById(UUID id) {
		
		return postPhotoRepository.findById(id);
	}
	@Override
	public void save(PostPhoto postPhoto) {
		postPhotoRepository.save(postPhoto);
		
	}

	@Override
	public void delete(UUID uuid) {
		postPhotoRepository.deleteById(uuid);
		
	}

}
