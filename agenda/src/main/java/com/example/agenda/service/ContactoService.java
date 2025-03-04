package com.example.agenda.service;


import com.example.agenda.model.Contacto;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class ContactoService {
    
    private Map<String, Contacto> agenda = new HashMap<>();

    public Map<String, Contacto> obtenerContacto(){
        return agenda;
    }

    public boolean eliminarContacto(String nombre){
        Contacto contacto = agenda.get(nombre);
        if(contacto != null && !contacto.isFavorito()){
            agenda.remove(nombre);
            return true;
        }
        return false;
    }

    public Contacto obtenerContactoPorNombre(String nombre){
        return agenda.get(nombre);
    }

    public void actualizarContacto(String nombreOriginal, Contacto contactoActualizado){
        if(!nombreOriginal.equals(contactoActualizado.getNombre())){
            agenda.remove(nombreOriginal);
        }
        agenda.put(contactoActualizado.getNombre(), contactoActualizado);
    }

    public void cambiarFavorito(String nombre){
        Contacto contacto = agenda.get(nombre);
        if(contacto != null){
            contacto.setFavorito(!contacto.isFavorito());
        }
    }

    public void guardarContacto(Contacto contacto){
        agenda.put(contacto.getNombre(), contacto);
    }

}
