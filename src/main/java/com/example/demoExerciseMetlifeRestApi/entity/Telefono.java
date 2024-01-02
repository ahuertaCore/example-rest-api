package com.example.demoExerciseMetlifeRestApi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data  //Crea Getters y Setters
@Entity
@Table(name = "telefono")
public class Telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "clave", unique = true)
    private String clave;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "marca")
    private String marca;

    @Column(name = "precio")
    private Double precio;
}
