package dynamicInput;

public class CopyOfCalculateFuelinjection {


	int xThrottle, yFuel;
	
	void calculateFuleInjection()	{
		
		boolean isXlessThan127 = xThrottle<=127; 
		
		
		if (xThrottle>=0 && isXlessThan127) {  //if (condition) { code that will be executed when the result of condition is true}
											//result of comparison is always boolean so if is expecting a bollean value
			yFuel = xThrottle*2;
			System.out.println("yFuel value is : " + yFuel);
			
		} else if (xThrottle>=128 && xThrottle<=255) {
			yFuel = xThrottle + 127;
			System.out.println("yFuel value is : " + yFuel);
		
		} else {
			System.out.println("X-Throttle should be between 1 to 255");		
		}
		
		//System.out.println("yFuel value is : " + yFuel);   //we need to shift it from here as it will still print 0 when x>256
		
	}

}
