package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.LibroAutor;

public interface ILibroAutorService {
    Optional<LibroAutor> findById(Integer id);
    List<LibroAutor> findByStatus(Short status);
}