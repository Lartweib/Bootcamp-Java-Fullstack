package Personas;

public class Empleado extends Persona{
	
	//atributos
	String tipoContrato;
	int sueldo;
	
	//metodos
	public int calcularSueldo() {
		int sueldoFinal = (int) (this.sueldo*1.2);
		return sueldoFinal;
	}
}
