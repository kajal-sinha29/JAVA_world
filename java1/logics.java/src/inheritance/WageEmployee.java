package inheritance;

public class WageEmployee extends Employee{

	int hours;
	float rate;
	
	
	public WageEmployee()
	{
		super.empid=33;
		super.ename="jhonny";
		super.esalary=35000;
		hours = 8;
		rate = 4.5f;
	}
	
	public WageEmployee(int wid, String wname, double wsalary, int hr, float rt)
	{
		super.empid=wid;
		super.ename=wname;
		super.esalary=wsalary;
		hours = hr;
		rate = rt;
	}
	
	public double toCalculate()
	{
	  return super.toCalculate()+hours*rate;	
	}
	
	public String toString()
	{
		return super.toString()+" "+hours+" "+rate;
		
	}
}
