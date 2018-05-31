package com.cenfotec.proyectov3.multis;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cenfotec.proyectov3.objetos.Tarea;
import com.proyecto.conexion.Conector;

public class MultiTarea {
public MultiTarea(){}

	public ArrayList<Object> listarTarea(int proceso) throws Exception {
		ArrayList<Object> lista = new ArrayList<>();
	    String consulta = "{Call dbo.pa_listarTarea'"+proceso+"'}";

	    try {
	        ResultSet result = Conector.getConector().ejecutarSQL(consulta, true);

	        while (result.next()) {
	        	Tarea nueva = new Tarea();
	        	 nueva.setNumero(result.getInt("id_tarea"));
	            nueva.setDescripcion(result.getString("nombre"));
	            nueva.setEstado(result.getString("estado"));
	            lista.add(nueva);
	        }

	    } catch (SQLException ex) {
	        throw ex;
	    }

	    return lista;
	}

	

	public void modificarEstadoTareas() {
		// TODO Auto-generated method stub
		
	}



	public void registrarTarea(int codigo, String descripcion) throws Exception {
		 String consulta = "{Call pa_registrarTarea ('" + descripcion + "','" + codigo + "' )}";

	        try {
	            Conector.getConector().ejecutarSQL(consulta);
	            
	        } catch (SQLException ex) {
	            throw ex;
	        }
		
	}



	public int obtenerIDTarea() throws Exception {
		int id=0;
		String consulta = "{Call paBuscarIDtarea ()}";

        try {
        	ResultSet result = Conector.getConector().ejecutarSQL(consulta, true);
            
            id=result.getInt("id_tarea");
            
            
        } catch (SQLException ex) {
            throw ex;
        }
		return id;
	}

}
