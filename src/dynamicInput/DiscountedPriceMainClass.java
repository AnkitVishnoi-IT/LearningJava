package dynamicInput;

import java.util.Scanner;

public class DiscountedPriceMainClass {

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateDiscount calculateDiscount = new CalculateDiscount();

		/*calculateDiscount.cost = 10;
		calculateDiscount.PromoCode = "PromoCode10";*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cost of the Product : ");
		
		calculateDiscount.cost = sc.nextInt();
		
		System.out.println("Enter the PromoCode : ");
		
		calculateDiscount.PromoCode = sc.next();
			
		calculateDiscount.totaldiscount();
		
		//sc.close();

	}

}
