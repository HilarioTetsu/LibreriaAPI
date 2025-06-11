package com.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entities.Libro;

public interface ILibroDao extends JpaRepository<Libro, Integer> {
    Optional<Libro> findById(Integer id);
    List<Libro> findByStatus(Short status);
}