package com.portfolioapi.lgc.dto;

import jakarta.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String  nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String urlImagenE;
    @NotBlank
    private String fecha;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String urlImagenE, String fecha) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.urlImagenE = urlImagenE;
        this.fecha = fecha;
    }
    
    //Getters & Setters

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

    public String getUrlImagenE() {
        return urlImagenE;
    }

    public void setUrlImagenE(String urlImagenE) {
        this.urlImagenE = urlImagenE;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
