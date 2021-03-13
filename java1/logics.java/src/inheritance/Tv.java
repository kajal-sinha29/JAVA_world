package inheritance;

public class Tv extends ElectronicDevice{
	
	int channel;
	int screen_size;

	
	public Tv() 
	{
		channel = 50;
		screen_size = 50;
		
	}
	
	public Tv(String tbd, String tmo, int ch, int sz)
	{
		super(tbd, tmo);
		channel=ch;
		screen_size=sz;
	}
	
	public String toString()
	{
		return super.toString()+" "+channel+" "+screen_size;
	}
}
