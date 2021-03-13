package calculator;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LoginPage extends JFrame implements ActionListener
{
	 JLabel l1, l2;
	 JTextField t1,t2,t3;
	 JButton b1, b2, b3,b4;
	 
	
	public LoginPage()
	{
		this.setLayout(new FlowLayout());
		l1 = new JLabel("First Number");
		t1 = new JTextField(30);
		l2 = new JLabel("second number");
		t2 = new JTextField(30);
		t3 = new JTextField(30);
		b1 = new JButton("ADD");
		b2 = new JButton("SUBTRACT");
		b3 =new JButton("CLEAR");
		b4 = new JButton("Multiplication");
		
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(t3);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1)
		{
		int	a1 = Integer.parseInt(t1.getText());
		int a2 = Integer.parseInt(t2.getText());
		
		int a3 = a1+a2;
		
		t3.setText(String.valueOf(a3));
		}
		
		else if(e.getSource()==b2)
		{
			int a1 = Integer.parseInt(t1.getText());
			int a2 = Integer.parseInt(t2.getText());
			
			int a3 = a1-a2;
			
			t3.setText(String.valueOf(a3));
		}
		
		else if(e.getSource()==b4)
		{
			
			int a1 = Integer.parseInt(t1.getText());
			int a2 = Integer.parseInt(t2.getText());
			
			int a3 = a1*a2;
			
			t3.setText(String.valueOf(a3));
			
          }
		
		else 
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
	
	
	
	public static void main(String args[])
	{
		LoginPage lp = new LoginPage();
		lp.setVisible(true);
		lp.setSize(400,500);
		lp.setTitle("login page");
		lp.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

}
