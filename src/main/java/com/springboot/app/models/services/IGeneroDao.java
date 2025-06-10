package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.models.entities.Genero;

public interface IGeneroDao extends JpaRepository<Genero, Short>{

	Optional<Genero> findById(Short id);
	
	List<Genero> findByStatus(Short status);
	
}
