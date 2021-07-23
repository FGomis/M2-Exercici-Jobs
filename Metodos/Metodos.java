package Metodos;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import Clases.*;

public class Metodos {
	
//	Método que genera la ventana de menú principal
	public void menuInicial(ArrayList<Persona> plantilla) {
//		Pedimos al usuario que seleccione una opción del menú
		String[] botones = { "Establecer sueldos", "Pagar plantilla", "Añadir plus"};
		int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Menú principal",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
		switch (seleccion) {
		case 0:
			setearSueldos(plantilla);
			break;
		case 1:
			mostrarSueldosPlantilla(plantilla);
			break;
		case 2:
			pagarPlusPlantilla(plantilla);
			break;
		}
	}

//	Método para indicar el sueldos de los empleados
	public void setearSueldos(ArrayList<Persona> plantilla) {
		Iterator<Persona> it = plantilla.iterator();
		while(it.hasNext()) {
			it.next().generarSueldo();
		}
		menuInicial(plantilla);
	}
	
//	Método para mostrar todos los sueldos de la plantilla
	public void mostrarSueldosPlantilla(ArrayList<Persona> plantilla) {
		Iterator<Persona> it = plantilla.iterator();
		
		System.out.print("SUELDOS PLANTILLA\n");
		while(it.hasNext()) {
			System.out.print("************************\n");
			it.next().desglosePagoSueldo();
		}
		menuInicial(plantilla);
	}
	
//	Método para añadir un plus a cada empleado
	public void pagarPlusPlantilla(ArrayList<Persona> plantilla) {
		Iterator<Persona> it = plantilla.iterator();
		
		System.out.print("PLUSES PLANTILLA\n");
		while(it.hasNext()) {
			System.out.print("************************\n");
			Persona empleado = it.next();
			empleado.setPlus(empleado.plus());
			System.out.println(empleado.getNombre() + " " + empleado.getApellidos() + " recibe un bonus anual de " + empleado.plus() + " euros.");
		}
	}
}
