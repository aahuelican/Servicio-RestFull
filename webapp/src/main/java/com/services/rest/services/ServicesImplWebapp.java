package com.services.rest.services;

import org.springframework.stereotype.Service;

import com.services.rest.model.Persona;

@Service
public class ServicesImplWebapp implements ServiceWebapp{

	@Override
	public Persona getSaludoPersona() {
		return new Persona("Anzen","20","Esta es una prueba de Hola mundo");
	}
}
