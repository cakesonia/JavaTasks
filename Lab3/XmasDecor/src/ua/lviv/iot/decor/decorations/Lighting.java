/**
 * 
 */
package ua.lviv.iot.decor.decorations;

/**
 * @author Sonia
 * @version 1.0
 * @since 2018-02-22
 */
public class Lighting extends Decoration {

	private int lenght;
	private int quantityOfLamps;

	public Lighting(String decorType) {
		super(decorType);
	}

	public Lighting(String decorType, int lenght, int quantityOfLamps) {
		super(decorType);
		this.lenght = lenght;
		this.quantityOfLamps = quantityOfLamps;
	}

	public int getLenght() {
		return lenght;
	}

	public int getQuantityOfLamps() {
		return quantityOfLamps;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public void setQuantityOfLamps(int quantityOfLamps) {
		this.quantityOfLamps = quantityOfLamps;
	}

}
