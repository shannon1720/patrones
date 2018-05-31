package com.cenfotec.proyectov3.objetos;

public class Area {
	
	private String nombre;
	private String descripcion;
	private String estado;
	
	public Area() {
		
	}

	public Area(String nombre, String descripcion, String estado) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Area [nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}
	
	

}
