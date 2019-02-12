
public class KalemTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Kalem rotring = new Kalem("Kırmızı","0.5");
		Kalem faber = new Kalem();
		
		faber.setRenk("Portakal");
		faber.setTip("0.9");
		
	    faber.KalemAnlat();
	    rotring.KalemAnlat();
		
		
		

	}

}
