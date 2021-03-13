package inheritance;

public class Player {
	
	String name;
	String country;
	int age;
	
	public Player()
	{
		name = "jackson";
		country = "usa";
		age = 25;
	}
	
	public Player(String nm, String cry, int ag)
	{
		name=nm;
		country=cry;
		age=ag;
	}
	
	public String toString()
	{
		return name+" "+country+" "+age;
	}
	

}
