
public class Main {

	final static int num1= 1;
	final static int num2= 2;
	final static int num3= 3;
	final static int num4= 2;
	
	public static void main(String[] args) {
		System.out.println("-------------");
		igualQue(num4,num2);
		igualQue(num2,num3);
		System.out.println("-------------");
		distintoQue(num1,num3);
		distintoQue(num2,num2);
		System.out.println("-------------");
		menorQue(num4,num3);
		menorQue(num3,num1);
		System.out.println("-------------");
		mayorQue(num1,num3);
		mayorQue(num2,num4);
		mayorQue(num2,num3);
		System.out.println("-------------");
		menorIgual(num2,num3);
		menorIgual(num2,num4);
		menorIgual(num2,num1);
		System.out.println("-------------");
		mayorIgual(num1,num2);
		mayorIgual(num2,num1);
		mayorIgual(num2,num2);
	}

	public static void igualQue(int num1,int num2) {
		System.out.println(num1 + " es igual que " +num2 +"? "+(num1 == num2));
	}
	public static void mayorQue(int num1,int num2) {
		System.out.println(num1 + " es mayor que " +num2 +"? "+(num1 > num2));
	}
	public static void menorQue(int num1,int num2) {
		System.out.println(num1 + " es menor que " +num2 +"? "+(num1<num2));
	}
	public static void distintoQue(int num1,int num2) {
		System.out.println(num1 + " es mayor que " +num2 +"? "+(num1 != num2));
	}
	public static void mayorIgual(int num1,int num2) {
		System.out.println(num1 + " es mayor o igual que " +num2 +"? "+(num1 >= num2));
	}
	public static void menorIgual(int num1,int num2) {
		System.out.println(num1 + " es menor o igual que " +num2 +"? "+(num1 <= num2));
	}
}