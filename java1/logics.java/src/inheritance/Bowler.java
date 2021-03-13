package inheritance;

public class Bowler extends Cricketer {

	int wickets;
	
	public Bowler()
	{
		super.name="HARBAJAN SINGH";
		super.country="india";
		super.age=30;
		wickets = 417;
	}
	
	public Bowler(String bo_nm, String bo_cry,int bo_ag, String bo_spc, int bo_exp, int wic)
	{
		super(bo_nm, bo_cry, bo_ag, bo_spc, bo_exp);
		wickets = wic;
	}
	
	public String toString()
	{
		return super.toString()+" "+speciality+" "+experience;
	}
	
}
