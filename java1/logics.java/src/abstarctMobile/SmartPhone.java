package abstarctMobile;

public class SmartPhone extends MobilePhone {

	String emi_no;
	String call_type;
	
	public SmartPhone()
	{
		emi_no = "hfry567";
		call_type = "video also";
		brand = "oppo";
	}
	
	public SmartPhone(String br,String en, String ct)
	{
		super(br);
		emi_no = en;
		call_type = ct;
	}
	
	public void makeCall()
	{
		System.out.println("Smart phone also have  "+call_type+" and brand is "+brand);
	}
	
}
