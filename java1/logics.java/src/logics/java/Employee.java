package logics.java;

public class Employee {

	static int empid=111;
	String name;
	float salary;
	static int count=0;
	
	public Employee()
	{
		empid = empid+1;
		name = "kajal";
		salary = 30000;
		count++;
	}
	
	public Employee(int empid, String name, float salary)
	{
		
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		count++;
		
	}
	
	
	public String toString()
	{
		return empid+" "+name+" "+salary;
	}
	
	public static void count()
	{
		System.out.println("count = "+count);
	}
	
	
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		System.out.println(e1);
		
		Employee e2 = new Employee(empid=empid+1, "Anjali", 20000);
		System.out.println(e2);
		
		Employee e3 = new Employee(empid=empid+1, "jhon", 40000);
		System.out.println(e3);	
		
		Employee.count();
		
		
		
	}
	
	
}
