package inheritance;

public class Software extends Item{
	
	float version;
	
	public Software()
	{
		super.title = "Google Chrome";
		super.publisher = "GOOGLE";
		super.year_published = 2020;
		super.ISBN = 1234566;
		super.price = 3000;
		version = 39.2f;
	}

	public Software(String s_title, String s_publisher, int s_year, long s_ISBN, int s_price, float ver)
	{
		super(s_title, s_publisher, s_year, s_ISBN, s_price);
		version=ver;
		
	}
	
	public String toString()
	{
		return super.toString()+"   "+"version = "+version;
	}
	
}
