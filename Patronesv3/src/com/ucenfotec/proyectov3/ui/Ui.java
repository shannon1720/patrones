package com.ucenfotec.proyectov3.ui;

import java.io.*;
import com.ucenfotec.proyectov3.gestor.Gestor;

public class Ui {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static Gestor cl = new Gestor();

	public static void main(String[] args) throws Exception {
		
		comenzar();

	}

	public static void comenzar() throws Exception {
		int opc;

		do {
			menu();
			opc = Integer.parseInt(in.readLine());
			opcionEscogida(opc);
		} while (opc != 10);

	}

	public static void opcionEscogida(int opc) throws Exception {
		switch (opc) {
		case 1:
			registrarEmpleado();
			break;
		case 2:
			listarEmpleado();
			break;
		case 3:
			registrarProceso();
			break;
		case 4:
			registrarProcesoTarea(false);
			break;
		case 5:
			registrarPasosTarea();
			break;
		case 6:
			listarProcesos();
			break;
		case 7:
			listarPasosTarea();
			break;
		case 8:
			modificarEstadoPaso();
			break;
			
		case 9:
			//salir 
			out.println("Au revoir poisson");
		default:
			break;

		}

	}

	public static void modificarEstadoPaso() throws Exception {
		out.println("¿Desea modificar el estado del paso?\n 1.Si \n 2.No");
		int opcion=Integer.parseInt(in.readLine());
		
		if(opcion==1) {
			
			listarProcesos();

			out.println("Digite el numero de un proceso");
			int proceso = Integer.parseInt(in.readLine());

			for (String var : cl.listarObjetosStrings(3, proceso)) {
				out.println(var.toString());
			}
			out.println("Digite el numero de la tarea");
			int tarea = Integer.parseInt(in.readLine());
			
			cl.modificarEstado(1, tarea);
			
		}
		
		
	}

	public static void listarPasosTarea() throws Exception {
		listarProcesos();

		out.println("Digite el numero de un proceso");
		int proceso = Integer.parseInt(in.readLine());

		for (String var : cl.listarObjetosStrings(3, proceso)) {
			out.println(var.toString());
		}
		out.println("Digite el numero de la tarea");
		int tarea = Integer.parseInt(in.readLine());

		for (String var : cl.listarObjetosStrings(4, tarea)) {
			out.println(var.toString());
		}

	}

	public static void listarProcesos() throws Exception {
		for (String var : cl.listarObjetosStrings(2, 0)) {
			out.println(var.toString());
		}

	}

	public static void listarEmpleado() throws Exception {

		for (String var : cl.listarObjetosStrings(1, 0)) {
			out.println(var.toString());
		}
	}

	/**
	 * 
	 * @throws Exception
	 */
	public static void registrarEmpleado() throws Exception {
		out.println("Digite el nombre");
		String nombre = in.readLine();
		out.println("Digite el apellido");
		String apellido = in.readLine();
		out.println("Digite su nombre de usuario");
		String usuario = in.readLine();
		out.println("Digite la clave");
		String clave = in.readLine();
		cl.registrarempleado(nombre, apellido, usuario, clave);

	}

	public static void registrarProceso() throws Exception {

		out.println("Digite el nombre");
		String nombre = in.readLine();
		out.println("Digite el tipo");
		String tipo = in.readLine();

		out.println("Desea registrar un tarea al proceso.\n 1.Si" + "2.No");
		int res = Integer.parseInt(in.readLine());

		if (res == 1) {

			boolean resp = true;
			registrarProcesoTarea(resp);

		}
		cl.regitrarProceso(nombre, tipo);

	}

	public static String[] registrarProcesoTarea(boolean resp) throws Exception {
		int res = 0, i = 0;
		listarProcesos();
		String[] tarea = new String[i];

		if (resp == false) {
			while (res != 2) {

				out.println("Digite el nombre de la tarea");
				String descripcion = in.readLine();
				tarea[i] = descripcion;
				i++;

				out.println("¿Desea registrar otra tarea?.\n 1.Si n\2.No");
				res = Integer.parseInt(in.readLine());
				cl.registrarTarea(descripcion);

			}
		} else {
			listarProcesos();
			out.println("Digite el numero del proceso al que le desea agregar la tarea");
			int codigo = Integer.parseInt(in.readLine());
			while (res != 2) {

				out.println("Digite el nombre de la tarea");
				String descripcion = in.readLine();
				tarea[i] = descripcion;
				i++;

				out.println("¿Desea registrar otra tarea?.\n 1.Si n\2.No");
				res = Integer.parseInt(in.readLine());
				cl.registrarTarea(codigo, descripcion);
			}

		}

		return tarea;
	}

	public static void registrarPasosTarea() throws Exception {
		int res = 0, i = 0;
		while (res != 2) {
			out.println("Digite el descripcion del paso" + (i + 1) + " de la tarea");
			String Paso = in.readLine();
			out.println("Desea registrar otro paso a la tarea.\n 1.Si n\2.No");
			res = Integer.parseInt(in.readLine());
			cl.registrarPaso(Paso);
		}
	}
	

	public static void menu() {
		out.println("Menu");
		out.println();
		out.println("1.Registrar empleado");
		out.println("2.Listar empleado");
		out.println("3.Registrar proceso.");
		out.println("4.Registrar tarea al proceso.");
		out.println("5.Registrar paso a la tarea");
		out.println("6.Listar Procesos");
		out.println("7.Listar pasos de la tarea");
		out.println("8.Modificar estado de la paso.");
		out.println("10.Salir");
		out.println("digite un menu");
	}

}
