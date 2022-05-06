
public class Printf {

	public static void main(String[] args) {
		pf_tab("federico","daniel","ara");
		pf_spc("federico","daniel","ara");
		pf_order("federico","daniel","ara");
		pf_spc2(22);
		pf_ceros(22);
		pf_float(17.1829327);
		pf_ret("Hola","Mundo");
	}

	static void pf_tab(String nombre, String apellido1, String apellido2) {
		System.out.printf("%s\t%s\t\t%s\n",nombre, apellido1, apellido2);
	}
	static void pf_spc(String nombre, String apellido1, String apellido2) {
		System.out.printf("%S    %s%s\n",nombre, apellido1, apellido2);
	}
	static void pf_order(String nombre, String apellido1, String apellido2) {
		System.out.printf("%3$s,%2$s,%1$s\n",nombre, apellido1, apellido2);
	}
	static void pf_spc2(int numero) {
		System.out.printf("     %d\n",numero);
	}
	static void pf_ceros(int numero) {
		System.out.printf("%010d\n",numero);
	}
	static void pf_float(double numero) {
		System.out.printf("%012.2f\n",numero);
	}
	static void pf_ret(String palabra1,String palabra2) {
		System.out.printf("%s%s",palabra1, palabra2);
	}
}
