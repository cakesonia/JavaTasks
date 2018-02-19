package decor;

public class Main {

	public static void main(String[] args) {
		Decorations XmasTree = new Decorations("Xmas Tree Decorations", "Balls" , "Stuffed Animals" , "Stars" , "Angels" , "Indoor Garlands");
		Decorations House = new Decorations("House Decorations", "Hanging" , "Socks" , "Candles" , "Xmas Tree" , "Xmas Wreath");
		Decorations Yard = new Decorations("Yard Decorations", "Outdoor Garlands" , "Illumination" , "Santa's Sleigh" , "Outdoor Decorated Xmas Tree" , "Snowmen");
		
		System.out.println(XmasTree.toString());
		System.out.println(House.toString());
		System.out.println(Yard.toString());
	}

}
