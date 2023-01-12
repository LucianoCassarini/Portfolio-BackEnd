package com.portfolioapi.lgc.Repository;

import com.portfolioapi.lgc.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Integer>{
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
    //para el login
    //public boolean existsLog(String usuario , String  contrasena);
}
