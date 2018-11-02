package com.group4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.Distric;
@Repository
public interface DistricRepository extends JpaRepository<Distric, Integer> {
}
