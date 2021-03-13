package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class PrintList {
	
	public static void printArray(ArrayList a1)
	{
		Iterator it1 = a1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Click 1 for Operation menu");
		System.out.println("Click 2 for Registerin again");
		System.out.println("Click 3 for Exit");
		int m = sc.nextInt();
		if(m==1)
			Operations.operations(a1);
		else if(m==2)
			Insert.insertElements(a1);
		else
			System.exit(0);
	}

}
