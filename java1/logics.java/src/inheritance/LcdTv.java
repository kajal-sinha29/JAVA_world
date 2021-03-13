package inheritance;

public class LcdTv extends Tv{

	int price;
	String dop;

	
	public LcdTv() 
	{
		price = 5000;
		dop = "29-12-2020";
		
	}
	
	public LcdTv(String lctbd, String lctmo, int lc_ch, int lcsz, int pr, String dp)
	{
		
	     super(lctbd, lctmo, lc_ch, lcsz);
	     price=pr;
	     dop=dp;
	
	}
	
	
	public String toString()
	{
		return super.toString()+" "+channel+" "+screen_size;
	
     }
}
