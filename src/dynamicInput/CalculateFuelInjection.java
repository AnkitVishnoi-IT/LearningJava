package dynamicInput;

public class CalculateFuelInjection {
	
	int xThrottle, yFuel;
	
	void calculateFuelInjection()	{
			
		if (xThrottle>=0 && xThrottle<=127) {			//if (condition) { code that will be executed when the result of condition is true}
			
			yFuel = xThrottle*2;
			System.out.println("yFuel value is : " + yFuel);
			
		} else if (xThrottle>=128 && xThrottle<=255) {
			yFuel = xThrottle + 127;
			System.out.println("yFuel value is : " + yFuel);
		
		} else {
			System.out.println("X-Throttle should be between 1 to 255");		
		}
		
		//System.out.println("yFuel value is : " + yFuel);   //we need to shift syso from here inside the if conditions else it will still print 0 when x>256
		
	}

}
