package inheritance;

public class PlayerClient {

	public static void main(String args[])
	{
		
		System.out.println("Player class output...\n");
		Player p1 = new Player();
		System.out.println(p1);
		
		System.out.println("Cricketer class output...\n");
		Cricketer c1 = new Cricketer();
		System.out.println(c1);
		
		System.out.println("BatsMan class output...\n");
		BatsMan ba1 = new BatsMan();
		System.out.println(ba1);
		
		System.out.println("Bowler class output...\n");
		Bowler bo1 = new Bowler();
		System.out.println(bo1);
		
		System.out.println("HockeyPlayer class output...\n");
		Player h1 = new HockeyPlayer();
		System.out.println(h1);
		
		System.out.println("FootBall Player class output...\n");
		FootBallPlayer f1 = new FootBallPlayer();
		System.out.println(f1);
	}
	
}
