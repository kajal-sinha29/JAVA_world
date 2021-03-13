package logics.java;

public class Armstrong {

	static public void main(String x[])
	{
		int n=153;
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
