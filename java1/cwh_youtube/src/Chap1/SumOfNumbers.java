package Chap1;

import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n...");
		int n =sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of "+n+" numbers are = "+sum);
	}

}
