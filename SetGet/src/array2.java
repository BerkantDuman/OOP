
public class array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ARRAY_LENGTH = 6;
		
		int[] a =new int[ARRAY_LENGTH];
		
		for(int i=0;i<a.length;i++){
			a[i]=2+2*i;
		}
		for(int i=0;i<a.length;i++){
			System.out.println("index :"+ i + "\nDeger :"+ a[i]+"\n");
		}
		
		
	}
	

	

}
