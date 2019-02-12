
public class GradeBook 
{
    private static String KursAdi;
    
    public static void SetKurs(String kursismi)
    {
    	KursAdi=kursismi;
    	
    }
    public static String GetKursAdi()
    {
    	return KursAdi;
    }
    public static void DisplayGradeBook(){
    	System.out.println(GetKursAdi()+" dersinin GradeBook'una hoş geldiniz .....");
    }
}
