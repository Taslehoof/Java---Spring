package com.todocodeacademy.cursoSpringBoot.controller;

import com.todocodeacademy.cursoSpringBoot.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
public class aplicacionController {

    @PostMapping("/cliente")
    public void crearCliente( @RequestBody Cliente cli){

        System.out.println("Cliente creado");
        System.out.println("Nombre: " + cli.getNombre());
        System.out.println("Apellido: " + cli.getApellido());
    }
}
