package com.cenfotec.proyectov3.objetos;

public class Empleado extends Persona{
	

private String usuario;
private String clave;
private String tipoEmpleado;
private Area funcion;
	



public Empleado() {
	super();
	
}	
public Empleado(String edad, String nombre, String apellido, String identidad, String usuario, String clave,
		String tipo, Area funcion) {
	super(edad, nombre, apellido);
	this.usuario = usuario;
	this.clave = clave;
	this.tipoEmpleado = tipo;
	this.funcion = funcion;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getClave() {
	return clave;
}
public void setClave(String clave) {
	this.clave = clave;
}
public String getTipo() {
	return tipoEmpleado;
}
public void setTipo(String tipo) {
	this.tipoEmpleado = tipo;
}
public Area getFuncion() {
	return funcion;
}
public void setFuncion(Area funcion) {
	this.funcion = funcion;
}
@Override
public String toString() {
	return "Empleado [usuario=" + usuario + ", clave=" + clave + ", tipo=" + tipoEmpleado + ", funcion=" + funcion + "]";
}

}

