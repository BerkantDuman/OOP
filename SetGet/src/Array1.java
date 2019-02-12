import java.util.*;
public class Array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		int [] a = new int [5];
		
		for (int i=0;i<5;i++){
			System.out.println("Bir sayi giriniz...");
			a[i]=input.nextInt();
			
		}
        System.out.println("\nSayinin dizisindeki elemanlar:\n");
        
        for (int j=0;j<a.length;j++){
        	System.out.println("index :"+ j + "\nDeger :"+ a[j]+"\n");
        }
	}

}
