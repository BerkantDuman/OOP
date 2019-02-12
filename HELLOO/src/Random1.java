import java.util.Random;
public class Random1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Random rand = new Random();
	int [] array = new int [12];
	
	for (int i =0;i<array.length;i++){
		array[i]=rand.nextInt(10);
		
	    }
	for (int j=0;j<array.length;j++){
		System.out.print(array[j]+" ");
	    }
	System.out.println("\nFonksiyondan önceeeee........................................\n");
	
	komsuSil(array);
	
	for (int k=0;k<array.length;k++){
		System.out.print(array[k]+" ");
	
	}
	System.out.println("\nFonksiyondan Sonraaa........................................\n");
	
	}
	public static int[] komsuSil (int [] array){
	    for (int i=1;i<array.length;i +=2){
	    	if (array[i-1]>array[i]){
	    		array[i-1]=array[i]=-1;
	    	}
	    }
		
		
		
		return array;
	}

}
