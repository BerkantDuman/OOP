
public class personelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personel isci1 = new Personel("ali","Mahmut","A4525B",40,0.1);
		tabanmaaslipersonel isci2 = new tabanmaaslipersonel ("Haydar","baş","A8892B", 40,0.5,400);
		
		double maas1,maas2;
		
		System.out.println(isci1);
	    System.out.println(isci1.MaasHesapla());	
	    
	    System.out.println(isci2);
	    System.out.println(isci2.maasHesapla());
	    
		

	}

}
