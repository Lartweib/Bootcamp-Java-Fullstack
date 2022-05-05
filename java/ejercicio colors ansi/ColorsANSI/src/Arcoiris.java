
public class Arcoiris {

	final static String SPACE = "                           ";
	final static String TEXTO_DEMO = "         Texto demo          ";
	
	
	public static void main(String[] args) {
		primarios_degrade();
		super_random();
	}

	static String rgb_random() {
		int rgb_r = (int) Math.round(Math.random()*254+1);
		int rgb_g = (int) Math.round(Math.random()*254+1);
		int rgb_b = (int) Math.round(Math.random()*254+1);
		String rgb= (rgb_r+";"+rgb_g+";"+rgb_b);
		return rgb;
	}
	static void super_random() {
		for (int i=0;i<10;i++) {
			int format_r = (int) Math.round(Math.random()*4);
			String rgb_bg = rgb_random();
			String rgb_txt = rgb_random();
			System.out.println("\033["+format_r+";48;2;"+rgb_bg+";38;2;"+rgb_txt+"m"+TEXTO_DEMO);
		}
	}
	static void primarios_degrade() {
		for (int i=0;i<255;i++) {
			System.out.print("\033[0;48;2;"+i+";0;0m"+SPACE);
			System.out.print("\033[0;48;2;0;"+i+";0m"+SPACE);
			System.out.print("\033[0;48;2;0;0;"+i+"m"+SPACE+"\n");
		}
	}
}
