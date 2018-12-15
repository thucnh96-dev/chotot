package com.group4.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.Repository.DistricRepository;
import com.group4.Service.DistrictService;
import com.group4.entity.City;
import com.group4.entity.Distric;

@Service
public class DistrictServiceImpl implements DistrictService{
@Autowired
DistricRepository districRepository;
	@Override
	public List<Distric> findAll() {
		
		return districRepository.findAll();
	}
	@Override
	public List<Distric> findByCity(City city) {
		// TODO Auto-generated method stub
		return districRepository.findByCity(city);
	}

	


}
