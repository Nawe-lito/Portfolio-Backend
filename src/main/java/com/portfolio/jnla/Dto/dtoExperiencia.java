/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnla.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String trabajoExp;
    @NotBlank
    private String descripcionExp;
    @NotBlank
    private String tiempoExp;
    @NotBlank
    private String imgExp;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String trabajoExp, String descripcionExp, String tiempoExp, String imgExp) {
        this.nombreExp = nombreExp;
        this.trabajoExp = trabajoExp;
        this.descripcionExp = descripcionExp;
        this.tiempoExp = tiempoExp;
        this.imgExp = imgExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getTrabajoExp() {
        return trabajoExp;
    }

    public void setTrabajoExp(String trabajoExp) {
        this.trabajoExp = trabajoExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public String getTiempoExp() {
        return tiempoExp;
    }

    public void setTiempoExp(String tiempoExp) {
        this.tiempoExp = tiempoExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }
    
    
}
