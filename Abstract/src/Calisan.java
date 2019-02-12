import java.util.*;
public abstract class Calisan {
	private String isim;
	private String soyisim;
	private String tcno;
	
	public Calisan(String a, String s,String tc){
		this.isim =a;
		this.soyisim =s;
		this.tcno=tc;
		
		
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getTcno() {
		return tcno;
	}

	public void setTcno(String tcno) {
		this.tcno = tcno;
	}
	public abstract double kazanc();
	
	public String toString(){
		return String.format("%s %s\ntcno:%s\n",getIsim(),getSoyisim(),getTcno());
	}

}
