package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Voluntario extends Persona{

//	Constantes

	protected double MOD = 0.1;

	protected double IRPF = 0.26;

//	Constructor principal
	public Voluntario(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
	}

	@Override
//	Metodo para generar un sueldo mensual base
	public void generarSueldo() {
//		Generamos el sueldo base bruto según el rango del tipo de empleado
		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Indica el sueldo de " + nombre + " " + apellidos + "\nPuesto: Voluntario"));
		int min = 0;
		int max = 300;
		try {
			if(!comprobarRango(max, min, sueldo)) {
				throw new ExcepcionRango(5);
			} else {
				this.sueldo = sueldo;
			}
		} catch (ExcepcionRango e) {
			JOptionPane.showMessageDialog(null, new JTextArea(e.getMessage()));
			generarSueldo();
		}
	}

	@Override
//	Método para calcular el sueldo bruto mensual aplicando la modificación por tipo de empleado
	public double sueldoBrutoMensual() {
		double extra = sueldo * MOD;
//		Aplicamos la modificación del sueldo dependiendo del tipo de empleado
		double sueldoBrutoFinal = sueldo + extra;
		return sueldoBrutoFinal;
	}

	@Override
//	Método para calcular el sueldo neto aplicandole la reducción del IRPF
	public double sueldoNetoMensual() {
		double sueldoBruto = sueldoBrutoMensual();
		double sueldoNeto = sueldoBruto - (sueldoBruto * IRPF);
		return sueldoNeto;
	}

	@Override
	public void desglosePagoSueldo() {
		System.out.println("Desglose de sueldo\n" + "---------------------------\n" + "Empleado: " + nombre + " "
				+ apellidos + "\nAyuda gubernamental de " + sueldo + " euros.");
	}

	@Override
	public double plus() {
		return 0;
	}

	@Override
	public boolean comprobarRango(int max, int min, double sueldo) {
		if (sueldo >= min && sueldo <= max) {
			return true;
		} else {
			return false;
		}
		
	}

}
