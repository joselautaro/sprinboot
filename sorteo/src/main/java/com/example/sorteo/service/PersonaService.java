package com.example.sorteo.service;

import com.example.sorteo.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sorteo.repository.PersonaRepository;
import java.util.List;


@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> listarTodas(){
        return personaRepository.findAll();
    }

    public Persona guardar(Persona persona){
        return personaRepository.save(persona);
    }

    public Persona obtenerPorId(Long id){
        return personaRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id){
        personaRepository.deleteById(id);
    }
     
}