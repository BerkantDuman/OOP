import java.util.ArrayList;


public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Object> list1 = new ArrayList<Object>();
        
		list1.add(3);
		list1.add(0);
		list1.add(7,0);
		list1.add('e');
		int elemanSayisi=list1.size();
		
		System.out.println("Eleman Sayisi = "+elemanSayisi);
		
		for (int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));  // Get(i) dizi listedeki elemanı yazdırmak için
		    
		}
		for (Object obje :list1){    // FOR EACH DÖNGÜSÜ
			System.out.println(obje);
		}
		
		//listeye girilen değerin kaçıncı sırada olduğunu gösterir
		System.out.println("3 sayisinin kaçıncı sırada olduğunu gösterir: "+ list1.indexOf(3));
		System.out.println("üstekinin aynısı : "+ list1.indexOf("e"));
		
		//Liste boşmu kontrolu yapar
		System.out.println("Liste boş mu ? :"+ list1.isEmpty());
		
	    list1.set(2,20); //dizi'nin 2. indexine 20 yi atar altaki elemanların indexi 1 arttar
	    goster(list1);
		list1.clear(); //Listeinin tamamını siler
		list1.remove(1); // indexi 1 olan elemanı silerrrrr	
	}
	public static void goster(ArrayList<Object> liste)
	{

		for (int i=0;i<liste.size();i++){
			System.out.println(liste.get(i));  // Get(i) dizi listedeki elemanı yazdırmak için
		    
		}	
	}

}
