

public class Main {

	public static void main(String[] args) {

		Car coche = new Car();
		coche.drive();
		coche.drive();
		coche.refuel();
		coche.drive();
		System.out.println("---------------");
		Car coche1 = new Car(10,200,50);
		coche1.drive();
		coche1.drive();
		coche1.drive();
		coche1.refuel();
		
	}

}
