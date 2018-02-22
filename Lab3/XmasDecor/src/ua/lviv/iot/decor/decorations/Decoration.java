/**
 * 
 */
package ua.lviv.iot.decor.decorations;

/**
 * @author Sonia
 * @version 1.0
 * @since 2018-02-22
 */
public class Decoration {

	private String decorType;

	public Decoration(String decorType) {
		super();
		this.decorType = decorType;
	}

	public String getDecorType() {
		return decorType;
	}

	public void setDecorType(String decorType) {
		this.decorType = decorType;
	}

}
