package arrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Insert {
	
	public static void insertElements(ArrayList a1)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students you want to register");
		n = sc.nextInt();
		
		System.out.println("Student details");
		for(int i =0; i<n;i++)
		{
			System.out.println();
			System.out.println("Enter new rollno....!!!");
			int r = sc.nextInt();
			
			System.out.println("Enter name....!!!");
			String nm = sc.next();
			
			System.out.println("Enter marks...!!!");
			int mks = sc.nextInt();
			
			System.out.println("Enter phn no....!!!");
			long ph = sc.nextInt();
			
			
			a1.add(new Student(r,nm,mks,ph));
		}
		System.out.println("Student Registered successfully");
		System.out.println("To view Students click 1");
		System.out.println("for operation list click 2");
		System.out.println("for exit click 3");
		int v = sc.nextInt();
		if(v==1)
			PrintList.printArray(a1);
		else if(v==2)
			Operations.operations(a1);
		else
			System.exit(0);
	}

}
