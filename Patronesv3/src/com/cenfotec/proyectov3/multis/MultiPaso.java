/**
 * 
 */
package com.cenfotec.proyectov3.multis;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cenfotec.proyectov3.objetos.Paso;
import com.cenfotec.proyectov3.objetos.Tarea;
import com.proyecto.conexion.Conector;

/**
 * @author Usuario
 *
 */
public class MultiPaso {

	
	


	public MultiPaso() { }
	
	/**
	 * registra el paso
	 * @throws Exception 
	 */
	public void registrarPaso(int paso,String descripcion) throws Exception {
		
		 String consulta = "{Call registrarPaso('" + descripcion + "','" + paso + "' )}";

	        try {
	            Conector.getConector().ejecutarSQL(consulta);
	            
	        } catch (SQLException ex) {
	            throw ex;
	        }
		
	}
	
	
	public ArrayList<Object> listarPasosTarea(int codigo) throws Exception{
		ArrayList<Object> lista = new ArrayList<>();
	    String consulta = "{Call dbo.pa_listarTarea'"+codigo+"'}";

	    try {
	        ResultSet result = Conector.getConector().ejecutarSQL(consulta, true);

	        while (result.next()) {
	        	Tarea nueva = new Tarea();
	            nueva.setDescripcion(result.getString("nombre"));
	            nueva.setEstado(result.getString("estado"));
	            lista.add(nueva);
	        }

	    } catch (SQLException ex) {
	        throw ex;
	    }

	    return lista;
	}

	public void modificarEstadoPasos(int codigo) throws Exception {
		String consulta = "{Call modificarEstadoPaso('" + codigo + "')}";

        try {
            Conector.getConector().ejecutarSQL(consulta);
            
        } catch (SQLException ex) {
            throw ex;
        }
		
	}
	
	public ArrayList<Paso> obtenerPasosTarea(int id) throws Exception{
		ArrayList<Paso> lista = new ArrayList<>();
	    String consulta = "{Call dbo.obtenerPasosTarea'"+id+"'}";

	    try {
	        ResultSet result = Conector.getConector().ejecutarSQL(consulta, true);

	        while (result.next()) {
	        	Paso nueva = new Paso();
	            nueva.setDescripcion(result.getString("descripcion"));
	            nueva.setEstado(result.getString("estado"));
	            lista.add(nueva);
	        }

	    } catch (SQLException ex) {
	        throw ex;
	    }

	    return lista;
		
		
		
		
	}
	
	
	
}
