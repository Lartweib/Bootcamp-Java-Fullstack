
public class Main {

	static void parImpar(int numero) {
		if ((numero%2)== 0) {
			System.out.println("El numero es par");
		}else {System.out.println("El numero es impar");}
		
	};
	
	public static void main(String[] args) {
		int num = (int) (Math.random()*100+1);
		System.out.println("El numero elegido es: "+num);
		parImpar(num);
	}

}
