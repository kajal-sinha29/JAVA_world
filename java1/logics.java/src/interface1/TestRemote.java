package interface1;

public class TestRemote {
	
	public static void main(String args[])
	{
		
		RemoteDevice t = new Tv();
		t.switchOn();
		t.switchOff();
		
		RemoteDevice d = new DvdPlayer();
		d.switchOn();
		d.switchOff();
		
	}

}
