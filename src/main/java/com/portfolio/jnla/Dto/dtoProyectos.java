/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnla.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyectos {
    @NotBlank 
    private String nombrePro;
    
    @NotBlank 
    private String descripcionPro;
    
    @NotBlank 
    private String imagenPro;
    
    @NotBlank 
    private int anioPro;
    
    @NotBlank
    private String urlPro;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombrePro, String descripcionPro, String imagenPro, int anioPro, String urlPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.imagenPro = imagenPro;
        this.anioPro = anioPro;
        this.urlPro = urlPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getImagenPro() {
        return imagenPro;
    }

    public void setImagenPro(String imagenPro) {
        this.imagenPro = imagenPro;
    }

    public int getAnioPro() {
        return anioPro;
    }

    public void setAnioPro(int anioPro) {
        this.anioPro = anioPro;
    }

    public String getUrlPro() {
        return urlPro;
    }

    public void setUrlPro(String urlPro) {
        this.urlPro = urlPro;
    }

    
}
