package Chap1;
import java.util.Scanner;
public class Pattern1 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int k=0;
		int l=0;
		System.out.println("Enter the value....");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++,k=0)
		{
			for(int j=1;j<=n-i;j++)
			{
					System.out.print("  ");
		    }
			if(i%2==0)
			{
		    for(k=1;k<=2*i-1;k++)
		    {
				System.out.print("#");
			}
			
			System.out.println();
		}
			else
			{
			    for(k=1;k<=2*i-1;k++)
			    {
					System.out.print("$");
				}
				
				System.out.println();
			}
		}
		  
		/*for(int i=2;i<=n;i=i+2,k=0)
		{
			 
			for(int j=2;j<=n-i;j++)
			{
				System.out.print("  ");
			}
		    for(k=2;k<=2*i-1;k++)
			{
				System.out.print("#");
			}
			
			System.out.println();
		}*/
		
		//reverse pyramid
		
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print("  ");
			}
			if(i%2==0)
			{
			for(k=2*i-1;k>=1;k--)
			{
				System.out.print("$");
				
			}
			System.out.println();
		}
			else
			{
				for(k=2*i-1;k>=1;k--)
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
	}
	}

	
}
