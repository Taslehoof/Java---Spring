package com.todocodeacademy.jpaDemo.controller;

import com.todocodeacademy.jpaDemo.model.Mascota;
import com.todocodeacademy.jpaDemo.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ;

    @PostMapping("/mascotas/crear")
    public String savePersona(@RequestBody Mascota masco){

        mascoServ.saveMascota(masco);

        return "Las mascota fue creada correctamente";
    }

}
