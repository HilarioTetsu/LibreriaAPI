package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.LibroGenero;

public interface ILibroGeneroService {
    Optional<LibroGenero> findById(Integer id);
    List<LibroGenero> findByStatus(Short status);
}