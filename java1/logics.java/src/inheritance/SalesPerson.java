package inheritance;

public class SalesPerson extends Employee {

	double sales, commission;
	
	public SalesPerson()
	{
		super.empid=22;
		super.ename="max";
		super.esalary=10000;
		sales=5000;
		commission=0.2;
		
	}
	
	public SalesPerson(int sid, String sname, double s_salary, double sls, double comm)
	{
		super(sid,sname,s_salary);
		sales=sls;
		commission=comm;
		
	}
	
	public String toString() 
	{
	
		return super.toString()+" "+sales+" "+commission;
	}
	
	public double toCalculate()
	{
		return super.toCalculate()+(sales*commission)+sales;
	}
}
