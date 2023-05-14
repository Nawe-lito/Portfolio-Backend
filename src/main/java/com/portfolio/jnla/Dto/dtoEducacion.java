/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnla.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    private String imgE;
    @NotBlank
    private String tiempoE;

    //Contructores
    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String imgE, String tiempoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
        this.tiempoE = tiempoE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }

    public String getTiempoE() {
        return tiempoE;
    }

    public void setTiempoE(String tiempoE) {
        this.tiempoE = tiempoE;
    }
}
