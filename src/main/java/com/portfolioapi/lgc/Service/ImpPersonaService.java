package com.portfolioapi.lgc.Service;

import com.portfolioapi.lgc.Entity.Persona;
import com.portfolioapi.lgc.Repository.IPersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService{
    
    @Autowired IPersonaRepository ipersonaRepository;
    
    //Arma una lista con  todas las experiencias que encuentra
    public List<Persona> list(){
        return ipersonaRepository.findAll();
    }
    
    //Buscar por ID
    public Optional<Persona> getOne(int id){
        return ipersonaRepository.findById(id);
    }
    
    public Optional<Persona>getByNombre(String nombre){
        return ipersonaRepository.findByNombre(nombre);
    }
    
    public void save(Persona persona){
        ipersonaRepository.save(persona);
    }
    
    public  void delete(int id){
        ipersonaRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return ipersonaRepository.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return ipersonaRepository.existsByNombre(nombre);
    }
    
//    public boolean existsLog(String usuario, String contrasena){
//        return ipersonaRepository.existsLog(usuario, contrasena);
//    }
}
