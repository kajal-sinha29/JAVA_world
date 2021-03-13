package Advjdbcodbc;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Blob_demo extends JFrame{
	
	JButton b1, b2;
	JLabel l1;
	Connection con;
	String url;
	
	public Blob_demo() throws ClassNotFoundException, SQLException
	{
		b1 = new JButton("Insert");
		b2 = new JButton("Display");
		l1 = new JLabel();
		
		add(b1);
		add(b2);
		add(l1);
		
		setLayout (new FlowLayout());
		setVisible(true);
		setSize(1000, 1000);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		url="jdbc:oracle:thin:@localhost:1521:XE";

		con= DriverManager.getConnection(url, "system","root");
		
		b1.addActionListener(new ActionListener()
				{
			
			public void actionPerformed(ActionEvent e)
			{
				PreparedStatement ps;
				try {
					ps = con.prepareStatement("insert into image values(?, ?)");
					ps.setString(1, "tiger");
					FileInputStream fs = new FileInputStream("E:\\tiger.jpg");
					ps.setBinaryStream(2, fs, fs.available());
					int i = ps.executeUpdate();
					JOptionPane.showMessageDialog(Blob_demo.this, i+"   record inserted");
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
				});
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
					ResultSet rs = stmt.executeQuery("select name, image from image");
					rs.last();
					Blob b1 = rs.getBlob(2);
					byte barr[]=b1.getBytes(1, (int)b1.length());
					l1.setIcon(new ImageIcon(barr));
					
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		
	}
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
			Blob_demo d = new Blob_demo();
			d.setVisible(true);
			d.setSize(400, 400);
	}

}
