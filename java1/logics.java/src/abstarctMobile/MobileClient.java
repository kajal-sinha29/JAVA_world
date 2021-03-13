package abstarctMobile;

public class MobileClient {
	
	public static void main(String args[])
	{
		System.out.println("Simple phone...");
		MobilePhone si1 = new SimplePhone("Samsung", "tyul876", "simple call");
		si1.makeCall();
		
		
		System.out.println("\nSmart phone...");
		MobilePhone sm1 = new SmartPhone("vivo", "4578ffgg", "video call");
		sm1.makeCall();
	}

}
