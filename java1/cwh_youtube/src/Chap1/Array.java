package Chap1;

import java.util.Scanner;

public class Array {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value on n");
		int n = sc.nextInt();
		int[] arr;
		arr = new int [n];
		
		for(int i=0;i<=n-1;i++)//3
		{
			System.out.println("Enter value of position "+ i +"  =  ");
			int x = sc.nextInt();
			arr[i]=x;
		}
		System.out.println("The values are .... ");
		for(int j=0;j<=n-1;j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("Using for each loop ...");
		for(int x: arr)
		{
			System.out.println(x);
		}
	}

}
