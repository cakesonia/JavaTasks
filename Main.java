package demo;

public class Main {

	public static void main(String[] args) {
		Sofa Sasto = new Sofa(4, "Sasto", "velour", "blue", 6000);
		Sofa Becktan = new Sofa(5, "Becktan", "velour", "white", 5000);
		Sofa Doro = new Sofa(3, "Doro", "velvet", "black", 3000);

		System.out.println(Sasto.toString());
		System.out.println(Becktan.toString());
		System.out.println(Doro.toString());

		Sofa.printStaticSum();
		Sasto.printSum();
	}
}
