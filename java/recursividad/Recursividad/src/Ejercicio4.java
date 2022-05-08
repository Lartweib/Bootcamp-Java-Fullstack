
public class Ejercicio4 {

	static String palabra = "supercalifragilisticoespialidoso";
	
	public static void main(String[] args) {
		System.out.println(reverseString(palabra));
	}

	static String reverseString(String palabra){
        if(palabra.length()==1){
            return palabra;
        } else {
            return reverseString(palabra.substring(1)) + palabra.charAt(0);
        }
    }

}
