package demo1;

public class MyDate {

	int dd, mm, yy;
	
	public MyDate()
	{
		dd=05;
		mm=03;
		yy=2020;		
	}
	
	public MyDate(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	
	public boolean equals(Object obj)
	{		
		MyDate m3 = (MyDate)obj;
		
		if(this.dd==m3.dd && this.mm==m3.mm && this.yy==m3.yy)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		MyDate m1 = new MyDate(01,03,2020);
		MyDate m2 = new MyDate(01,03,2020);
		
		if(m1.equals(m2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}
}
