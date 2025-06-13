package com.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.models.entities.Autor;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAutorDao extends JpaRepository<Autor, Integer>{

	Optional<Autor> findById(Integer id);
	
	Optional<Autor> findByNombre(String nombre);
	
	List<Autor> findByStatus(Short status);
	
}
