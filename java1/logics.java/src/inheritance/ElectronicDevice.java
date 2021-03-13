package inheritance;

public class ElectronicDevice {

	String brand;
	String modelno;
	
	public ElectronicDevice()
	{
		brand = "SONY";
		modelno = "abcd1234";
		
	}
	
	public ElectronicDevice(String bd, String mdno)
	{
		brand=bd;
		modelno=mdno;
		
	}
	
	public String toString()
	{
		return brand+" "+modelno;
	}
	
}
