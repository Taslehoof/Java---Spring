package com.todocodeacademy.persona.service;

import com.todocodeacademy.persona.model.Persona;

import java.util.List;

public interface IPersonaService {

    public void crearPersona(Persona per);
    public List<Persona> traerPersonas();
}
