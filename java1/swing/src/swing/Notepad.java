package swing;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



import javax.swing.JMenuItem;


public class Notepad extends JFrame{
	
	JMenuBar mbar;
	JMenu filemenu,editmenu,helpmenu,colormenu;
	JMenuItem newmitem, openmitem, savemitem, exitmitem, cutmitem, copymitem, pastemitem,fcolor,bcolor,aboutmitem,helpmitem;
	
	
	JTextArea jt;
	JScrollPane jp;
	JPopupMenu pmenu;
	JMenuItem cutpmenuitem, copypmenuitem,pastepmenuitem;
	
	
	public Notepad()
	{
		setVisible(true);
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initialise();
		
		
		cutmitem.addActionListener(new ActionListener()
				{
			       public void actionPerformed(ActionEvent e)
			       {
			    	   jt.copy();
			       }
				}
				
				);
		
		copymitem.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	jt.paste();
			        }
				});
		
		cutpmenuitem.addActionListener(new ActionListener()
				{
			       public void actionPerformed(ActionEvent e)
			       {
			    	   jt.cut();
			       }
				});
		cutpmenuitem.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				jt.paste();			}
				});
		
		pastepmenuitem.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				jt.paste();
			}
				});
		
		fcolor.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				Color c = JColorChooser.showDialog(Notepad.this, "select fore color", Color.ORANGE);
				jt.setForeground(c);
			}
				}
		);
			
		bcolor.addActionListener(new ActionListener()
				
				{
                         public void actionPerformed(ActionEvent e)
                         {
                        	 Color c = JColorChooser.showDialog(Notepad.this,"Select background Color", Color.YELLOW);
                        	 jt.setBackground(c);
                         }
			
				});
	
		savemitem.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
			JFileChooser jf = new JFileChooser(".");
			int n = jf.showSaveDialog(Notepad.this);
			
			if(n==0)
			{
				saveFile(jf);
			}
				}
	}
				
				);
		
		newmitem.addActionListener(new ActionListener()
				{
			
			public void actionPerformed(ActionEvent e)
			{
				if(!jt.getText().equals(""))
				{
					int n1 = JOptionPane.showConfirmDialog(Notepad.this, "Do you want to save changes to unlimited?");
					
					if(n1==0)
					{
						JFileChooser jf = new JFileChooser(" ");
						int n = jf.showSaveDialog(Notepad.this);
						
						if(n==0)
						{
							saveFile(jf);
							jt.setText(" ");
						}
					}
					else if(n1 ==1)
					{
						jt.setText("");
					}
				}
			}
			
				});
		
		exitmitem.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if(!jt.getText().equals(" "))
				{
					int n1 = JoptionPane.ahowConfirmDialog(Notepad.this,"Do you want to save changes to unlimited?");
					if(n1==0)
					{
						JFileChooser jf = new JFileChooser(".");
						int n = jf.showSaveDialog(Notepad.this);
					
						if(n==0)
						{
							saveFile(jf);
							Notepad.this.dispose();
						}
					}
				
					else if(n1 ==1)
					{
						Notepad.this.dispose();
					}
				}
				Notepad.this.dispose();
			}
				});
		
		aboutmitem.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				AboutDialog a = new AboutDialog();
			}
				});
		
		openmitem.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if(!jt.getText().equals(""))
				{
					int n1 = JOptionPane.showConfirmDialog(Notepad.this, "Do you want to save changes to unlimited?");
					
					if(n1==0)
					{
						JFileChooser jf = new JFileChooser(".");
						int n = jf.showSaveDialog(Notepad.this);
						if(n==0)
						{
							saveFile(jf);
							openFile();
						}
					}
					else if(n1==1)
					{
						openFile();
					}
				}
				else
					openFile();
			}
				}
				
				);
		
		jt.addMouseListener( new MouseAdapter()
				{
			public void mouseReleased(MouseEvent e)
			{
				if(e.isPopupTrigger())
				{
					pmenu.show(e.getComponent(),e.getX(),e.getY());
				}
			}
				});
		
		
	
	}
	
	public void openFile()
	{
	
		JFileChooser j = new JFileChooser(".");
		int val = j.showOpenDialog(Notepad.this);
		{
			if(val==0)
			{
				File f = j.getSelectedFile();
				StringBuffer str = new StringBuffer();
				String s;
				BufferedReader br;
				try
				{
					br = new BufferedReader(new FileReader(f.getAbsolutePath()));
					while((s==br.readLine()) !=null)
					{
						str.append(s);
						str.append("/n");
					}
					jt.setText(str.toString());
					br.close();
				}
				catch(IOException e2)
				{
					e2.printStackTrace();
				}
				Notepad.this.setTitle(f.getName());
			}
		}
	}
		public void saveFile(JFileChooser jf)
		{
			File f = jf.getSelectedFile();
			try
			{
				FileOutputStream fout = new FileOutputStream(f);
				String text = jt.getText();
				fout.write(text.getBytes());
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
		}
		
		public void initialise()
		{
			mbar = new JMenuBar();
			
			filemenu = new JMenu("File");
			editmenu = new JMenu("Edit");
			colormenu = new JMenu("Color");
			helpmenu = new JMenu("help");
			
			newmitem = new JMenuItem("New");
			openmitem = new JMenuItem("open");
			savemitem = new JMenuItem("Exit");
			
			filemenu.add(newmitem);
			filemenu.addSeparator();
			filemenu.add(openmitem);
			filemenu.addSeparator();
			filemenu.add(savemitem);
			filemenu.addSeparator();
			filemenu.add(exitmitem);
			
			
			cutmitem = new JMenuItem("cut");
			copymitem = new JMenuItem("Copy");
			pastemitem = new JMenuItem("paste");
			editmenu.add(cutmitem);
			editmenu.addSeparator();
			editmenu.add(copymitem);
			editmenu.addSeparator();
			editmenu.add(pastemitem);
			
			
			
			fcolor=new JMenuItem("ForeColor");
			bcolor=new JMenuItem("BackColor");
			colormenu.add(fcolor);
			colormenu.add(bcolor);
			
			helpmitem=new JMenuItem("Help");
			aboutmitem=new JMenuItem("About");
			helpmenu.add(helpmitem);
			helpmenu.add(aboutmitem);
			
			mbar.add(filemenu);
			mbar.add(editmenu);
			mbar.add(colormenu);
			mbar.add(helpmenu);
			
			this.setJMenuBar(mbar); // *********** 
			jt=new JTextArea();		
			jp=new JScrollPane(jt);// add textarea inside scrollpane
			this.add(jp); //add scrollpane in frame
			
			
			pmenu=new JPopupMenu();
			cutpmenuitem=new JMenuItem("Cut");
			copypmenuitem=new JMenuItem("Copy");
			pastepmenuitem=new JMenuItem("Paste");
			pmenu.add(cutpmenuitem);
			pmenu.add(copypmenuitem);
			pmenu.add(pastepmenuitem);
			//Note :: do not add JPopupMenu in frame.. because it is mouseevent based
			
		}
		public static void main(String[] args) {
			
			new Notepad(); 
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
