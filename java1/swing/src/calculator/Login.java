package calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener
{
	//declare controls as a data member
	JLabel l1,l2;
	JTextField t1;
	JPasswordField ps1;
	JButton  b1,b2,b3;



	public Login() {

		//change Layout
		this.setLayout(new FlowLayout());

		//Initialize controls/Objects/data members using new keyword
		l1=new JLabel("Enter Name ");
		l2=new JLabel("Enter Password ");
		t1=new JTextField(20);
		ps1=new JPasswordField(20);
		b1=new JButton("Login");
		b2=new JButton("Clear");
		b3=new JButton("Cancel");



		// add controls on Frame
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(ps1);
		this.add(b1);
		this.add(b2);
		this.add(b3);


		b1.addActionListener(this);
		b2.addActionListener(this);

	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()== b1)
		{

			if(t1.getText().equals("Joy")&& ps1.getText().equals("Joy123"))
				JOptionPane.showMessageDialog(this , "Login Successful ");
			else
				//JOptionPane.showMessageDialog(this , "Invalid Username/Password ");
				JOptionPane.showMessageDialog(this,"Invalid User","Login Status",0);
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			ps1.setText("");
		}

	}

	public static void main(String[] args) {

		Login l=new Login();
		l.setVisible(true);
		l.setSize(400, 500);
		l.setLocation(300, 100);
		l.setTitle("LoginPage");
		l.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}




}
