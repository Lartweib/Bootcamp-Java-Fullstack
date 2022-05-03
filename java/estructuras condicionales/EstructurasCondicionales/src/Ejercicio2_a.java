
public class Ejercicio2_a {

	static float temperatura = (float) (Math.random()*30); 
	static float temperatura_formateada= (float) (Math.round(temperatura*10d)/10d);
	public static void main(String[] args) {
		clima(temperatura);
	}

	static void clima(float temperatura) {
		if (temperatura < 10) {
			if (temperatura < 5) {
				System.out.println("La temperatura es: "+temperatura_formateada+"°");
				System.out.println("Hay un clima frio polar");
			}
			if (temperatura >= 5) {
				System.out.println("La temperatura es: "+temperatura_formateada+"°");
				System.out.println("Hay un clima frio de alta montaña");
			}
		}
		if (temperatura >= 10 & temperatura < 20) {
			if (temperatura < 13.5) {
				System.out.println("La temperatura es: "+temperatura_formateada+"°");
				System.out.println("Hay un clima templado oceanico");
			}
			if (temperatura >= 13.5  & temperatura < 16.5) {
				System.out.println("La temperatura es: "+temperatura_formateada+"°");
				System.out.println("Hay un clima templado mediterraneo");
			}
			if (temperatura >= 16.5) {
				System.out.println("La temperatura es: "+temperatura_formateada+"°");
				System.out.println("Hay un clima templado continental");
			}
		}
		if (temperatura >= 20) {
			if (temperatura < 23.5) {
				System.out.println("La temperatura es: "+temperatura_formateada+"°");
				System.out.println("Hay un clima calido ecuatorial");
			}
			if (temperatura > 23.5 & temperatura < 26.5) {
				System.out.println("La temperatura es: "+temperatura_formateada+"°");
				System.out.println("Hay un clima calido tropical");
			}
			if (temperatura >= 26.5) {
				System.out.println("La temperatura es: "+temperatura_formateada+"°");
				System.out.println("Hay un clima calido desertico");
			}
		}
	}	
}
