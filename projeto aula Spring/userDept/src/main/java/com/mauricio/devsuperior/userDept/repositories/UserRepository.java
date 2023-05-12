package com.mauricio.devsuperior.userDept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauricio.devsuperior.userDept.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {
		
}
