
public class TST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		sinif1 s2;
		sinif2 s4,s3;
		sinif3 s5,s6;
		s2=new sinif2();
		s3=new sinif2();
		s4=new sinif3();
		s5=new sinif3();
		s2.mtd();
		System.out.println("\n");
		s4.mtd();
		System.out.println("\n");
		//s2.mtd1();
		s5.mtd1();
		int ali=20;
		System.out.println(ali=ali+1*2);
		
		int i=0 , top=0;
		for  (i=0;i<10;i++){
			if (i%2 != 1)
				break;
			top +=1*2;
			continue;
		}
		System.out.println(top);
		
		int x=5;
		System.out.println(mtd(x++));
		
	}
	public static int mtd(int x){
		System.out.println("1."+x);
		return mtd2(x++);
	}
	public static int mtd2(int x){
		System.out.println("2."+x);
		return mtd3(x*=3);
	}
	public static int mtd3(int x){
		System.out.println("4."+x);
		x=x+25/	5+3%2;
		System.out.println("3."+x);
		return x;
	}

}
