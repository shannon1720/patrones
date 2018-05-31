package com.ucenfotec.proyectov3.gestor;

import com.cenfotec.proyectov3.multis.*;

import java.util.ArrayList;

public class Gestor {

	private MultiPersona mper;
	private MultiEmpleado mE;
	private MultiPaso mp;
	private MultiProceso mpro;
	private MultiArea ma;
	private MultiTarea mt;

	public Gestor() {
		mE = new MultiEmpleado();
		mper = new MultiPersona();
		mpro = new MultiProceso();
		mt = new MultiTarea();
	}

	/**
	 * registra el empleado
	 * 
	 * @param identificacion
	 *            la identificacion de la persona
	 * @param nombre
	 *            es el nombre de la persona
	 * @param apellido
	 *            es el apellido de la persona
	 * @param usuario
	 *            es el usuario del empleado
	 * @throws Exception
	 *             en caso de error
	 */
	public void registrarempleado(String nombre, String apellido, String usuario, String clave) throws Exception {
		mper.registrarPersona(nombre, apellido);
		mE.registrarEmpleado(usuario, clave);
	};

	/**
	 * va a obtener los objetos para poder listarlos
	 * 
	 * @param opc
	 *            es el numero que se utilizara para el listar
	 * @param proceso
	 * @return un lista de tipo Object
	 * @throws Exception
	 */

	public ArrayList<Object> listar(int opc, int proceso) throws Exception {

		ArrayList<Object> listaObjeto = null;

		switch (opc) {

		case 1:

			listaObjeto = mE.listarEmpleado();
			break;
		case 2:
			listaObjeto = mpro.listarProceso();
			break;
		case 3:
			listaObjeto = mt.listarTarea(opc);
			break;
		case 4:
			listaObjeto = mp.listarPasosTarea(opc);
			break;
		case 5:
			listaObjeto = ma.listarArea();
			break;
		default:
			break;
		}
		return listaObjeto;
	}

	/**
	 * Lista el objeto
	 * 
	 * @param opc
	 *            es la opcion escogida que se va a listar
	 * @param proceso
	 * @return una lista de string del objeto que se ha pedido
	 * @throws Exception
	 *             en caso de error
	 */
	public String[] listarObjetosStrings(int opc, int proceso) throws Exception {
		int i = 0;
		ArrayList<Object> listaO = listar(opc, proceso);
		String[] lista = new String[listaO.size()];

		for (Object var : listaO) {

			lista[i] = var.toString();

			i++;
		}
		return lista;

	}

	/**
	 * Modifica el estado de las opciones que estan dentro del switch
	 * 
	 * @param opc
	 *            va a escoger las opcion seleccionan en el main
	 * @param tarea
	 *            manda el estado al cual desea cambiar
	 * @throws Exception
	 */
	public void modificarEstado(int opc, int codigo) throws Exception {

		switch (opc) {

		case 1:
			// pasos
			mp.modificarEstadoPasos(codigo);
			break;

		case 2:
			// tareas
			mt.modificarEstadoTareas();
			break;
		case 3:
			// procesos
			mpro.modificarEstadoProceso();
			break;
		}
	}

	/**
	 * Registra el proceso
	 * 
	 * @param nombre nombre del proceso
	 * @param tipo del proceso
	 * @throws Exception en caso de error
	 */
	public void regitrarProceso(String nombre, String tipo) throws Exception {
		mpro.registrarProceso(nombre, tipo);

	}

	/**
	 * registra la tarea
	 * 
	 * @param codigo
	 *            es el codigo del proceso
	 * @param descripcion
	 *            es la descripcion de la tarea
	 * @throws Exception
	 *             en caso de error
	 */
	public void registrarTarea(String descripcion) throws Exception {
		int codigo = mpro.obtenerIDProceso();
		mt.registrarTarea(codigo, descripcion);

	}

	/**
	 * registra el paso
	 * 
	 * @param paso
	 *            es el paso de la tarea
	 * @throws Exception
	 *             en caso de error
	 */
	public void registrarPaso(String paso) throws Exception {
		int codigo = mt.obtenerIDTarea();
		mt.registrarTarea(codigo, paso);

	}

	/***
	 * registra la tarea
	 * 
	 * @param codigo
	 *            el codigo de proceso
	 * @param descripcion
	 *            es la descripcion de la tarea
	 * @throws Exception
	 *             en caso de error
	 */
	public void registrarTarea(int codigo, String descripcion) throws Exception {
		mt.registrarTarea(codigo, descripcion);
	}

}
