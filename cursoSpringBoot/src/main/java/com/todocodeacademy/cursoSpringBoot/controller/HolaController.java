package com.todocodeacademy.cursoSpringBoot.controller;

import com.todocodeacademy.cursoSpringBoot.Cliente;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HolaController {

    /*@GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){

        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L,"Zlatan","Ibrahimovic"));
        listaClientes.add(new Cliente(2L,"Cristiano","Ronaldo"));
        listaClientes.add(new Cliente(3L,"Lionel","Messi"));

        return listaClientes;

    }*/

    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerREspuesta(){
        return new ResponseEntity<>("Esto es un mensaje Response Entity", HttpStatusCode.valueOf(200));
    }
}
