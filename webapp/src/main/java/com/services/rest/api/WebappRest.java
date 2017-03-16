package com.services.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.services.rest.model.Persona;
import com.services.rest.services.ServicesImplWebapp;

@RestController
@EnableAutoConfiguration

public class WebappRest {

	@Autowired 
	ServicesImplWebapp servicio;
	
	@RequestMapping(path="/getHola",method = RequestMethod.GET)
	public @ResponseBody Persona getHello(){
         return servicio.getSaludoPersona();
	}
	
}
