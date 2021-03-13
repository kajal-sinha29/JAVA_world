package inheritance;

public class BatsMan extends Cricketer{

	int centuries;
	int runs;
	
	public BatsMan()
	{
		super.name="SACHIN";
		super.country="india";
		super.age=30;
		centuries = 7;
		runs =1000;
	}
	
	public BatsMan(String bnm, String b_cry,int b_ag, String b_spc, int b_exp, int cent, int ru)
	{
		super(bnm, b_cry, b_ag, b_spc, b_exp);
		centuries = cent;
		runs =ru;
	}
	
	public String toString()
	{
		return super.toString()+" "+speciality+" "+experience;
	}
	
}
