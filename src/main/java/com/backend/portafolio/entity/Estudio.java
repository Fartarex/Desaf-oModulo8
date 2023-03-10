package com.backend.portafolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table
public class Estudio  {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;        
    
    @Column(length = 100)
    private String titulo;
    @Column(length = 100)
    private String programa;
    @Column(length = 100)
    private String fechas;
    @Column(length = 1000)
    private String descripcion;
    
    public Estudio() {
    }

    public Estudio(String titulo, String programa, String fechas, String descripcion) {
        this.titulo = titulo;
        this.programa = programa;
        this.fechas = fechas;
        this.descripcion = descripcion;
    }       
}

