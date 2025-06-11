package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Suscripcion;

public interface ISuscripcionService {
    Optional<Suscripcion> findById(Integer id);
    List<Suscripcion> findByStatus(Short status);
}