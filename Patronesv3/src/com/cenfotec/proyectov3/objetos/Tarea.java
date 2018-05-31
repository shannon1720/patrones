/**
 * 
 */
package com.cenfotec.proyectov3.objetos;

import java.util.ArrayList;

/**
 * @author Usuario
 *
 */
public class Tarea {
	private int numero ;
	private String descripcion;
	private String estado;
	private ArrayList<Paso>listaPaso=new ArrayList<>();
	private Empleado persona;


	


	public ArrayList<Paso> getListaPaso() {
		return listaPaso;
	}


	public void setListaPaso(ArrayList<Paso> listaPaso) {
		this.listaPaso = listaPaso;
	}


	public Tarea() {
		super();
	}


	public Tarea(String descripcion, String estado) {
		super();
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public Tarea(String descripcion, String estado, ArrayList<Paso> listaPaso) {
		super();
		this.descripcion = descripcion;
		this.estado = estado;
		this.listaPaso = listaPaso;
	}

	public Tarea(int numero, String descripcion, String estado, ArrayList<Paso> listaPaso) {
		super();
		this.numero = numero;
		this.descripcion = descripcion;
		this.estado = estado;
		this.listaPaso = listaPaso;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getEstado() {
		return estado;
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


	@Override
	public String toString() {
		return "Tarea [descripcion=" + descripcion + ", estado=" + estado + ", listaPaso=" + listaPaso + "]";
	}


	
	
	
	
	

}
