package loops;

public class OddNumbers {
	
	void printOddNumbers() {
		
		for (int i=1; i<20; i+=2) {
			System.out.println("Odd Numbers "+i);
		}
	}
	
	void printOddNumbersWayTwo() {
		
		int num =1;
		for (int i=0; i<10; i++) {
			//i is the counter - how many times the loop gets executed
			System.out.println("Odd Numbers 2nd Way "+num);
			num+=2; //How i get my next odd number
		}
	}

}
