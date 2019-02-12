import java.util.Scanner;
public class setgettest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String isim,soyisim;
		int yas;
		
		
		
		System.out.println("Ögrencinin adını giriniz...");
		isim=input.nextLine();
		setget.SetName(isim);
		
		System.out.println("Öğrencinin soy ismini giriniz...");
		soyisim=input.nextLine();
		setget.SetLastName(soyisim);
		
		System.out.println("Öğrencinin yaşını giriniz");
		yas=input.nextInt();
		setget.SetAge(yas);
		
		System.out.println("Girdiğiniz öğrencinin adı = "+isim + "\nSoyadi = "+ soyisim + "\nYaşı = "+ yas);
		

	}

}
