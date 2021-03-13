package inheritance;

public class HockeyPlayer extends Player{
	
	String speciality;
	int experience;
	
	public HockeyPlayer()
	{
		super.name="Gurinder Singh";
		super.country="india";
		super.age=30;
		speciality="skipper";
		experience = 10;
	}
	
	public HockeyPlayer(String hnm, String h_cry,int hag, String hpc, int hexp)
	{
		super(hnm, h_cry, hag);
		speciality=hpc;
		experience=hexp;
	}
	
	public String toString()
	{
		return super.toString()+" "+speciality+" "+experience;
	}

}
