package inheritance;

public class Computer extends ElectronicDevice {

	String category;
	String memory;

	public Computer()
	{
		category="super";
		memory="1000tb";
	}
	
	public Computer(String cbd, String cmno, String cat, String mem)
	{
		super(cbd,cmno);
		category=cat;
		memory=mem;
	}
	
	public String toString()
	{
		return super.toString()+" "+category+" "+memory;
	}
	
	
}
