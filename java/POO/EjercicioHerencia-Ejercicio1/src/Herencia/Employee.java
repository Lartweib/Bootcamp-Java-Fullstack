package Herencia;

public class Employee {

	//Atributos
	float salary;
	
	//Constructor
	public Employee() {
		this.salary = (float) 1000.00;
	}
	public Employee(float salario) {
		this.salary = salario;
	}

	//Metodos
	public float getSalary() {
		return salary;
	}

	
	
}
