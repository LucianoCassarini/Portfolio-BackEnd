package com.portfolioapi.lgc.Repository;

import com.portfolioapi.lgc.Entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    //para el login
    //public List<Persona> findByCorreoandContrasena(String correo , String  contrasena);
}
