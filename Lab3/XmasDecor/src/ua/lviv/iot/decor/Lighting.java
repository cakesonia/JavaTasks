/**
 * 
 */
package ua.lviv.iot.decor;

/**
 * @author Dell
 *
 */
public class Lighting extends Decoration {

	public int lenght;
    public int quantityOfLamps;
    
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
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getQuantityOfLamps() {
		return quantityOfLamps;
	}
	public void setQuantityOfLamps(int quantityOfLamps) {
		this.quantityOfLamps = quantityOfLamps;
	}

}
