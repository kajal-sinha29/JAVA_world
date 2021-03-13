package logics.java;

public class Palindrome {
	
		static int i = 129;


	public static void main(String args[])
	{
		int temp = i;
		int r,sum=0;
		
		while(i>0)
		{
			r=i%10;
			sum =(sum*10)+r;
			i=i/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("not palindrome");
		}
		
	}	
		
		
		
		
	}


