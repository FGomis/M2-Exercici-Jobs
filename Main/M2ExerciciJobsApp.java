package Main;

import java.util.ArrayList;

import Clases.*;
import Metodos.Metodos;

public class M2ExerciciJobsApp {

	public static void main(String[] args) {
		Metodos metodos = new Metodos();
//		Creamos un arraylist donde guardaremos todos los empleados despues de crearlos
		ArrayList<Persona> plantilla = new ArrayList<>();
		
		Manager manager = new Manager("Pepe", "Garcia Perez", "123345678A");
		Junior junior = new Junior("Josefa", "Gomez Motos", "87654321B");
		Mid mid = new Mid("Marcos", "Valero Martin", "12345678B");
		Senior senior = new Senior("Marta", "Ramirez Valle", "87654321B");
		Jefe jefe = new Jefe("Marina", "de la Torre Matos", "123345678C");
		Voluntario voluntario = new Voluntario("Juan María", "Calero Garcia", "87654321C");
		
		plantilla.add(manager);
		plantilla.add(jefe);
		plantilla.add(junior);
		plantilla.add(mid);
		plantilla.add(senior);
		plantilla.add(voluntario);

		metodos.menuInicial(plantilla);

	}

	
}
