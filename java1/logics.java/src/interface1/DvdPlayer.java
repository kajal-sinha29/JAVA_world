package interface1;

public class DvdPlayer implements RemoteDevice{

	@Override
	public void switchOn() {
		
		System.out.println("Switch on DVD");
		
	}

	@Override
	public void switchOff() {
		System.out.println("Switch on DVD");
	}

}
