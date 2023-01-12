package com.portfolioapi.lgc.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    private String descripcion;
    
    @NotNull
    private String correo;
    
    @NotNull
    private String telefono;
    
    @NotNull
    private String linkedin;
    
    @NotNull
    private String twitter;
    
    @NotNull
    private String instagram;
    
    @NotNull
    private String urlcv;

    @NotNull
    private String img;

    @NotNull
    @Size(min = 5, max = 20, message = "no cumple con la longitud")
    private String usuario;

    @NotNull
    @Size(min = 5, max = 20, message = "no cumple con la longitud")
    private String contrasena;
    
    //Constructores

    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String correo, String telefono, String linkedin, String twitter, String instagram, String urlcv, String img, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.correo = correo;
        this.telefono = telefono;
        this.linkedin = linkedin;
        this.twitter = twitter;
        this.instagram = instagram;
        this.urlcv = urlcv;
        this.img = img;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
}
