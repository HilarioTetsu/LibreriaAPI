package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import com.springboot.app.models.entities.Cliente;

public interface IClienteService {
	
	Optional<Cliente> findById(Integer id);
	
	List<Cliente> findByStatus(Integer status);
	
	List<Cliente> getClientesActivosYPrestamoDisponible(Integer status);
}
