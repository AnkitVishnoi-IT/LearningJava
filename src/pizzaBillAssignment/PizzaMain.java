package pizzaBillAssignment;

public class PizzaMain {

	public static void main(String[] args) {

		PizzaPrice inputSize = new PizzaPrice();

		inputSize.calculatePrice();

		inputSize.addPepTopping();

		inputSize.addExtraCheese();

		System.out.println("Topping Cost: " + inputSize.toppingCost);
		System.out.println("Extra Cheese Cost: " + "$1.00");
		System.out.println("******************************************");

		System.out.println("Your final bill amount is: $" + inputSize.basePrice);

	}

}
