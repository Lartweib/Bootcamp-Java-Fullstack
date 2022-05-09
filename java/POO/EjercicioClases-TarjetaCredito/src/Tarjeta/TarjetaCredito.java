package Tarjeta;

public class TarjetaCredito {
	
	//Constructor
	public TarjetaCredito() {
		this.entidadEmisora= "Santander";
		this.numero= 4566123378994566d;
		this.titular= "Federico Ara";
		this.vencimiento= "12/22";
	}
	public TarjetaCredito(String entidad, String titular, String fecha, double numero) {
		this.entidadEmisora= entidad;
		this.numero= numero;
		this.titular= titular;
		this.vencimiento= fecha;
	}
	
	//Atributos
	String entidadEmisora;
	String titular;
	String vencimiento;
	double numero;
	
	//Metodos
	public String activar() {
		return "La tarjeta se ecuentra activa";
	}
	
	public String pagar(int importe, String detalle) {
		
		String pago = ("Se efectuo de manera correcta el siguiente pago:\nDetalle: "+detalle+"\nImporte: $"+importe);
		return pago;
	}
	
	public String anular() {
		return "Ahora la tarjeta se encuentra anulada";
	}
}
