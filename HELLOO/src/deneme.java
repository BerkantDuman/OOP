import java.util.*;
public class deneme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	float [] liste = {1,2,3,4,5,6,7,8,9};
    float ort;
    ort=mtd(liste[0],liste[1],liste[2]);
    
    
    System.out.println(ort);

	//diziler deki elemanları teker teker gönderip işlem yap
	int [] dizi={1,2,3,4,5,6,7,8,9,10};
	for (int i=0;i<dizi.length;i++){

	   dizi[i]=mtd2(dizi[i]);
	}
	
	for (int k=0;k<dizi.length;k++){
	    dizi[k]=mtd3(dizi[k]);
	}
	for (int j:dizi)
		System.out.print(j+" ");
	
	
	}	
	public static float mtd(float...nums){
		float top =0;
		for (float f:nums)
			top += f;
		
		return top/nums.length ;
	}
	public static int mtd2(int eleman){
		if (eleman>5){
			eleman=eleman*eleman;
		}
		return eleman;
		
		
    }
	public static int mtd3(int eleman){
		
		if(eleman<5){
			eleman*=eleman;
		}
		return eleman;
	}
}
	



