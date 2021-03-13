package containment;

public class Arithmetic {
	
	
	
	public static void add(int ... n)
	{
		int sum=0;
		
		
		for(int y:n)
		{
			sum += y;
		}
	
		System.out.println("sum  = "+sum);
	}
	

}
