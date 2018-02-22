package ua.lviv.iot.decor;

import ua.lviv.iot.decor.enums.Color;

public class Garland extends Decoration {
	
	public Garland(String decorType) {
		super(decorType);
	}

	protected int length;
	
	protected Color color;
	
	public Garland(String decorType, int length, Color color) {
		super(decorType);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
}
