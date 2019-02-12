
public class TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MaasliCalisan c1 = new MaasliCalisan("Ali","Kılıbık","AS1252",800.00);
        SaatliCalisan c2 = new SaatliCalisan("Berkant","Duman","29362133492",20,50);
        KomisyonluCalisan c3 = new KomisyonluCalisan("Atakan","Delikkaya","AB15486",1000.0,0.05);
        AsgariArtiKomisyonluCalisan c4 = new AsgariArtiKomisyonluCalisan("Berkay","Kaya","AB84565",2000.0,500.00,0.05);
        
        
        System.out.printf("%s \nKazancı: %2f \n -------------------------------------------\n",c1,c1.kazanc());
        System.out.printf("%s \nKazancı: %2f \n -------------------------------------------\n",c2,c2.kazanc());
        System.out.printf("%s \nKazancı: %2f \n -------------------------------------------\n",c3,c3.kazanc());
        System.out.printf("%s \nKazancı: %2f \n -------------------------------------------\n",c4,c4.kazanc());
        
        Calisan[] calisanlar = new Calisan[4];
       
        calisanlar[0]=c1;
        calisanlar[1]=c3;
        calisanlar[2]=c2;
        calisanlar[3]=c4;
        
        for (Calisan kisi 	: calisanlar){
        	System.out.println(kisi+"\n\n");
        	if(kisi instanceof AsgariArtiKomisyonluCalisan){
        		
        		AsgariArtiKomisyonluCalisan calisan =(AsgariArtiKomisyonluCalisan) kisi;	
        		calisan.setAsgari(1.10*calisan.getAsgari());
        		System.out.printf("%2f\n",calisan.getAsgari());
        	}
        }
        
       
	}
	

}
