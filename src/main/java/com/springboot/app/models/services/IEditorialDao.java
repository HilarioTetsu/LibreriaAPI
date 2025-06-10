package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entities.Editorial;

public interface IEditorialDao extends JpaRepository<Editorial, Integer>{

	Optional<Editorial> findById(Integer id);
	
	List<Editorial> findByStatus(Integer status);
	
	
}
