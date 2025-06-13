package com.springboot.app.models.services;



import java.util.List;
import java.util.Optional;

import com.springboot.app.models.dtos.AutorDTO;
import com.springboot.app.models.entities.Autor;

public interface IAutorService {

	Optional<AutorDTO> findById(Integer id);
	
	List<AutorDTO> findByStatus(Short status);
	
	Autor save(Autor autor);
	
	Autor save(AutorDTO autorDTO) ;
	
	Optional<AutorDTO> update(AutorDTO autorDTO) ;
	
	List<AutorDTO> getAll();
	
	Optional<AutorDTO> findByNombre(String nombre);
}
