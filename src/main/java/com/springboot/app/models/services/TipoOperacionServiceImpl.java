package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.ITipoOperacionDao;
import com.springboot.app.models.entities.TipoOperacion;

@Service
public class TipoOperacionServiceImpl implements ITipoOperacionService {
    @Autowired
    private ITipoOperacionDao tipoOperacionDao;

    @Override
    public Optional<TipoOperacion> findById(Short id) {
        return tipoOperacionDao.findById(id);
    }

    @Override
    public List<TipoOperacion> findByStatus(Short status) {
        return tipoOperacionDao.findByStatus(status);
    }
}