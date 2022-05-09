package Herencia;

public class Programmer extends Employee{
	
	//Atributos
	int bonus= (int) (this.salary*0.25);
	
	//Constructor
	public Programmer(float salario) {
		super();
		this.salary = salario;
	}

	//Metodos
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	
}
