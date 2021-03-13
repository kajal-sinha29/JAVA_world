package swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class Demo_ListModel extends JFrame{
	
	JTextArea jt;
	JList<String>j1;
	String[] st = {"c","c++","java","php","python","Angular","oracle","javaScript"};
	ListModel j1model;
	
	public Demo_ListModel()
	{
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		
		j1 = new JList(st);
		j1model = j1.getModel();
		
		jt = new JTextArea(10,20);
		
		this.add(j1);
		this.add(jt);
		
		String str = " ";
		
		for(int i = 0;i<j1model.getSize();i++)
		{
			str += "\n"+ " index =  "+i+"  element = "+j1model.getElementAt(i);
			
		}
              jt.setText(str);		
	}
      
	public static void main(String [] args)
	{
		new Demo_ListModel();
	}
}
