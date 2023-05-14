/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnla.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHabilidades {
    @NotBlank
    private String nombreHab;
    @NotBlank
    private int porcentajeSkill;

    public dtoHabilidades() {
    }

    public dtoHabilidades(String nombreHab, int porcentajeSkill) {
        this.nombreHab = nombreHab;
        this.porcentajeSkill = porcentajeSkill;
    }

    public String getNombreHab() {
        return nombreHab;
    }

    public void setNombreHab(String nombreHab) {
        this.nombreHab = nombreHab;
    }

    public int getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(int porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }



    
}
