/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnla.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String trabajoE;
    private String descripcionE;
    
    //Contructores

    public Experiencia() {
    }
    
    public Experiencia(String nombreE, String trabajoE, String descripcionE) {
        this.nombreE = nombreE;
        this.trabajoE = trabajoE;
        this.descripcionE = descripcionE;
    }

    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getTrabajoE() {
        return trabajoE;
    }

    public void setTrabajoE(String trabajoE) {
        this.trabajoE = trabajoE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    
}
