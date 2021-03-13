package Chap1;
import java.util.Scanner;

public class Marks_calci {
	
	public static void main(String args[]) {
		
	System.out.println("Enter your Name...");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	
	System.out.println("Hello "+name+"  Enter your  first marks..  ");
	float a = sc.nextInt();
	
	System.out.println(name+"  enter second marks...  ");
	float b = sc.nextInt();
	
	float sum = a+b;
	
	System.out.println(name+" Your Sum total  =  "+sum);
	System.out.println("and percentage =  "+sum/2+"%"); 
	}
}
