package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Search {
	
	
	public static void searchStudent(ArrayList a1)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll no you want to search");
		int r = sc.nextInt();
		
		boolean flag = false;
		
		for(Object ob:a1)
		{
			Student s = (Student)ob;
			
			if(s.rollno == r)
			{
				flag = true;
				break;
			}
		}
		if(flag == true)
			System.out.println("Student found!!!");
		else
			System.out.println("not found!!!!");
	}

}
