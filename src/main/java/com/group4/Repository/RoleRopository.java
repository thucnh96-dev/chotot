package com.group4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.Role;
@Repository
public interface RoleRopository extends JpaRepository<Role, Integer> {
Role findByName(String name);
}
