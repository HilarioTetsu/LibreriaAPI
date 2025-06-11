package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.IPrestamoDao;
import com.springboot.app.models.entities.Prestamo;

@Service
public class PrestamoServiceImpl implements IPrestamoService {
    @Autowired
    private IPrestamoDao prestamoDao;

    @Override
    public Optional<Prestamo> findById(Integer id) {
        return prestamoDao.findById(id);
    }

    @Override
    public List<Prestamo> findByStatus(Short status) {
        return prestamoDao.findByStatus(status);
    }
}