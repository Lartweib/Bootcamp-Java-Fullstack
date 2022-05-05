
public class Main {
	
	final static String SPACE = "                           ";
	final static String SPACE_V="         ";
	final static String BLACK_B=("\033[40m");   // BLACK
	final static String RED_B=("\033[41m");   // RED
	final static String YELLOW_B=("\033[43m");  // YELLOW
	final static String BLUE_B=("\033[44m");    // BLUE
	final static String WHITE_B=("\033[47m");// WHITE
	final static String ANSI_BLACK = "\u001B[1;30m";// TEXT BLACK
	final static String ANSI_RESET = "\u001B[0m";
	
	public static void main(String[] args) {
		ucrania();
		grecia();
		francia();
		españa();
		catalunia();
		alemania();
	}
	
	static void ucrania() {
		System.out.println("\n"+WHITE_B+ANSI_BLACK+"          "+"UCRANIA"+"          \n"+ANSI_RESET);
		for (int i=0; i<8; i++) {
			if (i<=3) {
				System.out.println(BLUE_B+SPACE);
			}
			else {
				System.out.println(YELLOW_B+SPACE);
			}
		}
		System.out.print("\n");
	}
	static void españa() { 
		System.out.println("\n"+WHITE_B+ANSI_BLACK+"          "+"ESPAÑA"+"           \n"+ANSI_RESET);
		for (int i=0; i<9; i++) {
			if (i<=1 || i>=7) {
				System.out.println(RED_B+SPACE);
			}
			else {
				System.out.println(YELLOW_B+SPACE);
			}
		}
		System.out.print("\n");
	}
	static void catalunia() {
		System.out.println("\n"+WHITE_B+ANSI_BLACK+"         "+"CATALUNIA"+"         \n"+ANSI_RESET);
		for (int i=1; i<10; i++) {
			if (i%2==0) {
				System.out.println(RED_B+SPACE);
			}
			else {
				System.out.println(YELLOW_B+SPACE);
			}
		}
		System.out.print("\n");
	}
	static void alemania() {
		System.out.println("\n"+WHITE_B+ANSI_BLACK+"          "+"ALEMANIA"+"         \n"+ANSI_RESET);
		for (int i=0; i<9; i++) {
			if (i<=2) {
				System.out.println(BLACK_B+SPACE);
			}
			else if (i<=5){
				System.out.println(RED_B+SPACE);
			}
			else {
				System.out.println(YELLOW_B+SPACE);
			}
		}
		System.out.print("\n");
	}
	static void francia() {
		System.out.println("\n"+WHITE_B+ANSI_BLACK+"          "+"FRANCIA"+"          \n"+ANSI_RESET);
		for (int i=0; i<8; i++) {
			System.out.println(BLUE_B+SPACE_V+WHITE_B+SPACE_V+RED_B+SPACE_V);
		}
		System.out.print("\n");
	}
	static void grecia() {
		System.out.println("\n"+WHITE_B+ANSI_BLACK+"          "+"GRECIA"+"           \n"+ANSI_RESET);
		System.out.println(BLUE_B+"    "+WHITE_B+"  "+BLUE_B+"                     ");
		System.out.println(BLUE_B+"    "+WHITE_B+"  "+BLUE_B+"    "+WHITE_B+"                 ");
		System.out.println(WHITE_B+"          "+BLUE_B+"                 ");
		System.out.println(BLUE_B+"    "+WHITE_B+"  "+BLUE_B+"    "+WHITE_B+"                 ");
		System.out.println(BLUE_B+"    "+WHITE_B+"  "+BLUE_B+"                     ");
		System.out.println(WHITE_B+SPACE);
		System.out.println(BLUE_B+SPACE);
		System.out.println(WHITE_B+SPACE);
		System.out.println(BLUE_B+SPACE);
		System.out.print("\n");
	}
	
}
