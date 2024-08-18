package com.holamundo.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeSpring {

    @GetMapping("/")
    public String mensaje(){
        return "Spring Boot es una herramienta para Desarrollar APIs en JAVA";
    }

}
