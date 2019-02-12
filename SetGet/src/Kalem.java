
public class Kalem {
    private String renk;
    private String tip;
    
    public Kalem(){
    	
    }
    public Kalem(String renk, String tip){
    	this.renk=renk;
    	this.tip=tip;
    }
    
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public void KalemAnlat (){
		System.out.println("Kalemin rengi = "+ renk +"\nKalemin tipi = "+tip);
		System.out.println("\n-----------------------------------------------------------------------------------\n");
	}
}
