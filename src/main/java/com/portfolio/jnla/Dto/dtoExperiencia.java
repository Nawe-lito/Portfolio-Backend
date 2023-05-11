/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnla.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String trabajoE;
    @NotBlank
    private String descripcionE;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String trabajoE, String descripcionE) {
        this.nombreE = nombreE;
        this.trabajoE = trabajoE;
        this.descripcionE = descripcionE;
    }
    
    //Getters y Setters

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
