package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Scanner;
public class Client {
	
	public static void main(String args[])
	{
		int ido = 1234;
		int passo = 1234;
		int id, pass;
		
		ArrayList a1 = new ArrayList();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO MY INSTITUTE....!!!!!");
	
		System.out.println("Enter id....  ");
		id = sc.nextInt();
		System.out.println("Enter password...");
		pass = sc.nextInt();
		
		if(id==ido && pass==passo)
		{
			Operations.operations(a1);
		}
		else
		{
			System.out.println("Wrong match!!!!!!");
			System.exit(0);
		}
		
		
	}

}
