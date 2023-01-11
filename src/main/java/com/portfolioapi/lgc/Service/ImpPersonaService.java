package com.portfolioapi.lgc.Service;

import com.portfolioapi.lgc.Entity.Persona;
import com.portfolioapi.lgc.Interface.IPersonaService;
import com.portfolioapi.lgc.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
    
//    @Override
//    public Persona loginPersona(String correo, String clave){
//        List<Persona>personas = ipersonaRepository.findByCorreoandContrasena(correo, clave);
//        
//        if(!personas.isEmpty()){
//            return personas.get(0);
//        }
//        return null;
//    }
    
}
