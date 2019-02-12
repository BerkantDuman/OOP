
public class Asker extends Dunyali {
    private int silah_gucu;
 
    public Asker(int savunma , int silah){
    	super(savunma);
    	setSilah_gucu(silah);
    }

	public int getSilah_gucu() {
		return silah_gucu;
	}

	public void setSilah_gucu(int silah_gucu) {
		this.silah_gucu = silah_gucu;
	}
    
    public int gucHesapla(){
    	return getSilah_gucu()*super.getSavunma();
    }
}
