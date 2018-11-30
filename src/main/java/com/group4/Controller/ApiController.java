package com.group4.Controller;

import java.util.ArrayList;
import java.util.Iterator;
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
import com.group4.entity.Reponse;
import com.group4.entity.Ward;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	WardService wardService;
	@Autowired
	DistrictService districtService;

	@GetMapping("/city/{id}/districts")
	public List<Reponse> getDistrictByCity(@PathVariable int id) {
		City city = new City();
		city.setId(id);
		List<Distric> districs = districtService.findByCity(city);
		List<Reponse> district = new ArrayList<>();
		for (int i = 0; i < districs.size(); i++) {
			Reponse repon = new Reponse();
			repon.setId(districs.get(i).getId());
			repon.setName(districs.get(i).getPrefix() +" "+ districs.get(i).getName());
			district.add(repon);
		}
		return district;
	}

	@GetMapping("/district/{id}/wards")
	public List<Reponse> getwardsByDistric(@PathVariable int id) {
		Distric distric = new Distric();
		distric.setId(id);
		List<Ward> wardArr = wardService.findByDistrict(distric);
		List<Reponse> wards = new ArrayList<>();
		for (int i = 0; i < wardArr.size(); i++) {
			Reponse repon = new Reponse();
			repon.setId(wardArr.get(i).getId());
			repon.setName(wardArr.get(i).getPrefix() +" "+ wardArr.get(i).getName());
			wards.add(repon);
		}
		return wards;
	}
}
