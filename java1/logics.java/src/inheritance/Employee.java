package inheritance;

public class Employee {

	protected int empid;
	protected String ename;
	protected double esalary;
	protected double hra=2000, ma=1000, pf=500, pt=300;

	
	public Employee()
	{
		empid=1;
		ename="jhon";
		esalary=10000;
	}
	
	public Employee(int eid, String enm, double esal)//overloading
	{
		empid=eid;
		ename=enm;
		esalary=esal;
	}
	
	public double toCalculate()
	{
		return esalary+ hra+ ma- pf- pt;
	}
	
	public String toString()//display
	{
		return empid+" "+ename+" "+esalary;
	}
	
}

