package containment;

public class Demo {

	public static void display(int...a)
	{
		for(int x:a)
		{
			System.out.println(x);
		}
	}
	
	public static void main(String args[])
	{
		int[] arr = {2,3,4};
		display(arr);
	}
}
