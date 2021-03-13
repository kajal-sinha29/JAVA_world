package maths;

public class Coins {
	
	public static void main(String args[])
	{
		int n,i,j;
		n=10;
		
		for(i=1;i<=n;i=i+2)
		{
			for(j=2;j<=n-1;j=j+2)
			{
				System.out.println("head"+j);
			}
			System.out.println("tail"+i);
		}
	}

}
