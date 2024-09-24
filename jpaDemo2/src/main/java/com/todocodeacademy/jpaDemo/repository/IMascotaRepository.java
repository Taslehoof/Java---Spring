package com.todocodeacademy.jpaDemo.repository;

import com.todocodeacademy.jpaDemo.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}
