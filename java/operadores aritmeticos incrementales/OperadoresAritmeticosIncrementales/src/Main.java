
public class Main {
	static int num= 0;
	
	static void incrementar() {
		num++;
	}
	
	static void decrementar2() {
		num--;
		num--;
	}
	
	public static void main(String[] args) {
		System.out.println("El numero es: " + num);
		incrementar();
		System.out.println("El numero despues de incrementar es: " + num);
		decrementar2();
		System.out.println("El numero despues de decrementar es: " + num);
	}

}
