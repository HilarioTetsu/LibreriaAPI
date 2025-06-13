package com.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.models.entities.Pais;

@Repository
public interface IPaisDao extends JpaRepository<Pais, Short> {
    Optional<Pais> findById(Short id);
    List<Pais> findByStatus(Short status);
}