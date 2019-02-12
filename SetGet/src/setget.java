
public class setget {
	private static String isim;
	private static String soyisim;
	private static int yas;


public static void SetName(String name)
{
    isim=name;
	
}
public static void SetLastName(String lastname)
{
    soyisim=lastname;
}
public static void SetAge(int age ){
    
	yas=age;

}
public static String GetName(){
	 return isim;
}
public static String GetLastName(){
	return soyisim;
}
public static int GetAge()
{
	
	return yas;
}




}