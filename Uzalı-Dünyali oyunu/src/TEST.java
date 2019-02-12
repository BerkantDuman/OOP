import java.util.*;
public class TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dunyali [] dunyalilar = new Dunyali[500];
		Uzayli [] uzaylilar = new Uzayli[500];
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int devam=0;
		int toplam_puan = 0;
		do{
			int oyun_puanı=0;
//------------------------------------------------------------------------------------------------------------------------		
		for (int i=0;i<500;i++){
			int kontrol=rand.nextInt(2);
		    if (kontrol == 0){
		    	Asker yeni = new Asker(rand.nextInt(10),rand.nextInt(10));
		    	dunyalilar[i]=yeni;
		    }
		    else {
		    	ciftci yeni = new ciftci(rand.nextInt(10),rand.nextInt(10));
		    	dunyalilar[i]=yeni;
		    }
		    
// UZALı -------------------------------------------------------------------------------------------------------------
		    int kontrol2=rand.nextInt(2);
		    if (kontrol2 == 0){
		    	cyborg yeni = new cyborg(rand.nextInt(10),rand.nextInt(10));
		    	uzaylilar[i]=yeni;
		    }
		    else {
		    	Madenci yeni = new Madenci(rand.nextInt(10),rand.nextInt(10));
		    	uzaylilar[i]=yeni;
		    }
		}
//-------------------------------------------------------------------------------------------------------------------------------	
	    int uzayli_guc=0,dunyali_guc=0;
	    
	    for (int j=0;j<500;j++){
	    	uzayli_guc += uzaylilar[j].gucHesapla();
	    	
	    	dunyali_guc += dunyalilar[j].gucHesapla();
	    }
	    if (uzayli_guc > dunyali_guc){
	    	oyun_puanı=uzayli_guc - dunyali_guc;
	    	System.out.println("Dunyaliların gucu: "+dunyali_guc + "\nUzayliların gucu: " + uzayli_guc);
	    	System.out.println("UZAYLILAR KAZANDI..........\n\n");    	
	    }
	    else{
	    	oyun_puanı=dunyali_guc-uzayli_guc;
	    	System.out.println("Dunyaliların gucu: "+dunyali_guc + "\nUzayliların gucu: " + uzayli_guc);
	    	System.out.println("DÜNYALİLAR KAZANDI ........\n");
	    }
	    
	    
	    System.out.println("Oyun puanu == "+oyun_puanı);
	    
	    System.out.println("\n\nDevam etmek istemiyorsanız -1 yazın");
	    devam=input.nextInt();
	
	
	    toplam_puan += oyun_puanı;
		}while(devam != -1);
	
	
	  System.out.println("\nOyunun toplam puanı== "+toplam_puan);
	
	
	}
}
