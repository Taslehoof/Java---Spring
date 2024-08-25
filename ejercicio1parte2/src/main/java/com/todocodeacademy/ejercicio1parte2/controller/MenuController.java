package com.todocodeacademy.ejercicio1parte2.controller;

import com.todocodeacademy.ejercicio1parte2.Menu;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {

    /*Ejercicio Nº 1 – Restaurante
    Un restaurante posee un total de 5 platos en su menú. Cada uno de ellos tiene un número de
    plato, nombre, precio y breve descripción.

    a. El restaurante desea una aplicación que permita que los clientes sean capaces consultar los datos
    de los platos del menú a partir de proporcionar el número de plato.
    Para ello, se necesita el desarrollo de una API que a partir de la recepción del num de plato en
    una solicitud GET, devuelva el plato correspondiente con todos sus datos.*/

    @GetMapping("/menu/{id}")
    @ResponseBody
    public Menu menuCliente(@PathVariable int id){

        List<Menu> listaMenu =  new ArrayList<Menu>();
        listaMenu.add( new Menu(1, "Ravioles con tuco", 2.50 ,"ravioles de ricota con salsa bologñesa"));
        listaMenu.add( new Menu(2, "Milanesa a caballo", 6.50 ,"Milanesa de pollo con Huevo frito"));
        listaMenu.add( new Menu(3, "Pastel de papa", 4.50 ,"Pastel de papa con carne picada y verduras varias"));
        listaMenu.add( new Menu(4, "Hamburgesa completa", 1.50 ,"Hamburgesa de carne completa con Huevo"));
        listaMenu.add( new Menu(5, "Pizza", 5.50 ,"Grande de muzzarella"));

        //Recorro el listado del Menu
        for (Menu menus : listaMenu){
            //Si coincide el ID del menu con el que paso lo devueldo por la API
            if (menus.getId() == id) {
                return menus;
            }
        }

        //En caso de que no lo encuentre no lo imprimo
        return null;
    }
}
