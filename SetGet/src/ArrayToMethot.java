import java.util.*;
public class ArrayToMethot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	   int[] array= {1,2,5,6,7};
	   System.out.println("Orjinal listee");
		
	   for(int i:array)
			System.out.println(i);
	   arrayDegistir(array);
	   
	   System.out.println("\ndegistirilmis liste... \n");
	    
	   for (int i : array)
	       System.out.println(i);
	   
	   elemanDegistir(array[3]);
	   System.out.println("ElemanDegistirmeden sonra "+array[3]);
	   ArrayToMethot s1 = new ArrayToMethot();
	   s1.elemanDegistir(array[3]);

	}
	
	public static void arrayDegistir(int [] array2){
		
		for(int i=0;i<array2.length;i++){
			array2[i]*=2;
		}
		
	}
	public static void elemanDegistir(int eleman){
		eleman*=2;
		System.out.println("elemanDegisir methotundan önce"+eleman);
	
	}
}


