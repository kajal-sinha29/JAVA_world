package Chap1;

public class Equals {
	
	public static void main(String args[])
	{
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		if(s1==s2)
			System.out.println("String are equal");
		else
			System.out.println("string are not equal");
		
		if(s1.equals(s2))
			System.out.println("String are equal");
		else
			System.out.println("string are not equal");
	}

}
