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
public class hys {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int porcentaje;
    private String color;

    public hys() {
    }

    public hys(String nombre, int porcentaje, String color) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.color = color;
    }
    
}
