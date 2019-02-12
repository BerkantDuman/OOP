
public class Scope {
   int x=1;
   public void temelDeger(){
	   
	   int x=5;
	   localDeger();
	   genelDeger();
	   
	   localDeger();
	   genelDeger();
	   
   
   }
   public void localDeger(){
	   
	   int x=25;
	   System.out.println("\nLocalDeger methodu içindeki x : "+ x);
	   ++x;
	   System.out.println("}\nLocalDeger methodunsan çıkmadan önce içindeki x : "+ x);
   }
   public void genelDeger(){
	   System.out.println("\ngenelDeger methodun içindeki x : "+ x);
	   x*=10;
	   System.out.println("\ngenelDeger methodundan çıkan içindeki x : " + x);
   }
}
