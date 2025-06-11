package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.TipoSuscripcion;

public interface ITipoSuscripcionService {
    Optional<TipoSuscripcion> findById(Integer id);
    List<TipoSuscripcion> findByStatus(Short status);
}