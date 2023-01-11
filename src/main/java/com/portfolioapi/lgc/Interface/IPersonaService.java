package com.portfolioapi.lgc.Interface;

import com.portfolioapi.lgc.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar una persona
    public void savePersona(Persona persona);
    
    //Eliminar persona
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
    
    //Login
//    public Persona loginPersona(String correo, String clave);
}
