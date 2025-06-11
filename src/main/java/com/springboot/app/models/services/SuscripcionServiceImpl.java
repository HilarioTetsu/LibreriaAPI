package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.ISuscripcionDao;
import com.springboot.app.models.entities.Suscripcion;

@Service
public class SuscripcionServiceImpl implements ISuscripcionService {
    @Autowired
    private ISuscripcionDao suscripcionDao;

    @Override
    public Optional<Suscripcion> findById(Integer id) {
        return suscripcionDao.findById(id);
    }

    @Override
    public List<Suscripcion> findByStatus(Short status) {
        return suscripcionDao.findByStatus(status);
    }
}