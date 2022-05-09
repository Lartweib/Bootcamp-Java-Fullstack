package Herencia;

public class Main {

	
	public static void main(String[] args) {
		Programmer p1 = new Programmer(1000.00f);
		System.out.println("Salario: " + p1.getSalary());
		System.out.println("Bonus: " + p1.getBonus());
	}

}
