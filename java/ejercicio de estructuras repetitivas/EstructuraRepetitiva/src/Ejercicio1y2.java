import java.util.Scanner;

public class Ejercicio1y2 {
	
	public static void main(String[] args) {
        System.out.print ("Por favor introduzca un numero entero:");
		int entradaTeclado = 0;
		Scanner entradaScanner = new Scanner (System.in); //Creacion de obj scanner
		entradaTeclado = entradaScanner.nextInt(); //Invocamos un metodo sobre un obj Scanner
		div(entradaTeclado,2);
		div(entradaTeclado,3);
	}
	
	static void div (int numero, int divisible) {
		System.out.println("\nEl numero ingresado es "+numero);
		System.out.println("Los numeros divisibles por "+divisible+" son los siguientes:");
		for (int i=0;i<=numero;i++) {
			if (i%divisible==0) {
				System.out.print(i);
				if (i==numero || i==numero-1) {
					System.out.println(".");
				}else {
					System.out.print(", ");
				}
			}else {
				continue;
			}
		}		
	}

}