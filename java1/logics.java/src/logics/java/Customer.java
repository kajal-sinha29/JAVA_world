package logics.java;

public class Customer {

	static int id=0;
	String c_name;
	float c_amnt;
	static int count;
	
	public Customer()
	{
		id = id+1;
		c_name="kajal";
		c_amnt=124;
		count++;
	}
	
	public Customer(int id, String c_name, float c_amnt)
	{
		this.id = id;
		this.c_name=c_name;
	    this.c_amnt=c_amnt;
	    count++;
	}
	
	public String toString()
	{
		return id+" "+c_name+" "+c_amnt;
	}
	
	
	public static void count()
	{
		System.out.println("count = "+count);
		
	}
	
	
	public static void main(String args[])
	{
		System.out.println(count);
		
		Customer c1 = new Customer();
		System.out.println(c1);
		
		Customer c2 = new Customer(id=id+1,"jhon", 345);
		System.out.println(c2);
		
		Customer c3 = new Customer(id=id+1, "Mark", 678);
		System.out.println(c3);
		
		System.out.println(count);
	}
	
	
}
