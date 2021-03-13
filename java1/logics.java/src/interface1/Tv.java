package interface1;

public class Tv implements RemoteDevice{

	@Override
	public void switchOn() {
		
		System.out.println("switch on TV");
		
	}

	@Override
	public void switchOff() {
		
		System.out.println("switch off tv");
		
	}
	
	

}
