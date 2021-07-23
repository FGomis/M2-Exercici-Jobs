package Clases;

public class ExcepcionRango extends Exception{
	
	private int codigoExcepcion;

	public ExcepcionRango(int codigoExcepcion) {
		super();
		this.codigoExcepcion = codigoExcepcion;
	}

	public ExcepcionRango() {
		super();
	}

	public String getMessage() {
		String mensaje = "El sueldo indicado no está en el rango correspondiente al puesto del empleado.\n";
		switch (codigoExcepcion) {
		case 0:
			mensaje += "Para un jefe debe ser superior a 8000€.";
			break;
		case 1:
			mensaje += "Para un manager debe estar entre 3000 y 5000 €.";
			break;
		case 2:
			mensaje += "Para un senior debe estar entre 2700 y 4000 €.";
			break;
		case 3:
			mensaje += "Para un mid debe estar entre 1800 y 2500 €.";
			break;
		case 4:
			mensaje += "Para un junior debe estar entre 900 y 1600 €.";
			break;
		case 5:
			mensaje += "Los voluntarios reciben un compensación del gobierno de un máximo de 300 €.";
			break;
		}
		return mensaje;
		}
	}
