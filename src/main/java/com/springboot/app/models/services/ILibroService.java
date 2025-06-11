package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Libro;

public interface ILibroService {
    Optional<Libro> findById(Integer id);
    List<Libro> findByStatus(Short status);
}