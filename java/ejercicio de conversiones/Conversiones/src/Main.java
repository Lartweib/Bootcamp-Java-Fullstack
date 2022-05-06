
public class Main {

	static byte numByte = 1;
	static short numShort = numByte;
	static int numInt = numShort;
	static long numLong = numInt;
	static float numFloat = numLong;
	static double numDouble = numFloat;
	
	static double numDouble1 = numDouble;	
	static float numFloat1 = (float) numDouble1;
	static long numLong1 = (long) numFloat1;
	static int numInt1 = (int) numLong1;
	static short numShort1 = (short) numInt1;
	static byte numByte1 = (byte) numShort1;
	
	static byte byte100= 100;
	
	public static void main(String[] args) {
		
		System.out.println("Double: "+numDouble1);
		System.out.println("Float: "+numFloat1);
		System.out.println("Long: "+numLong1);
		System.out.println("Int: "+numInt1);
		System.out.println("Short: "+numShort1);
		System.out.println("Byte: "+numByte1);
		System.out.println();
		System.out.println("Byte: "+numByte);
		System.out.println("Short: "+numShort);
		System.out.println("Int: "+numInt);
		System.out.println("Long: "+numLong);
		System.out.println("Float: "+numFloat);
		System.out.println("Double: "+numDouble);
		System.out.println();
		System.out.println("Byte 100 : "+byte100);
		int byte100int = (int) byte100;
		byte100int = (byte100 * 2);
		System.out.println("Byte 100 x 2 : "+(byte100int));

	}

}
