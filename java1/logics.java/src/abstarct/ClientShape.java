package abstarct;

public class ClientShape {
	
	public static void main(String args[])
	{
		
		System.out.println("SQUARE ....");
		Shape sq = new Square(7,9);
		sq.area();
		sq.peri();
		
		System.out.println("\nCIRCLE ....");
		Shape cir = new Circle(7);
		cir.area();
		cir.peri();
		
		System.out.println("\nTRIANGLE ....");
		Shape tri = new Triangle(4, 6, 5, 2);
		tri.area();
		tri.peri();
		
	}

}
