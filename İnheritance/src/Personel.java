
public class Personel
{
    protected String Ad;
    protected String SoyAd;
    protected String sskNo;
    protected double satis;        // Aylik satis sayisi
    protected double Komisyon;     //Ürün başına komisyon
	
   
    public Personel(String ad, String soyad, String ssk, double sat , double komisyon){
    	this.Ad=ad;
    	this.SoyAd=soyad;
    	this.sskNo=ssk;
    	//this.satis=sat;
    	//this.Komisyon=komisyon;
    	setSatis(sat);
    	setKomisyon(komisyon);
    }
    public double MaasHesapla(){
    	return satis*Komisyon;
    }
    public String toString(){
    	return "Personel \t" +Ad+"\t"+SoyAd+ "\t"+satis+"\t"+Komisyon+"--------->"+ sskNo;
    }
	public String getAd() {
		return Ad;
	}
	public void setAd(String ad) {
		Ad = ad;
	}
	public String getSoyAd() {
		return SoyAd;
	}
	public void setSoyAd(String soyAd) {
		SoyAd = soyAd;
	}
	public String getSskNo() {
		return sskNo;
	}
	public void setSskNo(String sskNo) {
		this.sskNo = sskNo;
	}
	public double getSatis() {
		return satis;
	}
	public void setSatis(double satis) {
		if (satis >=0){		
		this.satis = satis;
		}
		else{
			System.out.println("satis >= 0 olmalı");
		}
	}
	public double getKomisyon() {
		return Komisyon;
	}
	public void setKomisyon(double komisyon){
		if (komisyon>0.0 && komisyon<1)
		{
			this.Komisyon=komisyon;
		}
		else{
			System.out.println("yanlış komisyon girildi");
		}
	}
    
}
	