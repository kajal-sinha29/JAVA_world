package abstarctAnimal;

public abstract class Animal {

	String type;
	String name;
	
	public Animal()
	{
		type = "Carnivore";
		name = "Lion";
	}
	
	public Animal(String t, String n)
	{
		type = t;
		name = n;
	}
	
	public abstract void eat(); 
}
