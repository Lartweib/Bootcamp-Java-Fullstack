
public class Ejercicio4 {

	
	public static void main(String[] args) {
		char[] alfabeto = new char[26];
		char[] alfabeto2 = new char[26];
		alfabeto[0]='Z';
		System.out.print(alfabeto[0]);
		for(int i=1;i<26;i++){
			alfabeto[i]=(char)('Z'-i);
			System.out.print(alfabeto[i]);
		}
		System.out.println();
		
		for (int i=0;i<26;i++){
			alfabeto2[i]=alfabeto[i];
			alfabeto[i]=' ';
			
			for (int h=i+1;h<26;h++){
				System.out.print(alfabeto[h]);
			}
			System.out.println();
		}
		String alf="";
		for (int i=25;i>=0;i--){
			alf = alf+alfabeto2[i];
			System.out.println(alf);
		}
		System.out.println();
	}
		
}

