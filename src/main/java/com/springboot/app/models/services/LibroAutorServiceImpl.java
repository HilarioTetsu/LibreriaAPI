package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.ILibroAutorDao;
import com.springboot.app.models.entities.LibroAutor;

@Service
public class LibroAutorServiceImpl implements ILibroAutorService {
    @Autowired
    private ILibroAutorDao libroAutorDao;

    @Override
    public Optional<LibroAutor> findById(Integer id) {
        return libroAutorDao.findById(id);
    }

    @Override
    public List<LibroAutor> findByStatus(Short status) {
        return libroAutorDao.findByStatus(status);
    }
}