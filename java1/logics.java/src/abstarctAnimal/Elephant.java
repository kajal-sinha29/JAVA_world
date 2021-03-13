package abstarctAnimal;

public class Elephant extends Animal {
	
	String forest;
	String food;
	
	
	public Elephant()
	{
		forest = "sunderban";
		food = "Other Animals";
		type = "Herbivore";
		name = "Elephant";
	}
	
	public Elephant(String ty,String n, String f, String fo)
	{
		super(ty, n);
		forest = f;
		food = fo;
	}
	
	public void eat()
	{
		System.out.println(name+" is a type of "+type+" "+"animal.");
		System.out.println(name+" eats "+food+"  "+"and lives in "+forest+" "+"forest.");
	}


}
