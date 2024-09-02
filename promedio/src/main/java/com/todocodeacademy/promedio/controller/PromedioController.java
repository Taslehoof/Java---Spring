package com.todocodeacademy.promedio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromedioController {

    /*
    Ejercicio Nº 1 – Promedio de Notas

    Un alumno de secundaria desea poder contar con una API mediante la cual,
    al enviar las 3 notas de una materia obtenga como respuesta el promedio de la misma.
    Para el pasaje de notas como parámetro utilizar la annotation @RequestParam.

    */

    @GetMapping("/promedio")
    public String calculadora(@RequestParam int nota1,
                              @RequestParam int nota2,
                              @RequestParam int nota3){

        double promedio = (nota1 + nota2 + nota3)/3;
        return "El promedio de las tres notas es "+promedio;
    }
}
