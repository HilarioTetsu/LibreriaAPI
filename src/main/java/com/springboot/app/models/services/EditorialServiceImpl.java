package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.entities.Editorial;

@Service
public class EditorialServiceImpl implements IEditorialService{

	@Autowired
	private IEditorialDao editorialDao;
	
	
	@Override
	public Optional<Editorial> findById(Integer id) {
		// TODO Auto-generated method stub
		return editorialDao.findById(id);
	}

	@Override
	public List<Editorial> findByStatus(Integer status) {
		
		
		return editorialDao.findByStatus(status);
	}

}
