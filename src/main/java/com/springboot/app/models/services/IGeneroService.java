package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Genero;

public interface IGeneroService {

	Optional<Genero> findById(Short id);
	
	List<Genero> findByStatus(Short status);
	
}
