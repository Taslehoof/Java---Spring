package com.holamundo.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Hola mundo!" + nombre;
    }

    @GetMapping("/chau")
    public String sayBye(){
        return "Chau mundo!";
    }
}
