package inheritance;

public class Cricketer extends Player{
	
	String speciality;
	int experience;
	
	public Cricketer()
	{
		super.name="virat";
		super.country="india";
		super.age=30;
		speciality="batsman";
		experience = 10;
	}
	
	public Cricketer(String cnm, String c_cry,int cag, String spc, int exp)
	{
		super(cnm, c_cry, cag);
		speciality=spc;
		experience=exp;
	}
	
	public String toString()
	{
		return super.toString()+" "+speciality+" "+experience;
	}

}
