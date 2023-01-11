package com.portfolioapi.lgc.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private String  nombreE;
    private String descripcionE;
    private String urlImagenE;
    private String fecha;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String urlImagenE, String fecha) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.urlImagenE = urlImagenE;
        this.fecha = fecha;
    }
    
    //Getters & Setters

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
