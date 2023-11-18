package com.dev.service;

import com.dev.domain.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> lstPersonas();

    Persona obtenerPersonaPorId(Long id);

    Persona crearPersona(Persona persona);

    Persona actualizarPersona(Long id, Persona persona);

    void eliminarPersona(Long id);
}
