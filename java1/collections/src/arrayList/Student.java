package arrayList;

public class Student {
	
	
	int rollno;
	String name;
	int marks;
	long phn_no;
	
	public Student()
	{
		
	}
	
	public Student( int rn, String nm, int mks, long phn)
	{
		
		rollno = rn;
		name = nm;
		marks = mks;
		phn_no = phn;
	}
	
	public String toString()
	{
		return rollno+"  "+name+"  "+marks+"  "+phn_no;
	}

}
