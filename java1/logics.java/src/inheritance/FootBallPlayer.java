package inheritance;

public class FootBallPlayer extends Player {
	
	String speciality;
	int goals;
	
	public FootBallPlayer()
	{
		super.name="Sunil Chhetri";
		super.country="india";
		super.age=30;
		speciality="batsman";
		goals = 72;
	}
	
	public FootBallPlayer(String fnm, String f_cry,int fag, String fpc, int go)
	{
		super(fnm, f_cry, fag);
		speciality=fpc;
		goals=go;
	}
	
	public String toString()
	{
		return super.toString()+" "+speciality+" "+goals;
	}

}
