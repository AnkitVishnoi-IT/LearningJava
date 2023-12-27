package firstProgram;

public class MainClassMobile {
	
	// Main Method - Program execution starts from Main. Starting point of Java. Java code gets executed in Main Method.
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//Object creation - Create a copy from the template
			
			// Syntax - ClassName objectName s new ClassName();
			
			MobilePhone samsungPhone = new MobilePhone();
			
			MobilePhone applePhone = new MobilePhone();
			
			MobilePhone googlePhone = new MobilePhone();
				
			//Assigning a value to_variablel
				
			samsungPhone.brand= "Samsung";
			samsungPhone.color ="Black";
			applePhone.brand = "Apple";
			googlePhone.brand= "Google";
					
			//Invoke a method
			samsungPhone.makeCall();

		

	}

}
