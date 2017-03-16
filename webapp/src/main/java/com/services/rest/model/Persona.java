package com.services.rest.model;
import java.io.Serializable;
public class Persona implements Serializable {
   private String nombre;
   private String edad;
   private String msj;
   public Persona(String nombre,String edad,String msj){
	   this.nombre = nombre;
	   this.edad = edad;
	   this.msj = msj;
   }
   public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getMsj() {
		return msj;
	}
	public void setMsj(String msj) {
		this.msj = msj;
	}
}
