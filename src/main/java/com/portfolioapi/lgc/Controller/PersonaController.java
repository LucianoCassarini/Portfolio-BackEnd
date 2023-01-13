package com.portfolioapi.lgc.Controller;

import com.portfolioapi.lgc.Entity.Persona;
import com.portfolioapi.lgc.Service.ImpPersonaService;
import com.portfolioapi.lgc.dto.dtoPersona;
import io.micrometer.common.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "https://portfoliolgc.web.app")
public class PersonaController {
    
    @Autowired
    ImpPersonaService personaService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list() {
        List<Persona> list = personaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id) {
        if (!personaService.existsById(id)) {
            return new ResponseEntity("No existe el ID", HttpStatus.BAD_REQUEST);
        }
        
        Persona persona = personaService.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }

//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable("id") int id){
//        if(!personaService.existsById(id)){
//            return new ResponseEntity("No existe el ID", HttpStatus.NOT_FOUND);
//        }
//        personaService.delete(id);
//        return new ResponseEntity("Persona eliminada", HttpStatus.OK);
//    }
//    @PostMapping("/create")
//    public ResponseEntity<?> create(@RequestBody dtoPersona dtopersona) {
//        if (StringUtils.isBlank(dtopersona.getNombre())) {
//            return new ResponseEntity("El nombre es obligatorio", HttpStatus.BAD_REQUEST);
//        }
//        if (personaService.existsByNombre(dtopersona.getNombre())) {
//            return new ResponseEntity("Ese nombre ya existe", HttpStatus.BAD_REQUEST);
//        }
//
//        Persona persona = new Persona(dtopersona.getNombre(), dtopersona.getDescripcion(), dtopersona.getApellido(), dtopersona.getImg(), dtopersona.getCorreo(), dtopersona.getUsuario(), dtopersona.getContrasena(), dtopersona.getUrlcv(), dtopersona.getInstagram(), dtopersona.getLinkedin(), dtopersona.getTelefono(), dtopersona.getTwitter());
//        personaService.save(persona);
//        return new ResponseEntity("Persona creada", HttpStatus.OK);
//
//    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtopersona) {
        if (!personaService.existsById(id)) {
            return new ResponseEntity("No existe el id", HttpStatus.NOT_FOUND);
        }
        if (personaService.existsByNombre(dtopersona.getNombre()) && personaService.getByNombre(dtopersona.getNombre()).get().getId() != id) {
            return new ResponseEntity("Ese nombre ya existe", HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtopersona.getNombre())) {
            return new ResponseEntity("El campo no puede estar vacio", HttpStatus.BAD_REQUEST);
        }
        
        Persona persona = personaService.getOne(id).get();
        persona.setNombre(dtopersona.getNombre());
        persona.setApellido(dtopersona.getApellido());
        persona.setDescripcion(dtopersona.getDescripcion());
        persona.setCorreo(dtopersona.getCorreo());
        persona.setTelefono(dtopersona.getTelefono());
        persona.setLinkedin(dtopersona.getLinkedin());
        persona.setTwitter(dtopersona.getTwitter());
        persona.setInstagram(dtopersona.getInstagram());
        persona.setUrlcv(dtopersona.getUrlcv());
        persona.setImg(dtopersona.getImg());
        persona.setUsuario(dtopersona.getUsuario());
        persona.setContrasena(dtopersona.getContrasena());
        
        personaService.save(persona);
        
        return new ResponseEntity("Persona actualizada", HttpStatus.OK);
    }
}
