
public class Ejercicio2 {

	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		while (i<11) {
			System.out.println("Bucle WHILE: "+(i));
			i++;
			if (j < 5) {
				for (j=0;j<5;j++) {
					System.out.println("Bucle FOR: "+(j+1));
				}
			}
		}
	}

}
