package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Idioma;

public interface IIdiomaService {

	Optional<Idioma> findById(Short id);

	List<Idioma> findByStatus(Short status);
	
}
