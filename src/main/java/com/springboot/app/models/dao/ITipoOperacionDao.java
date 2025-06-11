package com.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entities.TipoOperacion;

public interface ITipoOperacionDao extends JpaRepository<TipoOperacion, Short> {
    Optional<TipoOperacion> findById(Short id);
    List<TipoOperacion> findByStatus(Short status);
}