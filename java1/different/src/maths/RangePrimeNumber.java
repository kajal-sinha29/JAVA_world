package maths;
import java.util.Scanner;
import java.lang.Math;
public class RangePrimeNumber {
	
	public static void main(String args[])
	{
		int n;
		int flag;
		int i,j;
		Scanner sc = new Scanner(System.in);
		
				System.out.println("Enter the number....");
		       n = sc.nextInt();
		       
		       for(i=1;i<=n;i++)
		       {
		    	int count  = 0;
		    	 int  root = (int)Math.sqrt(i);
		    	   for(j=2;j<=root;j++)

		    		   if(i%j==0)
		   			{
		   				count++;
		   			break;
		   			}//ifover
		    		   	   
		       
		    	   if(count==0 && i!=1)
		    		   System.out.println(i);
		       }
		       
		     

		    	   
		    	   
		    	   
		    	   
		    	   
		    	   
	}	    	   
	}
	

