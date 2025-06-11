package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.TipoOperacion;

public interface ITipoOperacionService {
    Optional<TipoOperacion> findById(Short id);
    List<TipoOperacion> findByStatus(Short status);
}