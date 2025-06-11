package com.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entities.Suscripcion;

public interface ISuscripcionDao extends JpaRepository<Suscripcion, Integer> {
    Optional<Suscripcion> findById(Integer id);
    List<Suscripcion> findByStatus(Short status);
}