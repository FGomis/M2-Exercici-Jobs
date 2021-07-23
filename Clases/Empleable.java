package Clases;

public interface Empleable {

	public void generarSueldo();
	
	public double sueldoBrutoMensual();
	
	public double sueldoNetoMensual();
	
	public void desglosePagoSueldo();
	
	public boolean comprobarRango(int min, int max, double sueldo);
	
	public double plus();
	
}
