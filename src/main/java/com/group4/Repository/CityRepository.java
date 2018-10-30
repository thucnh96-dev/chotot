package com.group4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.City;


@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
City findByName(String name);
}
