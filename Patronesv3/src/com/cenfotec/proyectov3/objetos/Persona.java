package com.cenfotec.proyectov3.objetos;

public class Persona {
protected String identidad;
protected String nombre;
protected String apellido;



public Persona() {
	super();
}

public Persona(String identidad, String nombre, String apellido) {
	super();
	this.identidad = identidad;
	this.nombre = nombre;
	this.apellido = apellido;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getIdentidad() {
	return identidad;
}
public void setIdentidad(String identidad) {
	this.identidad = identidad;
}

@Override
public String toString() {
	return "Persona [identidad=" + identidad + ", nombre=" + nombre + ", apellido=" + apellido +  "]";
}


}
