package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springboot.app.models.entities.Idioma;

public interface IIdiomaDao extends JpaRepository<Idioma, Short> {

	Optional<Idioma> findById(Short id);

	List<Idioma> findByStatus(Short status);

}
