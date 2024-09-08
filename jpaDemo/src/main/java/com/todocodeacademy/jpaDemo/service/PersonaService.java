package com.todocodeacademy.jpaDemo.service;

import com.todocodeacademy.jpaDemo.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private IPersonaRepository persoRepository;
}
