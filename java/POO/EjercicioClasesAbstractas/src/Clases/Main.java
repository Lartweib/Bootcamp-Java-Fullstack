package Clases;

public class Main {

	public static void main(String[] args) {
		
		
		Planta planta1= new Planta();
		AnimalCarnivoro anCarnivoro1 = new AnimalCarnivoro();
		AnimalHerbivoro anHerbivoro1 = new AnimalHerbivoro();
		
		planta1.alimentarse();
		anCarnivoro1.alimentarse();
		anHerbivoro1.alimentarse();
	}

}
