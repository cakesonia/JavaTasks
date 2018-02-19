package demo;

public class Sofa {
	private int quantityInStore;
	private String name;
	private String material;
	private String color;
	private int averagePrice;

	public static int totalQuantityOfSofas = 12;

	public Sofa() {
	}

	public Sofa(int quantityInStore, String name, String material, String color) {
		this.quantityInStore = quantityInStore;
		this.name = name;
		this.material = material;
		this.color = color;
	}

	public Sofa(int quantityInStore, String name, String material, String color, int averagePrice) {
		this.quantityInStore = quantityInStore;
		this.name = name;
		this.material = material;
		this.color = color;
		this.averagePrice = averagePrice;
	}

	public void setQuantityInStore(int quantityInStore) {
		this.quantityInStore = quantityInStore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAveragePrice(int averagePrice) {
		this.averagePrice = averagePrice;
	}

	public String toString() {
		return "Sofa " + name + " is " + color + " and covered with " + material + ", average price is " + averagePrice
				+ ", quantity in the store: " + quantityInStore;
	}

	public static void printStaticSum() {
		System.out.println("Total quantity of sofas is " + totalQuantityOfSofas);
	}

	public void printSum() {
		System.out.println("Total quantity of sofas is " + totalQuantityOfSofas);
	}

	public void resetValues(int quantityInStore, String name, String material, String color, int averagePrice) {
		this.averagePrice = averagePrice;
		this.color = color;
		this.material = material;
		this.name = name;
		this.quantityInStore = quantityInStore;
	}
}
