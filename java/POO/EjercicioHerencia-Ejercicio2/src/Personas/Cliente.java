package Personas;

public class Cliente extends Persona{
	
	//atributos
	String categoria;
	int codigo;
	
	//metodos
	public int generarCodigo() {
		int random = (int) Math.round(Math.random()*400);
		return random;
	}
}
