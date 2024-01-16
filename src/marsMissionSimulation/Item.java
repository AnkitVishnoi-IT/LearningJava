package marsMissionSimulation;

public class Item {
	private String itemName;
	private int itemWeight;

	public Item(String itemName, int itemWeight) {
		this.itemName = itemName;
		this.itemWeight = itemWeight;
	}

	public String getItemName() {
		return itemName;
	}

	public int getItemWeight() {
		return itemWeight;
	}
}
