
public class WizardDriver {

	public static void main(String[] args) {
		
		Wizard cD = new Wizard("Cedric Diggory", 100, 7, false);
		System.out.println(cD);
		
		cD.takeDamage(25);
		System.out.println(cD);
		
		cD.lock(7);
		System.out.println(cD);
		
		cD.unlock(7);
		System.out.println(cD);
		
		cD.takeDamage(2);
		
		cD.setKey(10);
		System.out.println(cD);
		
		

	}//end main

}//end class
