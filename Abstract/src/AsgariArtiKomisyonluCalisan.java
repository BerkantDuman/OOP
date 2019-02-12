
public class AsgariArtiKomisyonluCalisan extends KomisyonluCalisan{
	private double asgari;
	
	public AsgariArtiKomisyonluCalisan(String a, String s, String tc , double asgari, double satis, double komisyon){
		
		super (a,s,tc,satis,komisyon);
		setAsgari(asgari);
		
	}

	public double getAsgari() {
		return asgari;
	}

	public void setAsgari(double asgari) {
		if (asgari >=0.0)
		    this.asgari = asgari;
		else 
			throw new IllegalArgumentException("Hatalı asgari ucret miktarı");
	}
	public double kazanc(){
		return getAsgari() + super.kazanc();
		
	}
	public String toString(){
		return String.format("Komisyonlu Calisan: %s\nAsgari ücreti: %2f\n",super.toString(),getAsgari());
	}
	

}
