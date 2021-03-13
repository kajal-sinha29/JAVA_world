package abstarctAnimal;

public class LivingBeing {
	
	public static void main(String args[])
	{
		
		System.out.println("Carnivores Animals...");
		Animal c1 = new Tiger("Carnivore", "Tiger", "Sunderban", "other animals");
		c1.eat();
		
		
		Animal c2 = new Tiger("Carnivore", "Lion", "Gir", "other animals");
		c2.eat();
		
		
		System.out.println("\nHerbivores Animals...");
		Animal h1 = new Elephant("herbivore", "Elephant", "Bandipur np", "Sugarcane");
		h1.eat();
		

		Animal h2 = new Elephant("herbivore", "Swamp Deer", "Kanha np", "grasses");
		h2.eat();
	}

}
