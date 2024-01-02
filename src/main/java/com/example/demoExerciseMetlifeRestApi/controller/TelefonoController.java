package com.example.demoExerciseMetlifeRestApi.controller;

import com.example.demoExerciseMetlifeRestApi.entity.Telefono;
import com.example.demoExerciseMetlifeRestApi.service.ITelefonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {

    @Autowired
    ITelefonoService catalogoService;

    @GetMapping("/test")
    public String test(){
        return "prueba";
    }


    @GetMapping("/findAll")
    public ResponseEntity<List<Telefono>> findAll(){
        try{
            List<Telefono> lista = catalogoService.findAll();
            if(lista.size()>0) {
                return ResponseEntity.status(200).body(lista);
            }else{
                return ResponseEntity.status(404).body(lista);
            }
        }
        catch (Exception e){
            return ResponseEntity.status(500).body(null);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Telefono> save(@RequestBody Telefono obj){

        try{
            Telefono telefono = catalogoService.save(obj);
            return ResponseEntity.status(201).body(telefono);
        }
        catch (Exception e){
            return ResponseEntity.status(400).body(null);
        }


    }

}
