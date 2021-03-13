package abstarct;

public class Square extends Shape {

	int length;
	int bredth;
	
	public Square()
	{
		length=5;
		bredth=4;
	}
	
	public Square(int l, int b)
	{
		length=l;
		bredth=b;
	}
	public void area()
	{
		System.out.println("Area = "+ length*bredth);
	}
	
	public void peri()
	{
		System.out.println("Perimeter = "+2*(length + bredth));
	}
}
