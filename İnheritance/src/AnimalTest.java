
public class AnimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal hayvan1 = new Animal();
		hayvan1.eat();
		hayvan1.sleep();
		
		Bird hayvan2 = new Bird();
		hayvan2.eat();
		hayvan2.sleep();
		hayvan2.fly();
		
		Dog hayvan3 = new Dog();
		hayvan3.eat();
		hayvan3.sleep();
		
		//Sleep() methodu kendi clasına bakar
		//Bulamazsa süper kalsına gider
		Animal hayvan4	= new Bird();
		hayvan4.eat();
//      hayvan4.fly(); ///// Eğer Animal tipinde tanımlanmışsa Sadece Animal ve Bird clasındaki ortak Methodları kullana bilir Bird kendi methodunu kullnamaz;
		
	}

}
