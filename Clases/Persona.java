package Clases;

public abstract class Persona implements Empleable{
	
//	Constantes
	
	protected double MOD;
	
	protected double IRPF;
	
//	Atributos
	
	protected String nombre;
	
	protected String apellidos;
	
	protected String dni;
	
	protected double sueldo;
	
	protected double plus;

	public Persona( String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getPlus() {
		return plus;
	}

	public void setPlus(double plus) {
		this.plus = plus;
	}
	
}
