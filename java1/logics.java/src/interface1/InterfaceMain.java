package interface1;

public interface InterfaceMain {

	public static void main(String args[])
	{
		Bounceable b = new Ball();
		b.bounce();
		
		Moveable m = new Ball();
		m.move();
		
		Moveable m1 = new Car();
		m1.move();
		
		
	}
}
