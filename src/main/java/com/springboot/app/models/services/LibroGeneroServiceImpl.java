package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.ILibroGeneroDao;
import com.springboot.app.models.entities.LibroGenero;

@Service
public class LibroGeneroServiceImpl implements ILibroGeneroService {
    @Autowired
    private ILibroGeneroDao libroGeneroDao;

    @Override
    public Optional<LibroGenero> findById(Integer id) {
        return libroGeneroDao.findById(id);
    }

    @Override
    public List<LibroGenero> findByStatus(Short status) {
        return libroGeneroDao.findByStatus(status);
    }
}