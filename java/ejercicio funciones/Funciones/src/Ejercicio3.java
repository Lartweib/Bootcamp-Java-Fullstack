
public class Ejercicio3 {

	static int random = (int) Math.round(Math.random()*100);
	
	public static void main(String[] args) {
		System.out.println(random);
		System.out.println(parOImpar(random));
	}

	static boolean parOImpar(int numero) {
		if (numero%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
