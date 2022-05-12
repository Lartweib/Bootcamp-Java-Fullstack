package Interface;

public class Main {

	public static void main(String[] args) {
		
		Profesor profesor1 = new Profesor();
		profesor1.nombre = "Federico";
		profesor1.salario = 1000;
		System.out.println("Profesor: "+profesor1.getNombre());
		System.out.println("Profesor: "+profesor1.getSalario());
		Alumno alumno1 = new Alumno();
		alumno1.nombre = "Federico";
		alumno1.curso = "Javascript";
		System.out.println("Alumno: "+alumno1.getNombre());
		System.out.println("Alumno: "+alumno1.getCurso());
		
	}

}
