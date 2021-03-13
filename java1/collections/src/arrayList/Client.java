package arrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Client {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of students you want to input");
		int n = sc.nextInt();
		ArrayList a1 = new ArrayList();
		a1.add(new Student(1, "kajal", 99, 876543));
		a1.add(new Student(10, "jack", 77, 9999999));		
		System.out.println(a1);		
	
		
		System.out.println("After sorting  by roll no..");
		Collections.sort(a1, new SortRollno());
		PrintList.printArray(a1);
		
		System.out.println("After sorting  by Marks..");
		Collections.sort(a1,  new SortMarks());
		PrintList.printArray(a1);
	}

	}


