package com.springboot.app.models.services;



import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Autor;

public interface IAutorService {

	Optional<Autor> findById(Integer id);
	
	List<Autor> findByStatus(Short status);
	
}
