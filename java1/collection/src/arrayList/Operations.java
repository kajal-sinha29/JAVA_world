package arrayList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
	
	public static void operations(ArrayList a1)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("!!!!!!.....WELCOME TO INSTITUTE......!!!!!!\n");
		 int n=0;
			
			System.out.println();
			System.out.println("OPERATIONS YOU CAN PERFORM....!!!");
			System.out.println("Insert Students.....!!!    0");
			System.out.println("Sorting by roll no...!!!       1");
			System.out.println("Sorting by name...!!!       2");
			System.out.println("Sorting by marks...!!!       3");
			System.out.println("Searching...!!!       4");
			System.out.println("QUIT...!!!!!   5");
			
			System.out.println("Enter your choice");
			n = sc.nextInt();	
			if(n==5)
				System.exit(0);
			else
			{
			switch(n)
			{
			
			case 0:
			    Subjects.insertSubjects(a1);
				PrintList.printArray(a1);
			break;
			
			case 1:
				System.out.println("After sorting  by roll no..");
				Collections.sort(a1, new SortRollno());
				PrintList.printArray(a1);
				break;
				
			case 2:
				System.out.println("Sorting by name...!!!!");
				Collections.sort(a1, new SortName());
				PrintList.printArray(a1);
				
			case 3:
				System.out.println("After sorting  by Marks..");
				Collections.sort(a1,  new SortMarks());
				PrintList.printArray(a1);
				break;
				
			case 4:
			System.out.println("SEARCH!!!!!!!!!....");
			Search.searchStudent(a1);
			break;
			
			case 5:
				System.out.println("QUITING....!!!!");
				System.exit(0);
			}
			}
		
		
		
	}

}
