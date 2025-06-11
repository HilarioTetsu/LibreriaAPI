package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.app.models.dao.IIdiomaDao;
import com.springboot.app.models.entities.Idioma;

public class IdiomaServiceImpl implements IIdiomaService {

	
	@Autowired
	private IIdiomaDao idiomaDao;
	
	@Override
	public Optional<Idioma> findById(Short id) {
		// TODO Auto-generated method stub
		return idiomaDao.findById(id);
	}

	@Override
	public List<Idioma> findByStatus(Short status) {
		// TODO Auto-generated method stub
		return idiomaDao.findByStatus(status);
	}

}
