package com.example.sorteo.repository;

import com.example.sorteo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepository  extends JpaRepository<Persona, Long>{

}