package com.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.models.entities.Autor;

import java.util.List;
import java.util.Optional;


public interface IAutorDao extends JpaRepository<Autor, Integer>{

	Optional<Autor> findById(Integer id);
	
	List<Autor> findByStatus(Short status);
	
}
