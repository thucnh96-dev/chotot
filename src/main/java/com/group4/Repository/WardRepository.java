package com.group4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.Distric;
import com.group4.entity.Ward;
import java.util.List;
import com.group4.entity.City;
@Repository
public interface WardRepository extends JpaRepository<Ward, Integer> {

	Distric findByName(String name);
	List<Ward> findByDistric(Distric distric);
	List<Ward> findByCity(City city);
//	findby
}
