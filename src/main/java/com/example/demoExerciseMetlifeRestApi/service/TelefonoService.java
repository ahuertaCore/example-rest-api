package com.example.demoExerciseMetlifeRestApi.service;

import com.example.demoExerciseMetlifeRestApi.dao.ITelefonoDao;
import com.example.demoExerciseMetlifeRestApi.entity.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TelefonoService implements ITelefonoService {
    @Autowired
    private ITelefonoDao catalogoDao;

    @Override
    @Transactional
    public Telefono save(Telefono obj){
        return catalogoDao.save(obj);
    }

    @Override
    @Transactional
    public List<Telefono> findAll(){
        List<Telefono> nuevaList = new ArrayList<>();
        Iterable<Telefono> iterableList = catalogoDao.findAll();
        iterableList.forEach(nuevaList::add);
        return  nuevaList;
    }
}
