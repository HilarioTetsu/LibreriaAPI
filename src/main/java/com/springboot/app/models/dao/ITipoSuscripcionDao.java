package com.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entities.TipoSuscripcion;

public interface ITipoSuscripcionDao extends JpaRepository<TipoSuscripcion, Integer> {
    Optional<TipoSuscripcion> findById(Integer id);
    List<TipoSuscripcion> findByStatus(Short status);
}