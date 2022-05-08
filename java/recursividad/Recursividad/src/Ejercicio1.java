
public class Ejercicio1 {

	static String[] tecnologies = {"Markdown", "Regex", "HTML", "CSS", "JS", "SQL", "Java"};
	
	public static void main(String[] args) {
		recorrerArray();
	}

	
	static void recorrerArray () {
		recorrerArray(0);
	}
	static void recorrerArray (int numero) {
		if (numero<tecnologies.length) {
			System.out.println(tecnologies[numero]);
			if (numero==(tecnologies.length-1)) {
				System.out.println("Fin del array");
			}else {
				recorrerArray(numero+1);
			}
		}else {
			System.out.println("El numero pasado excede el rango del array");
		}
	}
	
}
