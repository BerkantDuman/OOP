
public class ciftci extends Dunyali {
    private int urun_sayisi;
    
    public ciftci(int savunma ,int urunsayisi){
    	super(savunma);
    	setUrun_sayisi(urunsayisi);
    }


	public int getUrun_sayisi() {
		return urun_sayisi;
	}

	public void setUrun_sayisi(int urun_sayisi) {
		this.urun_sayisi = urun_sayisi;
	}
	public int gucHesapla(){
		return getUrun_sayisi();
	}
}