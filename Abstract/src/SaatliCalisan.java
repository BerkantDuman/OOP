
public class SaatliCalisan extends Calisan {
    private double ucret;
    private double saat;
    
    public SaatliCalisan(String a, String s, String tc, double ucret,double saat){
    	super(a,s,tc);
    	setUcret(ucret);
    	setSaat(saat);
    	
    }

	public double getUcret() {
		return ucret;
	}

	public void setUcret(double ucret) {
		if(ucret >=0.0)
		    this.ucret = ucret;
		else
			throw new IllegalArgumentException("Girilen ucret 0 dan büyük olmalıdır...");
	}

	public double getSaat() {
		return saat;
	}

	public void setSaat(double saat) {
		if(saat >=0.0 && saat <=168)
		    this.saat = saat;
		else 
			throw new IllegalArgumentException("Calisama saat 0-168 arasında olmalıdır");
	}
	public double kazanc(){
		if(getSaat()<=40)
			return getSaat()*getUcret();
		else 
			return 40*getUcret() + (getSaat()-40)*getUcret()*1.5;
		
	}
	public String toString(){
		return String.format("Saatlik ücreli calisan isci: %s\nSaatlik ücreti: %2f \nCalisama Saati: %2f\n",super.toString(),getUcret(),getSaat());
	}
}
