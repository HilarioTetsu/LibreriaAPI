package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.IPaisDao;
import com.springboot.app.models.entities.Pais;

@Service
public class PaisServiceImpl implements IPaisService {
    @Autowired
    private IPaisDao paisDao;

    @Override
    public Optional<Pais> findById(Short id) {
        return paisDao.findById(id);
    }

    @Override
    public List<Pais> findByStatus(Short status) {
        return paisDao.findByStatus(status);
    }
}