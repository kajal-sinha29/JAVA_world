import java.util.Scanner;	


public class Armstrong {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number    ");
		int n= sc.nextInt();
		int temp=n;
		int sum=0;
		int r;
		
		while(n>0)
		{
		
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}
