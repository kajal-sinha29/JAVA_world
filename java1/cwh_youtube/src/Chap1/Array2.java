package Chap1;

import java.util.Scanner;

public class Array2 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value on rows");
		int row = sc.nextInt();
		
		System.out.println("Enter the Value on columns");
		int col = sc.nextInt();
		
		int[][] arr;
		arr = new int [row][col];
		
		
		for(int i=0;i<=row-1;i++)
		{
			System.out.println("Enter the values of row of "+i+" position....");
			for(int j=0;j<=col-1;j++)
			{
				int x = sc.nextInt();
				arr[i][j]=x;	
			}
			
		}
		System.out.println("The values are .... ");
		for(int r=0;r<=row-1;r++)
		{
			for(int c=0;c<=col-1;c++)
			{
			System.out.print("    ");
			System.out.print(arr[r][c]);
			}
			System.out.println();
		}
		//System.out.println("Using for each loop ...");
		//for(int x: arr)
		//{
			//System.out.println(x);
		//}
	}


}
