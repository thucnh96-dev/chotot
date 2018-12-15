package com.group4.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.Repository.CityRepository;
import com.group4.Service.CityService;
import com.group4.entity.City;

@Service
public class CityServiceImpl implements CityService{
@Autowired
CityRepository cityRepository;
	@Override
	public List<City> findAll() {
		
		return cityRepository.findAll();
	}

	@Override
	public Optional<City> findById(int id) {
		
		return cityRepository.findById(id);
	}
	

}
