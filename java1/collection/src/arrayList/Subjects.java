package arrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class Subjects {
	
	public static void insertSubjects(ArrayList a1)
	{
		String sub;
		
		HashSet ht = new HashSet();
		HashSet hd = new HashSet();
		HashSet hn = new HashSet();
		HashSet hda = new HashSet();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Module for registeration....!!!!");
		
		System.out.println("TESTING....    t");
		System.out.println("DEVELOPMENT....    d");
		System.out.println("NETWORKING....    n");
		System.out.println("DATABASE ADMINISTRATION....    da");
		
		System.out.println("Enter Choice....!!!!!");
		sub = sc.next();
		
		switch(sub)
		{
			
		case "t":
			ht.add("Cucumber");
			ht.add("Automation");
			ht.add("java");
			ht.add("Manual");
			ht.add("selenium");
			
			System.out.println("Subjects under Testing are...");
			System.out.println(ht);
			
			System.out.println("For Registration 1");
			System.out.println("To check module again click 2");
			System.out.println("for exit click 0");
			int t = sc.nextInt();
			if(t==1)
				Insert.insertElements(a1);
			else if(t==2)
			      Subjects.insertSubjects(a1);
			else
				System.exit(0);
			break;
			
		case "d":
			hd.add("java");
			hd.add("c prog");
			hd.add("Python");
			hd.add("Angular");
			hd.add("RWD");
			
			System.out.println("Subjects under Development are...");
			System.out.println(hd);
			
			System.out.println("For Registration 1");
			System.out.println("To check module again click 2");
			System.out.println("for exit click 0");
			int d = sc.nextInt();
			if(d==1)
				Insert.insertElements(a1);
			else if(d==2)
				 Subjects.insertSubjects(a1);
			else
				System.exit(0);
			break;
			
			
		case "n":
			hn.add("Internet protocol");
			hn.add("Networking Services");
			hn.add("Internet Security");
			hn.add("wireless networking..");
			
			System.out.println("Subjects under Networking are...");
			System.out.println(hn);
			
			System.out.println("For Registration 1");
			System.out.println("To check module again click 2");
			System.out.println("for exit click 0");
			int n = sc.nextInt();
			if(n==1)
				Insert.insertElements(a1);
			else if(n==2)
				 Subjects.insertSubjects(a1);
			else
				System.exit(0);
			break;
			
		case "da":
			hda.add("My sql");
			hda.add("Pl sql");
			
			System.out.println("Subjects under DBA are...");
			System.out.println(hda);
			
			System.out.println("For Registration 1");
			System.out.println("To check module again click 2");
			System.out.println("for exit click 0");
			int da = sc.nextInt();
			if(da==1)
				Insert.insertElements(a1);
			else if(da==2)
				 Subjects.insertSubjects(a1);
			else
				System.exit(0);
			break;
			
		}
		
		
		
		
		
	}
	
	

}
