package dynamicInput;

public class CalculateDiscount {

	double finalValue, cost, noPromoPrice;
	String PromoCode;

	void totaldiscount() {
		
		noPromoPrice = (cost*0.5);
			
			if (PromoCode == "PromoCode5") {
			System.out.println("Total Discount is 50% + 5%");
			finalValue = (noPromoPrice * 0.95);
		}

		else if (PromoCode == "PromoCode10") {
			System.out.println("Total Discount is 50% + 10%");
			finalValue = (noPromoPrice * 0.90);
		}

		else if (PromoCode == "PromoCode20") {
			System.out.println("Total Discount is 50% + 20%");
			finalValue = (noPromoPrice * 0.80);
		}

		else {
			System.out.println("Total Discount is 50%");
			finalValue = noPromoPrice;
		}

		System.out.println("Final Price is : " + finalValue);
	}

}
