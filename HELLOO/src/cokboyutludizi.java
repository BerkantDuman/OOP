import java.util.*;
public class cokboyutludizi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		
		int [][]dizi1= new int[3][4];
		int [][]dizi2 ={{1,2,3},{2,3,5}};
		int [][]dizi3 ={{1,2},{9,8,7}};
		int [][]dizi4= new int [2][];
		
		dizi4[0]=new int [5];  //ilk satir 5 sutundan olusur
		dizi4[1]= new int [2]; // 2. satir iki sutundan olusur
		
		System.out.println("dizi 3 satir sayisi"+dizi3.length);
		System.out.println("dizi 3'ün ilks satırının sutun sayısı"+dizi3[0].length);
		System.out.println("dizi 3'ün 2. satırının stun sayisi"+dizi3[1].length);
		
		diziGoster(dizi1);
		System.out.println("");
		diziGoster(dizi2);
		System.out.println("");
		diziGoster(dizi3);
		System.out.println("");
		
		int [][]dizi5=RandomMatrisYap(3,3);
		
		diziGoster(dizi5);

	}
	public static void diziGoster(int [][]dizi){
		for (int i=0;i<dizi.length;i++){
			System.out.print("\n");
			for(int j=0;j<dizi[i].length;j++){
				System.out.print(dizi[i][j]);
			}
		}
		
	}
	public static int [][] RandomMatrisYap(int satir , int sutun){
	    int [][]matris = new int[satir][sutun];
		for (int i=0;i<satir;i++){
			for(int j=0;j<sutun;j++){
				matris[i][j]=(int)(Math.random()*2);  // math metdouyla random atama
			}
		}
		return matris;
	}

}
