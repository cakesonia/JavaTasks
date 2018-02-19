package decor;

public class Decorations {
	private String name;
	private String type1;
	private String type2;
	private String type3;
	private String type4;
	private String type5;
	
	public Decorations(String name, String type1, String type2, String type3, String type4, String type5) {
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.type3 = type3;
		this.type4 = type4;
		this.type5 = type5;
	}
	
	public String toString() {
		return name + ": \n" + type1 + ", " + type2 + ", " + type3 + ", " + type4 + ", " + type5;
	}
}
