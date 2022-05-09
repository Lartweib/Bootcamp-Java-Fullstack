package Personas;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.nombres = "Federico";
		cliente1.apellidos = "Ara";
		cliente1.documento = 36716172;
		cliente1.tipo= "DNI";
		cliente1.categoria = "Frecuente";
		cliente1.codigo = cliente1.generarCodigo();
		
		System.out.println(cliente1.codigo +","+ cliente1.documento);
		
		Empleado empleado1 = new Empleado();
		empleado1.nombres = "Jorge";
		empleado1.apellidos = "Gomez";
		empleado1.documento = 29233443;
		empleado1.tipo= "DNI";
		empleado1.tipoContrato = "Indefinido";
		empleado1.sueldo = 1200;
		
		System.out.println(empleado1.nombres +","+ empleado1.apellidos);
		System.out.println(empleado1.calcularSueldo());
	}

}
