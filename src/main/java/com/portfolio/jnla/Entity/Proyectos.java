/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnla.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity 
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull 
    private String nombrePro;
    
    @NotNull
    private String descripcionPro;
    
    @NotNull
    private String imagenPro;
    
    @NotNull
    private int anioPro;
    
    @NotNull
    private String urlPro;

    public Proyectos() {
    }

    public Proyectos(String nombrePro, String descripcionPro, String imagenPro, int anioPro, String urlPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.imagenPro = imagenPro;
        this.anioPro = anioPro;
        this.urlPro = urlPro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
