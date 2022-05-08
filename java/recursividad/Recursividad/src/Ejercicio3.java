
public class Ejercicio3 {

	
	public static void main(String[] args) {
		fibonacci(100);
	}

	static void fibonacci(int numero) {
		int a =1;
		int b =1;
		System.out.print("1,1,");
		fibonacci(numero, a, b);
	}
	static void fibonacci(int numero,int a, int b) {
		int c = a + b;
		System.out.print(c);
		if ((c+b)>=numero) {
			System.out.print(".");
		}else {
			System.out.print(",");
			fibonacci(numero, b, c);
		}
	}
}
