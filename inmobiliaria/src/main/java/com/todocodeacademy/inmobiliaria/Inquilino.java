package com.todocodeacademy.inmobiliaria;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Inquilino {

    private Long id_inquilino;
    private int dni;
    private String nombre;
    private String apellido;
    private String profesion;

    public Inquilino() {
    }

    public Inquilino(Long id_inquilino, int dni, String nombre, String apellido, String profesion) {
        this.id_inquilino = id_inquilino;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }
}
