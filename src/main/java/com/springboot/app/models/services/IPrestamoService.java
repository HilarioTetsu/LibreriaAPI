package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Prestamo;

public interface IPrestamoService {
    Optional<Prestamo> findById(Integer id);
    List<Prestamo> findByStatus(Short status);
}