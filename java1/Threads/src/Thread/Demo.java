package Thread;

public class Demo extends Thread{
	
	public void run()
	{
		if(Thread.currentThread().equals("Thread-0"));
		System.out.println(Thread.currentThread()+"hi");
		if(Thread.currentThread().equals("Thread-1"));
		System.out.println(Thread.currentThread()+"hello");
		
	}
	
	public static void main(String args[])
	{
		Demo s1 = new Demo();
		s1.start();
		Demo s2 = new Demo();
		s2.start();
	}

}
