package com.example.demoExerciseMetlifeRestApi.service;

import com.example.demoExerciseMetlifeRestApi.entity.Telefono;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ITelefonoService {
    @Transactional
    Telefono save(Telefono obj);

    @Transactional
    List<Telefono> findAll();
}
