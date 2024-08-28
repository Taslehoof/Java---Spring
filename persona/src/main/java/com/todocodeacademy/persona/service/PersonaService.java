package com.todocodeacademy.persona.service;

import com.todocodeacademy.persona.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Override
    public void crearPersona(Persona per){
        //aca creamos una persona
    }

    @Override
    public List<Persona> traerPersonas(){
        //aca buscariamos todas las personas para devolver

        return null; //aca devolveriamos
                    //la lista de personas (no null)
    }
}
