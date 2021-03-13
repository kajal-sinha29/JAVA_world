package abstarctMobile;

public abstract class MobilePhone {

	String brand;
	
	public MobilePhone()
	{
		brand = "Nokia";
	}
	
	public MobilePhone(String b)
	{
		brand = b;
	}
	
	public abstract void makeCall();
}
