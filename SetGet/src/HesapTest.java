import java.util.Scanner;
public class HesapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Hesap hesap1 = new Hesap();
		Hesap hesap2 = new Hesap(150000);
		Hesap hesap3 = new Hesap(-15);
        
		System.out.println("Bu hesaptaki toplam bakiyeniz == "+ hesap1.getBakiye());
		System.out.println("Bu hesaptaki toplam bakiyeniz =="+ hesap2.getBakiye());
		System.out.println("Bu hesaptaki toplam bakiyeniz == "+ hesap3.getBakiye());
		
		
		hesap3.ParaEkle(600);
		System.out.println("\n-----------------------------------------------------------------------------------\n");
		
		System.out.println("Bu hesaptaki toplam bakiyeniz == "+ hesap1.getBakiye());
		System.out.println("Bu hesaptaki toplam bakiyeniz == "+ hesap2.getBakiye());
		System.out.println("Bu hesaptaki toplam bakiyeniz == "+ hesap3.getBakiye());
	
	    System.out.println("Hesabınıza eklemek istediğiniz para miktarını giriniz...");
	    hesap1.setBakiye(input.nextDouble());
	    
	    System.out.println("\n-----------------------------------------------------------------------------------\n");
	    System.out.println("Hesabınıza istediğiniz miktar yükleniyor ...");
	    System.out.println("\n-----------------------------------------------------------------------------------\n");
	    
	    System.out.println("Bu hesaptaki toplam bakiyeniz == "+ hesap1.getBakiye());
		System.out.println("Bu hesaptaki toplam bakiyeniz == "+ hesap2.getBakiye());
		System.out.println("Bu hesaptaki toplam bakiyeniz == "+ hesap3.getBakiye());
		
		
	}

}
