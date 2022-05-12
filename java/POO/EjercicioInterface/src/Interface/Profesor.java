package Interface;

public class Profesor implements IPersona{
	//Atributos
	public String nombre;
	public float salario;
	
	//Metodo
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
