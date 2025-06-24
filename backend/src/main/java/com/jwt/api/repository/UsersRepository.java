package com.jwt.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.api.entity.OurUsers;

public interface UsersRepository extends JpaRepository<OurUsers, Integer>{
	
	Optional<OurUsers> findByEmail(String email);

}
