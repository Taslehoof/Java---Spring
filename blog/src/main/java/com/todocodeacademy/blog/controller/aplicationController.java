package com.todocodeacademy.blog.controller;

import com.todocodeacademy.blog.model.Posteo;
import com.todocodeacademy.blog.repository.PosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class aplicationController {

    @Autowired
    PosteoRepository repository;

    @GetMapping("/posteos")
    public List<Posteo> traerTodos(){
        return repository.traerTodos();
    }
}
