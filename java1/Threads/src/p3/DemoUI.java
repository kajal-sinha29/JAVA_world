package p3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DemoUI extends Frame implements Runnable
{
	// Objects of Thread class
	Thread t1,t2;

	int x1=50,y1=100,x2=500,y2=100;

	public DemoUI() {

		t1=new Thread(this,"tt1");
		t2=new Thread(this,"tt2");
		t1.start();
		t2.start();
	}



	@Override
	public void paint(Graphics g) {

		g.setColor(Color.RED);
	//	g.drawString("Core", x1, y1);			
	//	g.drawString("Java", x2, y2);
		
		g.fillOval(x1, y1, 20, 20);
		
		g.setColor(Color.BLUE);
		g.fillOval(x2, y2, 20, 20);
	}


	@Override
	public void run() {

		int z=1;

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
	public static void main(String[] args) {
		DemoUI d=new DemoUI();
		d.setVisible(true);
		d.setSize(600,400);
		d.setLocation(100,50);
	}




}