package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Operacion;

public interface IOperacionService {
    Optional<Operacion> findById(Integer id);
    List<Operacion> findByStatus(Short status);
}