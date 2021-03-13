public class palindrome
{
	static int i = 121;


public static void main(String args[])
{
	int temp = i;
	int r,sum;
	
	while(i>0)
	{
		r=i%10;
		sum =(sum*10)+r;
		i=i/10;
	}
	if(temp==sum)
	{
		System.out.println("palindrom");
	}
	else 
	{
		System.out.println("not palindrome");
	}
	
}	
	}
	
	
	
}