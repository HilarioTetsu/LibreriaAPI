package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.entities.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	public Optional<Cliente> findById(Integer id) {
		
		return clienteDao.findById(id);
	}

	@Override
	public List<Cliente> findByStatus(Integer status) {
		
		return null;
	}

	@Override
	public List<Cliente> getClientesActivosYPrestamoDisponible(Integer status) {
		
		return clienteDao.findByStatusAndAutorizacionPrestamoIsTrue(status);
	}

}
