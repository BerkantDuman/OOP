
public class tabanmaaslipersonel extends Personel{
	private double tabanmaas;
	
	public tabanmaaslipersonel(String ad,String soyad,String sskno, double komisyon, double satis,double tabanmaas){
		super(ad,soyad,sskno,komisyon,satis);//bu clasın consructer'ı hangi sırada yazılmışsa yine öyle yazılmalı;
		setTabanmaas(tabanmaas);
		
	}
	public double getTabanmaas() {
		return tabanmaas;
	}
	public void setTabanmaas(double tabanmaas) {
		this.tabanmaas = tabanmaas;
	}
	public String toString(){
		return "Personel \t" +Ad+"\t"+SoyAd+ "\t"+satis+"\t"+Komisyon+"----------->"+sskNo;
	}
	public double maasHesapla(){
		return tabanmaas + (Komisyon*satis);
	}

}
