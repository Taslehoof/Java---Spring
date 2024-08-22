package com.todocodeacademy.tp1Integrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tp1Integrador {

    @GetMapping("/gasolina/{galones}")
    public String Gasolina(@PathVariable double galones){

        double litros;

        //Formula para hacer la conversion de medidas
        litros = galones * 3.78541;

        return "La cantidad de Litros para los galones que ingreso es: "+litros;
    }
}
