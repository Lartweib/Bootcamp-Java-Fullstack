
public class Ejercicio4 {

	public static void main(String[] args) {
		int number = (int)(Math.random()*(100-(-100)+1)+(-100));
		
		String condicion = number < 0 ? "�Es negativo!" : (number == 0 ? "�Es cero, na de n�!" : "�Es positivo!");
		
		System.out.println("El numero es: "+number +" "+ condicion);
	}

}
