
public class Madenci extends Uzayli {
    private int maden_sayisi;
    
    public Madenci(int savunma, int maden){
    	super(savunma);
    	setMaden_sayisi(maden);
    }
	public int getMaden_sayisi() {
		return maden_sayisi;
	}
	public void setMaden_sayisi(int maden_sayisi) {
		this.maden_sayisi = maden_sayisi;
	}
	public int gucHesapla(){
		return getMaden_sayisi();
	}
    
}
