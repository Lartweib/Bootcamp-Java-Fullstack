
public class Ejercicio1_a {

	static int random = (int) Math.round(Math.random());
			
	public static void main(String[] args) {
		oneOrZero(random);
	}

	static void oneOrZero(int numero) {
		System.out.println("Salio el numero: "+numero);
		if (numero == 0) {
			System.out.println(false + ", Negro");
		}
		if (numero == 1) {
			System.out.println(true + ", Rojo");
		}
	}
	
}
