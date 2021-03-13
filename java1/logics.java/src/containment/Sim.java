package containment;

public class Sim {
	
	String simtype;
	String brand;
	
	public Sim()
	{
		simtype = "prepaid";
		brand = "Airtel";
		
	}
	
	public Sim(String type,String brand1)
	{
		simtype = type;
		brand = brand1;
		
	}
	public String toString()
	{
		return simtype+" "+brand;
	}
}
