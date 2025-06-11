package com.springboot.app.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.IOperacionDao;
import com.springboot.app.models.entities.Operacion;

@Service
public class OperacionServiceImpl implements IOperacionService {
    @Autowired
    private IOperacionDao operacionDao;

    @Override
    public Optional<Operacion> findById(Integer id) {
        return operacionDao.findById(id);
    }

    @Override
    public List<Operacion> findByStatus(Short status) {
        return operacionDao.findByStatus(status);
    }
}