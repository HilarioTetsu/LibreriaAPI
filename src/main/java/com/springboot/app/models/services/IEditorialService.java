package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Editorial;

public interface IEditorialService {

	Optional<Editorial> findById(Integer id);
	
	List<Editorial> findByStatus(Integer status);
	
}
