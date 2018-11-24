package com.group4.Service;

import java.util.List;
import java.util.Optional;

import com.group4.entity.City;

public interface CityService {
	List<City> findAll();

	Optional<City> findById(int id);

}
