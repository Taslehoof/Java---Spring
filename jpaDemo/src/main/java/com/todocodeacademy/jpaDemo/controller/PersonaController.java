package com.todocodeacademy.jpaDemo.controller;

import com.todocodeacademy.jpaDemo.model.Persona;
import com.todocodeacademy.jpaDemo.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService interPersona;

    //Endpoint para obtener todas las personas
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }

    //Endpoint para crear una nueva persona
    @PostMapping("/personas/crear")
    public String createStudent(@RequestBody Persona perso){
        interPersona.savePersonas(perso);

        //devuelve un String avisando si creo correctamente
        return "La personas fue creada correctamente";
    }

    //Endpoint para dar de baja una nueva persona
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);

        //devuelve un string avisando si elimino correctamente
        return "La persona fue eliminada correctamente";
    }

    //Endpoint para modificar una persona
    @PutMapping("/personas/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               @RequestParam(required=false, name= "id") Long nuevaId,
                               @RequestParam(required=false, name= "nombre") String nuevoNombre,
                               @RequestParam(required=false, name= "apellido") String nuevoApellido,
                               @RequestParam(required=false, name= "edad") int nuevaEdad){

        //Envio id original (para buscar)
        //Envio nuevos datos para modificar
        interPersona.editPersona(id_original, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);

        //busco la persona editada para mostrarla en la response
        Persona perso = interPersona.findPersona(id_original);

        return perso;
    }


    @PutMapping("/personas/editar")
    public Persona editPersona(@RequestBody Persona per){
        interPersona.editPersona(per);

        return interPersona.findPersona(per.getId());
    }
}
