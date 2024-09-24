package com.todocodeacademy.jpaDemo.service;

import com.todocodeacademy.jpaDemo.model.Mascota;
import java.util.List;

public interface IMascotaService {

    //Metodo para traer a todas las mascota
    //lectura
    public List<Mascota> getMascotas();

    //alta
    public void saveMascota(Mascota masco);

    //baja
    public void deleteMascota(Long id_mascota);

    //lecttura de un solo objeto
    public Mascota findMascota(Long id_mascota);

    //edicion/modificacion
    public void editMascota(Long idOriginal, Long id_mascotaNueva,
                            String nuevoNombre,
                            String nuevaEspecie,
                            String nuevaRaza,
                            String nuevoColor);
}
