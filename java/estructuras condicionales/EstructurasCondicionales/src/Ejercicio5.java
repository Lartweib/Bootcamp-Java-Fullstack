
public class Ejercicio5 {

	public static void main(String[] args) {
		arbolito();
	}
	
	static void arbolito() {
        int i,j,k,n;
        n=10; 
        for(i=1; i<n+(n/2)-2; i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){
                System.out.print("*");}
            System.out.println("");
        }
        for(i=1; i<n-(n/2)-1; i++){
            for(j=n+(n/2)-2; j>1; j--){
                System.out.print(" ");}
            for(k=n/2; k<=(n/2)+4; k++){
                System.out.print("*");}
            System.out.println("");
        }
    }
}
