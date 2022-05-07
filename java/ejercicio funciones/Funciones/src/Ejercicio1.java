
public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(javaOrNull("java"));
		System.out.println(javaOrNull("asdas"));
	}

	static String javaOrNull(String parameter) {
		if (parameter == "java") {
			return "java";
		}else {
			return "null";
		}
		
		
	}
	
}
