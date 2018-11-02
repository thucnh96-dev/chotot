package com.group4.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.Address;
@Repository
public interface AdressRepository extends JpaRepository<Address, UUID> {
	
}
