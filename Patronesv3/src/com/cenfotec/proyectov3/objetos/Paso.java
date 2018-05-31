package com.cenfotec.proyectov3.objetos;

public class Paso {
private int numero;
private String descripcion;
private String estado;




public Paso() {
	super();
}

public Paso(int numero, String descripcion, String estado) {
	super();
	this.numero = numero;
	this.descripcion = descripcion;
	this.estado = estado;
}

public Paso(String descripcion, String estado) {
	this.descripcion = descripcion;
	this.estado = estado;
}

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public String getEstado() {
	return estado;
}

@Override
public String toString() {
	return "Paso [numero=" + numero + ", descripcion=" + descripcion + ", estado=" + estado + "]";
}	
}
