package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Pais;

public interface IPaisService {
    Optional<Pais> findById(Short id);
    List<Pais> findByStatus(Short status);
}