package com.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entities.Operacion;

public interface IOperacionDao extends JpaRepository<Operacion, Integer> {
    Optional<Operacion> findById(Integer id);
    List<Operacion> findByStatus(Short status);
}