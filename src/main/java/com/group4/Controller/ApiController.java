package com.group4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group4.Service.CityService;
import com.group4.Service.DistrictService;
import com.group4.Service.WardService;
import com.group4.entity.City;
import com.group4.entity.Distric;
import com.group4.entity.Ward;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	WardService wardService;
	@Autowired
	DistrictService districtService;



	@GetMapping("/city/{id}/districts")
	public List<Distric> getDistrictByCity(@PathVariable int id) {
		City city = new City();
		city.setId(id);
		List<Distric> districs = districtService.findByCity(city);
		return districs;
	}

	@GetMapping("/district/{id}/wards")
	public List<Ward> getwardsByDistric(@PathVariable int id) {
		Distric distric = new Distric();
		distric.setId(id);
		List<Ward> wards = wardService.findByDistrict(distric);
		return wards;
	}
}
