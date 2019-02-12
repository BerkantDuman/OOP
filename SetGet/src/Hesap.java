
public class Hesap {
    private double bakiye;
    
    public Hesap(){
    	
    }
    public Hesap(double MevcutBakiye){
    	if (MevcutBakiye>0)
    	this.bakiye = MevcutBakiye; 
    }

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public void ParaEkle(double miktar){
		this.bakiye=this.bakiye+miktar;
	}
}
