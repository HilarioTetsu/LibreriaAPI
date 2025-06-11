package com.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entities.LibroGenero;

public interface ILibroGeneroDao extends JpaRepository<LibroGenero, Integer> {
    Optional<LibroGenero> findById(Integer id);
    List<LibroGenero> findByStatus(Short status);
}