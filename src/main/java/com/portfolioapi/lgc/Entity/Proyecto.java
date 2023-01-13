package com.portfolioapi.lgc.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private String urlImagen;
    private String urlHost;
    private String urlGit;
    
    //Constructores
    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, String urlImagen, String urlHost, String urlGit) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.urlHost = urlHost;
        this.urlGit = urlGit;
    }
    
    
}
