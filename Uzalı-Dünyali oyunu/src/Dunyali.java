
public abstract class Dunyali {
	private int savunma;
	public Dunyali(int savunma){
		setSavunma(savunma);
	}
	
	
     public int getSavunma() {
		return savunma;
	}


	public void setSavunma(int savunma) {
		this.savunma = savunma;
	}


	public abstract int gucHesapla();   
}
