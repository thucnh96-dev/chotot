package com.group4.Service;

import java.util.List;

import com.group4.entity.Distric;
import com.group4.entity.Ward;


public interface WardService {
	List<Ward> findAll();

	List<Ward> findByDistrict(Distric distric);
}
