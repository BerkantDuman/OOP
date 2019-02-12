import java.util.Scanner;
public class GradeBookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Kurs Adini Giriniz");
		String kursadi = input.nextLine();
		GradeBook.SetKurs(kursadi);
		
		GradeBook.DisplayGradeBook();
		

	}

}
