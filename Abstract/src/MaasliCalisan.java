
public class MaasliCalisan extends Calisan {
	private double HaftalikMaas;
	
	public MaasliCalisan(String a, String s, String tc, double maas){
		super(a,s,tc);
		setHaftalikMaas(maas);
		
	}

	public double getHaftalikMaas() {
		return HaftalikMaas;
	}

	public void setHaftalikMaas(double maas) {
		HaftalikMaas = maas<0.0? 0.0:maas;
	}
	public double kazanc(){
		return getHaftalikMaas();
		
	}
	public String toString(){
		return String.format("Maasli Calisan: %s\nHaftalik maas: %2f\n",super.toString(),getHaftalikMaas());
	}

}
