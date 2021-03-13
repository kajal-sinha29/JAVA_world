package Chap1;

public class StringMethods {
	
	public static void main(String args[])
	{
		
		String name;
		name = "I love java programming 1234";
		
		System.out.println("length of String  "+name.length());
		System.out.println("to lower case = "+name.toLowerCase());
		System.out.println("to upper case ="+name.toUpperCase());
		System.out.println("after removing all the spaces   =  "+name.trim());
		System.out.println("substring after 1st index = "+name.substring(1));
		System.out.println("start index(3) and end index(9) "+name.substring(3,9));
		System.out.println("replace love with hate = "+name.replace("love", "hate"));
		System.out.println(name.startsWith("i l")); //returns false
		System.out.println(name.endsWith("1234"));
		System.out.println(name.charAt(8)); //j
		System.out.println(name.indexOf("p"));
		System.out.println(name.lastIndexOf("m"));
		System.out.println(name.equals("kajal"));//return false

		
	}

}
