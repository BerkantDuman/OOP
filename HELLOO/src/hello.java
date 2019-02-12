import java.util.Scanner;
public class hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
        int x,y,z;
        System.out.println("bir sayi gir ");
        x=get.nextInt();
        y=get.nextInt();
        z=x+y;
        
        
        System.out.println("toplam = "+ z);
        
        if (x<y){
        	System.out.println("x küçük y dir ");
        }
        else if (x>y){
        	System.out.println("x büyük y dir");
        }
        else {
        	System.out.println("x eşittir y dir ");
        }
        System.out.println("x * y = " + (x*y));
	}

}
