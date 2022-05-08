package tablaPrintf;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnosList = new ArrayList<Alumno>();
		// Añadiendo peliculas al arrayList
		alumnosList.add(new Alumno("Federico", "Ara", "Python",2020));
		alumnosList.add(new Alumno("Raul", "Vazpe", "Javascript", 2021));
		alumnosList.add(new Alumno("Alex", "Voces", "Java", 2022));

		System.out.printf("%20s%20s%20s%20s%n", "Nombre", "Apellido", "Curso", "Año");
		System.out.println("\t----------------------------------------------------------------------------");
		for (Alumno alumno: alumnosList) {
			System.out.printf("%20s%20s%20s%20s%n", alumno.nombre, alumno.apellido, alumno.curso, alumno.anio);
		}

		System.out.printf("%-20s%-20s%-20s%-20s%n", "Nombre ", "Apellido", "Curso", "Año");
		System.out.println("--------------------------------------------------------------------");
		for (Alumno alumno: alumnosList) {
			System.out.printf("%-20s%-20s%-20s%-20d%n", alumno.nombre, alumno.apellido, alumno.curso, alumno.anio);
		}
	}

	public static class Alumno {
		String nombre = "";
		String apellido = "";
		String curso = "";
		int anio = 0;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}
		
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCurso() {
			return apellido;
		}
		
		public void setCurso(String curso) {
			this.curso = curso;
		}

		public int getAnio() {
			return anio;
		}

		public void setAnio(int anio) {
			this.anio = anio;
		}


		public Alumno(String nombre, String apellido, String curso, int anio) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.curso = curso;
			this.anio = anio;
		}
	}
}