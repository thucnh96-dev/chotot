package com.group4.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.Repository.WardRepository;
import com.group4.Service.WardService;
import com.group4.entity.Distric;
import com.group4.entity.Ward;

@Service
public class wardServiceImpl implements WardService{
	@Autowired
	WardRepository wardRepository;

	@Override
	public List<Ward> findAll() {
		return  wardRepository.findAll();
	}

	@Override
	public List<Ward> findByDistrict(Distric distric) {
		// TODO Auto-generated method stub
		return wardRepository.findByDistric(distric);
	}

	



}
