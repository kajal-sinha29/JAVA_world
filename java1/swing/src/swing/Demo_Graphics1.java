package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Demo_Graphics1 extends Frame{
	
	Font f;
	
	public Demo_Graphics1()
	{
		setSize(700,700);
	}
	
	public void paint(Graphics g)
	{
		f = new Font("Times New Roman",Font.ITALIC,50);
		g.setFont(f);
		g.setColor(Color.GREEN);
		g.drawString("Good Afternoon", 50,100);
		g.drawOval(100,300, 90,90);
		g.setColor(Color.MAGENTA);
		g.fillOval(500,300,70,70);
	}

	 public static void main(String args[])
	 {
		 Demo_Graphics1 d = new Demo_Graphics1();
		 d.setVisible(true);
	 }
}
