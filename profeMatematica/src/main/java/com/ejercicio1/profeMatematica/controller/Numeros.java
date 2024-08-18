package com.ejercicio1.profeMatematica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Numeros {

    @GetMapping("/suma/{num1}/{num2}")
    public String math(@PathVariable int num1,
                       @PathVariable int num2){
        int sum;
        sum = num1 + num2;
        return "La suma de los dos numero es: "+ sum;
    }

}
