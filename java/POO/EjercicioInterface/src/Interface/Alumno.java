package Interface;

public class Alumno {
	//Atributos
	public String nombre;
	public String curso;
	
	//Metodo
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
