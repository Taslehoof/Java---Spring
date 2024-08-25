package com.todocodeacademy.ejercicio1parte2.controller;

import com.todocodeacademy.ejercicio1parte2.Menu;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {

    @GetMapping("/menu/{opcion}")
    @ResponseBody
    public List<Menu> menuCliente(@PathVariable int id){

        List<Menu> listaMenu =  new ArrayList<Menu>();
        listaMenu.add( new Menu(1, "Ravioles con tuco", 2.50 ,"ravioles de ricota con salsa bologñesa"));
        listaMenu.add( new Menu(2, "Milanesa a caballo", 6.50 ,"Milanesa de pollo con Huevo frito"));
        listaMenu.add( new Menu(3, "Pastel de papa", 4.50 ,"Pastel de papa con carne picada y verduras varias"));
        listaMenu.add( new Menu(4, "Hamburgesa completa", 1.50 ,"Hamburgesa de carne completa con Huevo"));
        listaMenu.add( new Menu(5, "Pizza", 5.50 ,"Grande de muzzarella"));

        return listaMenu;
    }
}
