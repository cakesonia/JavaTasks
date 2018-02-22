/**
 * 
 */
package ua.lviv.iot.decor;


/**
 * @author Dell
 *
 */

public class Decoration {
    
    
//    public double price;
    
    public String decorType;

//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public Decoration(double price) {
//		this.price = price;
//	}

	public String getDecorType() {
		return decorType;
	}

	public Decoration(String decorType) {
		super();
		this.decorType = decorType;
	}

	public void setDecorType(String decorType) {
		this.decorType = decorType;
	}

}
