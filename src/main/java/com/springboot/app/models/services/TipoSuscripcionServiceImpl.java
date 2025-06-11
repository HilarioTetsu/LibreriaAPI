package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.ITipoSuscripcionDao;
import com.springboot.app.models.entities.TipoSuscripcion;

@Service
public class TipoSuscripcionServiceImpl implements ITipoSuscripcionService {
    @Autowired
    private ITipoSuscripcionDao tipoSuscripcionDao;

    @Override
    public Optional<TipoSuscripcion> findById(Integer id) {
        return tipoSuscripcionDao.findById(id);
    }

    @Override
    public List<TipoSuscripcion> findByStatus(Short status) {
        return tipoSuscripcionDao.findByStatus(status);
    }
}