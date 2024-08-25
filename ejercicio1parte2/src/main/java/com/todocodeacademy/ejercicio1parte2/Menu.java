package com.todocodeacademy.ejercicio1parte2;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Menu {

    private int id;
    private String nombre;
    private double precio;
    private String descripcion;

    public Menu() {
    }

    public Menu(int id, String nombre, double precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
}