/**
 * 
 */
package com.cenfotec.proyectov3.objetos;

import java.util.ArrayList;

/**
 * @author Usuario
 *
 */
public class Proceso {
private String numero;
private String nombre;
private String tipo;
private ArrayList<Tarea> listaTarea=new ArrayList<>();
private String estado;


public Proceso() {
	super();
}

public Proceso(String numero, String nombre, String tipo, String estado) {
	super();
	this.numero = numero;
	this.nombre = nombre;
	this.tipo = tipo;
	this.estado = estado;
}

public Proceso(String numero, String nombre, String tipo, ArrayList<Tarea> listaTarea, String estado) {
	super();
	this.numero = numero;
	this.nombre = nombre;
	this.tipo = tipo;
	this.listaTarea = listaTarea;
	this.estado = estado;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public ArrayList<Tarea> getListaTarea() {
	return listaTarea;
}

public void setListaTarea(ArrayList<Tarea> listaTarea) {
	this.listaTarea = listaTarea;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

@Override
public String toString() {
	return "Proceso [numero=" + numero + ", nombre=" + nombre + ", tipo=" + tipo 
			+ ", estado=" + estado + "]";
}
}
