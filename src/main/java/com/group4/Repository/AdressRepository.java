package com.group4.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.Address;
import com.group4.entity.Ward;
import java.util.List;
@Repository
public interface AdressRepository extends JpaRepository<Address, UUID> {
	List<Address> findByWard(Ward ward);
//	findby
}
