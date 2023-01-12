package com.portfolioapi.lgc.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class dtoPersona {

    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String correo;
    @NotBlank
    private String telefono;
    @NotBlank
    private String linkedin;
    @NotBlank
    private String twitter;
    @NotBlank
    private String instagram;
    @NotBlank
    private String urlcv;
    @NotBlank
    private String img;
    @NotBlank
    private String usuario;
    @NotBlank
    private String contrasena;
    
    //Constructores

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String descripcion, String correo, String telefono, String linkedin, String twitter, String instagram, String urlcv, String img, String usuario, String contrasena) {
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
