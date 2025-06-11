package com.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entities.Prestamo;

public interface IPrestamoDao extends JpaRepository<Prestamo, Integer> {
    Optional<Prestamo> findById(Integer id);
    List<Prestamo> findByStatus(Short status);
}