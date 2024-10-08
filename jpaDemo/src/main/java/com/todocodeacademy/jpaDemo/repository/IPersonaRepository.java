package com.todocodeacademy.jpaDemo.repository;

import com.todocodeacademy.jpaDemo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
}
