package com.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entities.LibroAutor;

public interface ILibroAutorDao extends JpaRepository<LibroAutor, Integer> {
    Optional<LibroAutor> findById(Integer id);
    List<LibroAutor> findByStatus(Short status);
}