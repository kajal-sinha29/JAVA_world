package Thread;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


public class DemoGraphics extends Frame implements Runnable{

	Thread t1,t2;
	int x1=50, y1=100, x2=500, y2=100;
	
	public void DemoGraphics()
	{
		t1 = new Thread(this, "tt1");
		t2 = new Thread(this, "tt2");
		
		t1.start();
		t2.start();
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		//g.drawString("hello", x1, x2);
		//g.drawString("kajal", y1, y2);
		
		g.fillOval(x1, y1, 20, 20);
		g.setColor(Color.BLUE);
		g.fillOval(x2, y2, 20, 20);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int z = 1;
		
		try
		{
			while(z<=210)
			{
				if(Thread.currentThread()==t1)
				{
					Thread.sleep(20);
					x1++;
				}
				if(Thread.currentThread()==t2)
				{
					Thread.sleep(20);
					x2--;
				}
				z++;
				repaint();
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		DemoGraphics d1 = new DemoGraphics();
		d1.setVisible(true);
		d1.setSize(600,400);
		d1.setLocation(100,50);
	}
	

}
