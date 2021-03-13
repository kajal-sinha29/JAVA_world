package swing;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


  
public class Demo_RadioButton extends JFrame { 
  
     
    JRadioButton jRadioButton1,jRadioButton2; 
    JButton jButton; 
    ButtonGroup G1; 
    JLabel L1; 
  
    public Demo_RadioButton() 
    { 
        this.setLayout(null);    
        jRadioButton1 = new JRadioButton("Under-Graduate");  
        jRadioButton2 = new JRadioButton("Graduate"); 
        jButton = new JButton("Click"); 
        G1 = new ButtonGroup(); 
        L1 = new JLabel("Qualification"); 
      
        jRadioButton1.setBounds(120, 30, 120, 50); 
        jRadioButton2.setBounds(250, 30, 80, 50); 
        jButton.setBounds(125, 90, 80, 30); 
        jButton.setBackground(Color.GREEN);
        L1.setBounds(20, 30, 150, 50);    
     
        this.add(jRadioButton1);   
        this.add(jRadioButton2); 
        this.add(jButton); 
        this.add(L1); 
        
        G1.add(jRadioButton1); 
        G1.add(jRadioButton2); 
        
        jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  String qual = " "; 
				  
	                // If condition to check if jRadioButton2 is selected. 
	                if (jRadioButton1.isSelected()) { 
	  
	                    qual = "Under-Graduate"; 
	                } 
	  
	                else if (jRadioButton2.isSelected()) { 
	  
	                    qual = "Graduate"; 
	                } 
	                else { 
	  
	                    qual = "Please select option !!!"; 
	                } 
	  
	                JOptionPane.showMessageDialog(Demo_RadioButton.this, qual); 
			}
		});
   
    } 
    public static void main(String args[]) 
    { 
    	Demo_RadioButton  f = new Demo_RadioButton();       
        f.setBounds(100, 100, 400, 200);         
        f.setTitle("RadioButtons");        
        f.setVisible(true); 
    } 
} 