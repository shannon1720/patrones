package com.cenfotec.proyectov3.multis;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList; 

import com.cenfotec.proyectov3.objetos.*;
import com.proyecto.conexion.Conector;

public class MultiProceso {

	public MultiProceso() {
		
	}

	public ArrayList<Object> listarProceso() throws Exception {
		ArrayList<Object> lista = new ArrayList<>();
        String consulta = "{Call dbo.pa_listarProceso}";

        try {
            ResultSet result = Conector.getConector().ejecutarSQL(consulta, true);

            while (result.next()) {
            	Proceso nueva = new Proceso();
                nueva.setNumero(result.getString("id_proceso"));
                nueva.setNombre(result.getString("nombre"));
                nueva.setTipo(result.getString("tipo"));
                nueva.setEstado(result.getString("estado"));
                lista.add(nueva);
            }

        } catch (SQLException ex) {
            throw ex;
        }

        return lista;
	}

	public void modificarEstadoProceso() {
	
		
	}

	

	public void registrarProceso(String nombre, String tipo) throws Exception {
		 String consulta = "{Call registrarProceso ('" + nombre + "','" + tipo + "' )}";

	        try {
	            Conector.getConector().ejecutarSQL(consulta);
	            
	        } catch (SQLException ex) {
	            throw ex;
	        }
		
	}

	

	public int obtenerIDProceso() throws Exception {
		int id=0;
		String consulta = "{Call paBuscarIDproceso ()}";

        try {
        	ResultSet result = Conector.getConector().ejecutarSQL(consulta, true);
            
            id=result.getInt("id_proceso");
            
            
        } catch (SQLException ex) {
            throw ex;
        }
		return id;
	}
	}

	


