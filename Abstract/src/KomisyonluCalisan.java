
public class KomisyonluCalisan extends Calisan{
	private double HaftalikSatis;
	private double Komisyon;
	
	public KomisyonluCalisan(String a, String s, String tc, double satis, double komisyon){
		super(a,s,tc);
		setHaftalikSatis(satis);
		setKomisyon(komisyon);
	}

	public double getHaftalikSatis() {
		return HaftalikSatis;
	}

	public void setHaftalikSatis(double haftalikSatis) {
		if (haftalikSatis >=0.0)
		    HaftalikSatis = haftalikSatis;
		else
			throw new IllegalArgumentException("Haftalik satis miktari 0 dan büyük olmalıdır");
	}

	public double getKomisyon() {
		return Komisyon;
	}

	public void setKomisyon(double komisyon) {
		if(komisyon>0.0 && komisyon <1.0)
		    Komisyon = komisyon;
		else 
			throw new IllegalArgumentException("Komisyon miktarı 0-1 arasında olmalıdır...");
	}
	public double kazanc(){
		return getKomisyon()*getHaftalikSatis();
	}
	public String toString(){
		return String.format("Komisyonlu calisan: %s\nHaftalik satis miktarı: %2f\nKomisyon Miktarı: %2f\n",super.toString(),getHaftalikSatis(),getKomisyon());
	}

}
