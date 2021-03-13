package abstarct;

public class Triangle extends Shape{
	
	int base;
	int side1;
	int side2;
	int height;
	
	public Triangle()
	{
		base = 5;
		side1 = 6;
		side2 = 7;
		height = 9;
	}
	
	public Triangle(int b, int s1, int s2, int h)
	{
		base=b;
		side1=s1;
		side2=s2;
		height = h;
	}
	
	public void area()
	{
		System.out.println("Area of triangle = "+(base*height)/2);
	}
	
	public void peri()
	{

		System.out.println("Perimeter of Triangle =  "+ (base+side1+side2));
	}

}
