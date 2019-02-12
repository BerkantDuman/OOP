
public class cyborg extends Uzayli{
    private int lazer_gucu;
    
    public cyborg(int savunma,int lazer){
    	super(savunma);
    	setLazer_gucu(lazer);
    }

	public int getLazer_gucu() {
		return lazer_gucu;
	}

	public void setLazer_gucu(int lazer_gucu) {
		this.lazer_gucu = lazer_gucu;
	}
    public int gucHesapla(){
    	return getLazer_gucu()*super.getSavunma();
    }
    
}
