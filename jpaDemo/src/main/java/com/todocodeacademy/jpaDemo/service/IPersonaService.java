package com.todocodeacademy.jpaDemo.service;

import com.todocodeacademy.jpaDemo.model.Persona;

import java.util.List;

public interface IPersonaService {

    //metodo para traer todas las personas
    public List<Persona> getPersonas();

    //metodo para dar de alta una persona
    public void savePersonas(Persona perso);

    //metodo para borrar una persona
    public void deletePersona(Long id);

    //metodo para encntrar uan persona
    public Persona findPersona(Long id);

    //metodo para editar una persona
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);
}
