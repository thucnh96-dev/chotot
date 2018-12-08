package com.group4.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.group4.Repository.UserRepository;
import com.group4.Service.UserService;
import com.group4.entity.User;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Optional<User> findById(UUID id) {
		
		return userRepository.findById(id);
	}

	@Override
	public User save(User p) {
		
		return userRepository.save(p);
	}

	@Override
	public void deleteById(UUID id) {
	userRepository.deleteById(id);
		
	}

	@Override
	public List<User> findByName(String name) {
		
		return userRepository.findByName(name);
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		
		return userRepository.findAll(pageable);
	}

	@Override
	public User findByemail(String email) {
		User u=userRepository.findByEmail(email);
		return u;
	}

	@Override
	public User findByToken(String token) {
		User u=userRepository.findByToken(token);
		return u;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> findByPhone(String phone) {
		// TODO Auto-generated method stub
		return userRepository.findByPhone(phone);
	}

	

}
