package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.models.entities.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Integer>{
	
	Optional<Cliente> findById(Integer id);
	
	List<Cliente> findByStatus(Integer status);
	
	List<Cliente> findByStatusAndAutorizacionPrestamoIsTrue(Integer status);

}
