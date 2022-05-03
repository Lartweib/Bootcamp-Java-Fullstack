
public class Ejercicio1_c {

	static int random = (int) Math.round(Math.random());
			
	public static void main(String[] args) {
		oneOrZero(random);
	}

	static void oneOrZero(int numero) {
		System.out.println("Salio el numero: "+numero);
		System.out.println(numero == 0 ? false + ", Negro" : true + ", Rojo");
	}
	
}