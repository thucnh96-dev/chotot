package com.group4.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group4.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
