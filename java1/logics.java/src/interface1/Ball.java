package interface1;

public class Ball implements Bounceable,Moveable{

	@Override
	public void move() {
		
		System.out.println("Ball can be moved from one place to another");
	}

	@Override
	public void bounce() {
		
		System.out.println("Ball is a bouncing while playing");
	}

	
}
