package dynamicInput;

public class SimpleIfElseExample {
	
	int age;
	
	void checkIfThePersonIsAdult() {
		
		boolean isAdult = age>18;  //On RHS we are comparing age with 18 and result of comparison is boolean
		//if(age>18) {
		if(isAdult) {	System.out.println("Person is adult");
			
		} else {
			System.out.println("Person is not adult");
			
		}
	}

}
