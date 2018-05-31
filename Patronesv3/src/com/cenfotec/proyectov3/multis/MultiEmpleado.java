package com.cenfotec.proyectov3.multis;

import java.sql.*;
import java.util.ArrayList;

import com.cenfotec.proyectov3.objetos.*;
import com.proyecto.conexion.Conector;

public class MultiEmpleado {
	
	
public MultiEmpleado(){}
	public ArrayList<Object> listarEmpleado() throws Exception {
		ArrayList<Object> lista = new ArrayList<>();
        String consulta = "{Call dbo.pa_listaEmpleado}";

        try {
            ResultSet result = Conector.getConector().ejecutarSQL(consulta, true);

            while (result.next()) {
            	Empleado nueva = new Empleado();
                nueva.setClave(result.getString("clave"));
                nueva.setUsuario(result.getString("nombreusuario"));
                
                lista.add(nueva);
            }

        } catch (SQLException ex) {
            throw ex;
        }

        return lista;
		
	}

	public void registrarEmpleado(String clave, String usuario) throws Exception {
		 String consulta = "{Call registrar ('" + clave + "','" + usuario + "' )}";

	        try {
	            Conector.getConector().ejecutarSQL(consulta);
	            
	        } catch (SQLException ex) {
	            throw ex;
	        }
	}


}
