package abstarctMobile;

public class SimplePhone extends MobilePhone {
	
	String emi_no;
	String call_type;

	public SimplePhone()
	{
		brand = "nokia";
		emi_no = "xioi765";
		call_type = "simple call";
	}
	
	public SimplePhone(String b, String e, String sc)
	{
		super(b);
		emi_no = e;
		call_type = sc;
	}
	
	public void makeCall()
	{
		System.out.println("Simple phone can have only "+call_type+" and brand is "+brand);
	}
}
