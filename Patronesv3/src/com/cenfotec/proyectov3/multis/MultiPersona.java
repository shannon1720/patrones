package com.cenfotec.proyectov3.multis;

import java.sql.*;
import java.util.ArrayList;

import com.cenfotec.proyectov3.objetos.Persona;
import com.proyecto.conexion.Conector;

public class MultiPersona {

	public MultiPersona() {

	
	
	}

	public void registrarPersona( String nombre, String apellido) throws Exception {
		 String consulta = "{Call registrarEmpleado ('" + nombre + "','" + apellido + "' )}";

	        try {
	            Conector.getConector().ejecutarSQL(consulta);
	            
	        } catch (SQLException ex) {
	            throw ex;
	        }
		
	}

	public ArrayList<Object> listarEmpleado() throws Exception {
	ArrayList<Object> lista = new ArrayList<>();
    String consulta = "{Call dbo.pa_listaEmpleado}";

    try {
        ResultSet result = Conector.getConector().ejecutarSQL(consulta, true);

        while (result.next()) {
        	Persona nueva = new Persona();
            nueva.setIdentidad(result.getString("id_persona"));
            nueva.setNombre(result.getString("nombre"));
            nueva.setApellido(result.getString("apellido"));
            lista.add(nueva);
        }

    } catch (SQLException ex) {
        throw ex;
    }

    return lista;
	
	

}}
