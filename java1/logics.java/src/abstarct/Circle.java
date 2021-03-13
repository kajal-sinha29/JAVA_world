package abstarct;

public class Circle extends Shape {
	
	double radius;
	
	    public Circle()
	      {
		          radius = 7;
	      }
	    
	      public Circle(double r)
     	{
	         	radius = r;
	    }
	      
	public void area()
	{
		double x=super.pi;
		
		System.out.println("Area of Circle = "+x*radius*radius);
	}
public void peri()
{
	double y = super.pi;
	System.out.println("Perimeter of Circle = "+2*y*radius);
}
}
