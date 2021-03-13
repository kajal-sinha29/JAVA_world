package exception;
import java.util.Scanner;
public class ExceptionHandling {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int n=7;
		int[] arr = {10,20,50,60};
		//System.out.println("Enter the value of n...");
		//int n = sc.nextInt();
		try
		{
	
		//arr =  new int[n];
		
		//getting values from user....
		/*
		for(int i =0;i<=n-1;i++)
		{
			System.out.println("Enter the values of array for "+i+"position");
			int x = sc.nextInt();
			arr[i]=x;
		}*/
		
		//displaying values to user
	
	    for(int i = 0;i<=n-1;i++)
	    {
	    	System.out.println("value of "+i+" position is "+arr[i]);
	    }
			    
		}
		
		catch(ArrayIndexOutOfBoundsException  e)
		{
			e.printStackTrace();

		}
		try
		{
		int sum=0;
	    for(int i=0;i<=n-1;i++)
	    {
	    	sum = sum+arr[i];
	    	System.out.println("sum of numbers =  "+sum);
	    }
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			e.printStackTrace();

		}
	    
	int x=60;
	int y=80;
	System.out.println("sum = "+x+y);
	}

}
