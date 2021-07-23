package Clases;

public abstract class Empleado extends Persona implements Empleable{

	public Empleado(String nombre, String apellidos, String dni) {
		super( nombre, apellidos, dni);
	}
}
