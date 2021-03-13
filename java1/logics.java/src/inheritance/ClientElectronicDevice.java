package inheritance;

public class ClientElectronicDevice {

	public static void main(String args[])
	{
		//ElectronicDevice
	   ElectronicDevice ed1 = new ElectronicDevice();
	   System.out.println(ed1);
	   ElectronicDevice ed2 = new ElectronicDevice("SAMSUNG", "1234rfgt");
	   System.out.println(ed2);
	   
	   //computer 
	   Computer c1 = new Computer();
	   System.out.println(c1);
	   Computer c2 = new Computer("HP", "456ytgb", "laptop", "8gb");
	   System.out.println(c2);
	   
	   //Tv
	   Tv t1 = new Tv();
	   System.out.println(t1);
	   Tv t2 = new Tv("lloyd","123ghu",34,32);
	   System.out.println(t2);
	   
	   //Mobile
	   Mobile m1 = new Mobile();
	   System.out.println(m1);
	   Mobile m2 = new Mobile("oppo", "tgc456", 6, "60px");
	   System.out.println(m2);
	   
	  //LcdTv
	   LcdTv lt1 = new LcdTv();
	   System.out.println(lt1);
	   LcdTv lt2 = new LcdTv("lloyd", "tgc456", 36, 32, 4000, "12-12-12");
	   System.out.println(lt2);
	   
		
	}
	
}
