package com.group4.Service;

import java.util.List;

import com.group4.entity.City;
import com.group4.entity.Distric;

public interface DistrictService {
	List<Distric> findAll();

	List<Distric>  findByCity(City city);
}
