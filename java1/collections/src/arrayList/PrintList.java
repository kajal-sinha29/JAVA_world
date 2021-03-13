package arrayList;

import java.util.Iterator;

public class PrintList {
	
	public static void printArray(ArrayList a1)
	{
		Iterator it1 = a1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
	}

}
