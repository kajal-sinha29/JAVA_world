package Chap1;
import java.util.Scanner;

public class Chn {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number...");
		int n = sc.nextInt();
		
		// FOR C
		for(int i=1;i<=n;i++)
		{
			System.out.print("@");
		}
		for(int j=1;j<=n;j++)
		{
			System.out.println("@");
		}
		for(int k=n;k<=n+n;k++)
		{
			System.out.print("@");
		} 
		
		//FOR H
		System.out.println("\n");
		
		for(int i=0;i<n;i++)
		{
			System.out.print("& ");
			for(int j=0;j<n;j++)
			{
				if((j==n-1)||(i==n/2))
					System.out.print("& ");
				
				else
					System.out.print("    ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
