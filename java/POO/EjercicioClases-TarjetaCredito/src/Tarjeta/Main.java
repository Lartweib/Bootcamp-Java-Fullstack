package Tarjeta;

public class Main {

	public static void main(String[] args) {
		TarjetaCredito tj1 = new TarjetaCredito();
		System.out.println(tj1.activar());
		System.out.println(tj1.anular());
		System.out.println(tj1.pagar(250, "Zapatillas Nike"));
	}

}
