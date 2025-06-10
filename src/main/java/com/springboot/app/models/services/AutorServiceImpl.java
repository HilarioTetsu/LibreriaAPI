package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.IAutorDao;
import com.springboot.app.models.entities.Autor;

@Service
public class AutorServiceImpl implements IAutorService{

	@Autowired
	private IAutorDao autorDao;
	

	@Override
	public Optional<Autor> findById(Integer id) {

		return autorDao.findById(id);
	}


	@Override
	public List<Autor> findByStatus(Short status) {
		
		return autorDao.findByStatus(status);
	}
}
