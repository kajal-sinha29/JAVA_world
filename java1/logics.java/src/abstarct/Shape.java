package abstarct;

public abstract class Shape {
	
	int side;
	final float pi = 3.14f;
	public Shape()
	{
		side = 4;
	}
	
	public Shape(int s)
	{
		side = s;
	}
    
	public abstract void area();
	public abstract  void peri();
	
}
