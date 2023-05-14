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
    private String nombreExp;
    private String trabajoExp;
    private String descripcionExp;
    private String tiempoExp;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(String nombreExp, String trabajoExp, String descripcionExp, String tiempoExp, String imgExp) {
        this.nombreExp = nombreExp;
        this.trabajoExp = trabajoExp;
        this.descripcionExp = descripcionExp;
        this.tiempoExp = tiempoExp;
        this.imgExp = imgExp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
