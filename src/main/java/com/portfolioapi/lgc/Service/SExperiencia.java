package com.portfolioapi.lgc.Service;

import com.portfolioapi.lgc.Entity.Experiencia;
import com.portfolioapi.lgc.Repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    //Arma una lista con  todas las experiencias que encuentra
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    
    //Buscar por ID
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia>getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }
    
    public void save(Experiencia exp){
        rExperiencia.save(exp);
    }
    
    public  void delete(int id){
        rExperiencia.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rExperiencia.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }
}
