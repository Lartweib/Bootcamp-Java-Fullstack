import java.util.Scanner;

public class Ejercicio5 {
	
	static Scanner leer = new Scanner(System.in);
	static int sum= 0;
	
	
	public static void main(String[] args) {

		System.out.println("Ingrese un numero: ");
		int num = leer.nextInt();
		System.out.println("El numero escogido es "+num+ " y la suma de sus digitos es igual a "+sumaDigitos(num));
	}

	static int sumaDigitos(int numero) {
		if(Integer.toString(numero).length()==1){
			String numeroStr = String.valueOf(Integer.toString(numero).charAt(0));
			sum += Integer.parseInt(numeroStr);
			return sum;
		}else {
			String numeroStr = String.valueOf(Integer.toString(numero).charAt(0));
			sum += Integer.parseInt(numeroStr);
			return sumaDigitos(Integer.parseInt(Integer.toString(numero).substring(1)));
		}
		
	}
		
	
}
