package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.ILibroDao;
import com.springboot.app.models.entities.Libro;

@Service
public class LibroServiceImpl implements ILibroService {
    @Autowired
    private ILibroDao libroDao;

    @Override
    public Optional<Libro> findById(Integer id) {
        return libroDao.findById(id);
    }

    @Override
    public List<Libro> findByStatus(Short status) {
        return libroDao.findByStatus(status);
    }
}