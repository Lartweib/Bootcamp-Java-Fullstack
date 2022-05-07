import java.util.Scanner;

public class Ejercicio2 {

	
	
	public static void main(String[] args) {

		int intentos = 1;
		while (intentos<=5) {
			System.out.print ("Por favor introduzca el nombre de usuario: ");
			Scanner entradaScanner = new Scanner (System.in); //Creacion de obj scanner
			String entradaLogin = entradaScanner.nextLine(); //Invocamos un metodo sobre un obj Scanner
			System.out.print ("Por favor introduzca la contraseña: ");
			String entradaPass = entradaScanner.nextLine(); //Invocamos un metodo sobre un obj Scanner
			String validacion =login(entradaLogin,entradaPass);
			if (validacion.equals("Login true")){
				System.out.println("Login true");				
				System.out.println("Fin del programa");		
				break;
			}else {
				System.out.println(validacion);
				intentos ++;
			}
		}
		
	}

	static String login(String user, String pass) {
		if (user.equals("admin")) {
			if (pass.equals("1234")) {
				return "Login true";
			}else {
				return "Login false: contraseña incorrecta";
			}
		}else {
			return "Login false: usuario incorrecto";
		}
	}
}
