package accessModifiers;

public class CashBackMain {

		public static void main(String[] args) {

			CashBack calculate = new CashBack("245678", 0.00);

			System.out.println("CashBack: " + calculate.getCashBack("245678", 59));
			
		}
		
}