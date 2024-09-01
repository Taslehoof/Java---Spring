package com.todocodeacademy.blog.repository;

import com.todocodeacademy.blog.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements IPosteoRepository{

    public List<Posteo> traerTodos(){

        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L,"¿Como formatear una PC?","Luisina de Paula"));
        listaPosteos.add(new Posteo(2L,"¿Como mantener la seguridad?","Gabriel Guismin"));

        return listaPosteos;
    }
}
