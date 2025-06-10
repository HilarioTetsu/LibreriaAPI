package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.app.models.entities.Genero;

public class GeneroServiceImpl implements IGeneroService {

	@Autowired
	private IGeneroDao generoDao;
	
	@Override
	public Optional<Genero> findById(Short id) {
		// TODO Auto-generated method stub
		return generoDao.findById(id);
	}

	@Override
	public List<Genero> findByStatus(Short status) {
		// TODO Auto-generated method stub
		return generoDao.findByStatus(status);
	}

}
