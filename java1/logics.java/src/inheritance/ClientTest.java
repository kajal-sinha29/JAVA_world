package inheritance;

public class ClientTest {

	public static void main(String args[]) 
	{
		//Employee class only
		Employee e1 = new Employee();
		System.out.println(e1);
		
		Employee e2 = new Employee(11, "mark", 10000);
		System.out.println(e2);
		
		System.out.println("Total salary of mark = "+e2.toCalculate());
		
		//SalesPerson class
		System.out.println("\n");
		System.out.println("SALES PERSON DETAILS...");
		
		SalesPerson s1 = new  SalesPerson();
		System.out.println(s1);
		SalesPerson s2 = new SalesPerson(222, "peter", 15000, 20000, 0.5);
		System.out.println(s2);
		
		System.out.println("Total salary of peter = "+s2.toCalculate());
		
		//wageEmployee
		System.out.println("\n");
		System.out.println("WAGE EMPOLYEES DETAILS..");
		
		WageEmployee w1 = new WageEmployee();
		System.out.println(w1);
		
		WageEmployee w2 = new WageEmployee(333,"Maria", 35000, 8, 4.6f);
		System.out.println(w2);
		
		System.out.println("Total salary of Maria = "+w2.toCalculate());
		
	}
	
}
