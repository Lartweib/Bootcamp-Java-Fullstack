
public class Ejercicio3 {

	static int numero= (int) (Math.round(Math.random()*9));
	static String numString = "";
	
	public static void main(String[] args) {
		System.out.println("Numero ingresado: "+numero);
		aTexto(numero);
		System.out.println("Numero en texto: "+numString);
	}
	
	static void aTexto(int numero) {
		switch (numero) {
		case 1: numString = "Uno";
				break;
		case 2: numString = "Dos";
				break;
		case 3: numString = "Tres";
				break;
		case 4: numString = "Cuatro";
				break;
		case 5: numString = "Cinco";
				break;
		case 6: numString = "Seis";
				break;
		case 7: numString = "Siete";
				break;
		case 8: numString = "Ocho";
				break;
		case 9: numString = "Nueve";
		}
	}
	
}
